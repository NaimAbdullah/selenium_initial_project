import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Test_Case_4 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        WebElement fName = driver.findElement(By.xpath("//label[text()='First Name*']"));
        WebElement lName = driver.findElement(By.xpath("//label[text()='Last Name*']"));
        WebElement email = driver.findElement(By.xpath("//label[text()='Email*']"));

        WebElement fNameInput = driver.findElement(By.xpath("//input[@data-aid='First Name']"));
        WebElement lNameInput = driver.findElement(By.xpath("//input[@data-aid='Last Name']"));
        WebElement emailInput = driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL']"));
        WebElement messageInput = driver.findElement(By.xpath("//textarea[@placeholder='Message*']"));

        fNameInput.sendKeys("Naim");
        lNameInput.sendKeys("Abdullah");
        emailInput.sendKeys("123@gmail.com");
        messageInput.sendKeys("Hello World!");

        System.out.println(fName.getText().equals("First Name*") ? "First name label validation PASSED" : "First name label validation FAILED");
        System.out.println(lName.getText().equals("Last Name*") ? "Last name label validation PASSED" : "Last name label validation FAILED");
        System.out.println(email.getText().equals("Email*") ? "Email label validation PASSED" : "Email label validation FAILED");
        System.out.println(messageInput.getAttribute("placeholder").equals("Message*") ? "Message label validation PASSED" : "Message label validation FAILED");

        System.out.println(fNameInput.isDisplayed() ? "First name input box displayed PASSED" : "First name input box displayed FAILED");
        System.out.println(lNameInput.isDisplayed() ? "Last name input box displayed PASSED" : "Last name input box displayed FAILED");
        System.out.println(emailInput.isDisplayed() ? "Email input box displayed PASSED" : "Email input box displayed FAILED");
        System.out.println(messageInput.isDisplayed() ? "Message input box displayed PASSED" : "Message input box displayed FAILED");

        System.out.println(fNameInput.getAttribute("value").equals("Naim") ? "First name sendKeys PASSED" : "First name sendKeys FAILED");
        System.out.println(lNameInput.getAttribute("value").equals("Abdullah") ? "Last name sendKeys PASSED" : "Last name sendKeys FAILED");
        System.out.println(emailInput.getAttribute("value").equals("123@gmail.com") ? "Email sendKeys PASSED" : "Email sendKeys FAILED");
        System.out.println(messageInput.getText().equals("Hello World!") ? "Message sendKeys PASSED" : "Message sendKeys FAILED");

        Driver.quitDriver();
    }
}
