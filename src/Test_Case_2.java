import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Test_Case_2 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        WebElement heading1 = driver.findElement(By.xpath("//span[text()='Connect With Us']"));
        System.out.println(heading1.getText().equals("Connect With Us") ? "Heading 1 validation PASSED" : "Heading 1 validation FAILED");

        WebElement facebookLink = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_FACEBOOK_LINK']"));
        System.out.println(facebookLink.getAttribute("href").equals("https://www.facebook.com/103179127717601") ? "Facebook link validation PASSED" : "Facebook link validation FAILED");

        WebElement facebookIcon = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_FACEBOOK_LINK']/*/*"));
        System.out.println(facebookIcon.isDisplayed() ? "Facebook logo validation PASSED" : "Facebook logo validation FAILED");

        WebElement instaLink = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_INSTAGRAM_LINK']"));
        System.out.println(instaLink.getAttribute("href").equals("https://www.instagram.com/comfyelite") ? "Instagram link validation PASSED" : "Instagram link validation FAILED");

        WebElement instaIcon = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_INSTAGRAM_LINK']/*/*"));
        System.out.println(instaIcon.isDisplayed() ? "Instagram logo validation PASSED" : "Instagram logo validation FAILED");

        Driver.quitDriver();
    }
}
