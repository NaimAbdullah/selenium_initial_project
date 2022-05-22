import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Test_Case_3 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        WebElement heading2 = driver.findElement(By.xpath("//h2[@data-aid='CONTACT_SECTION_TITLE_REND']/span"));
        System.out.println(heading2.getText().equals("Contact Us") ? "Heading 2 validation PASSED" : "Heading 2 validation FAILED");

        WebElement heading4 = driver.findElement(By.xpath("//h4[@data-aid='CONTACT_FORM_TITLE_REND']"));
        System.out.println(heading4.getText().equals("SEND US A MESSAGE") ? "Heading 4 validation PASSED" : "Heading 4 validation FAILED");

        Driver.quitDriver();
    }
}
