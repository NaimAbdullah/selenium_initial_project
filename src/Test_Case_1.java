import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Test_Case_1 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        WebElement comfyLogo = driver.findElement(By.xpath("//*[@id='n-48560']"));
        System.out.println(comfyLogo.isDisplayed() ? "Comfy Logo validation PASSED" : "Comfy Logo validation FAILED");

        WebElement heading2 = driver.findElement(By.id("dynamic-tagline-48605"));
        System.out.println(heading2.getText().equals("High quality comfy pillows and accessories for travel, office and home.") ? "Heading 2 validation PASSED" : "Heading 2 validation FAILED");

        Driver.quitDriver();
    }
}
