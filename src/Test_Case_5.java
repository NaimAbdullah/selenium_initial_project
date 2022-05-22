import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Test_Case_5 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.getDriver();

        WebElement checkBox = driver.findElement(By.xpath("//label[@data-aid='CONTACT_FORM_EMAIL_OPT_IN']/div"));
        WebElement checkBoxInput = driver.findElement(By.xpath("//label[@data-aid='CONTACT_FORM_EMAIL_OPT_IN']/input"));
        checkBox.click();
        System.out.println(checkBoxInput.isSelected() ? "Checkbox (Select) Validation PASSED" : "Checkbox (Select) Validation FAILED");
        checkBox.click();
        System.out.println(!checkBoxInput.isSelected() ? "Checkbox (Deselect) Validation PASSED" : "Checkbox (Deselect) Validation FAILED");

        Driver.quitDriver();
    }
}
