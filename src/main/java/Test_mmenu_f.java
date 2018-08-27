package org.openqa.selenium.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_mmenu_f {
    public static void main (String[] args){
        WebDriver driver = getInitFirefoxDriver();
       // driver.get("http://google.com");
        driver.manage().window().maximize();
        //driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        driver.navigate().to("http://google.com");

       //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.get("https://mail.ukr.net/desktop/login");

        /*WebElement email_field = newdriver.findElement(By.id("email"));
        email_field.sendKeys("webinar.test@gmail.com");

        WebElement pass_field = newdriver.findElement(By.id("passwd"));
        pass_field.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement button_click = newdriver.findElement(By.name("submitLogin"));
        button_click.click();*/
        //System.out.println("Hello world");

    }

    public static WebDriver getInitFirefoxDriver(){
        System.setProperty("webdriver.gecko.driver",Test_mmenu_f.class.getResource("geckodriver.exe").getPath());
        return new FirefoxDriver();
    }

}

