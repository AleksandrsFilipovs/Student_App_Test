import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_object.AddStudentPage;
import page_object.AllStudentsPage;
import page_object.Notifications;

import java.time.Duration;

import static Constants.AllConstants.GenderConstants.MALE;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class StudentAppTest {

    WebDriver driver;
    WebDriverWait driverWait;

    Faker dataFaker = new Faker();
    AllStudentsPage allStudentsPage;

    AddStudentPage addStudentPage;
    Notifications notifications;

    private final String APP_URL = "http://app.acodemy.lv/";

    @BeforeMethod
    public void initialize () {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(APP_URL);
        allStudentsPage =new AllStudentsPage(driver);
        addStudentPage = new AddStudentPage(driver);
        notifications = new Notifications(driver);

    }
    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test(description = "Add student and check successful message")
    public void openStudentApp() {

        allStudentsPage.waitAndClickOnAddStudentButton();
        String name = addStudentPage.waitAndSetValueForNameField();
        addStudentPage.waitAndSetValueForEmailField();
        addStudentPage.waitAndSetGender(MALE);
        addStudentPage.clickOnSubmitButton();

        assertEquals(notifications.getMessageFromNotification(), "Student successfully added");
        assertEquals(notifications.getDescriptionFromNotification(), name + " was added to the system");

        notifications.getPopUpCloseButton().click();
        assertTrue(driverWait.until(ExpectedConditions.invisibilityOf(notifications.getPopUpCloseButton())));
    }
}
