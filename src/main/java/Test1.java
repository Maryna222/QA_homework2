import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
    public static void main(String[] args){
        WebDriver driver = getInitFirefoxDriver();
        LoginPage login = new LoginPage(driver);
        login.login("webinar.test@gmail.com", "Xcg7299bnSmMuRLp9ITw" );

        /*////////////Скрипт Б. Проверка работоспособности главного меню Админ панели//////////
        WebElement email_field1 = driver.findElement(By.id("email"));
        email_field1.sendKeys("webinar.test@gmail.com");

        WebElement pass_field1 = driver.findElement(By.id("passwd"));
        pass_field1.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement button_click1 = driver.findElement(By.name("submitLogin"));
        button_click1.click();

        WebElement menu_item = driver.findElement(By.id("tab-AdminDashboard"));
        menu_item.click();

        Thread.sleep(20);
        WebElement find_title = driver.findElement(By.class("page-title"));
        System.out.println(find_title);*/

    }

    private static WebDriver getInitFirefoxDriver(){
        System.setProperty("webdriver.gecko.driver",Test1.class.getResource("geckodriver.exe").getPath());
        return new FirefoxDriver();
    }



}
