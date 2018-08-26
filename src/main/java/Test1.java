import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
    public static void main(String[] args){
        WebDriver driver = getInitFirefoxDriver();

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        WebElement email_field = driver.findElement(By.id("email"));
        email_field.sendKeys("webinar.test@gmail.com");

        WebElement pass_field = driver.findElement(By.id("passwd"));
        pass_field.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement button_click = driver.findElement(By.name("submitLogin"));
        button_click.click();


        WebElement admin_avatar = driver.findElement(By.id("employee_infos"));
        admin_avatar.click();

        WebElement logot_elem = driver.findElement(By.id("header_logout"));
        logot_elem.click();
    }

    public static WebDriver getInitFirefoxDriver(){
        System.setProperty("webdriver.gecko.driver",Test1.class.getResource("geckodriver.exe").getPath());
        return new FirefoxDriver();
    }



}
