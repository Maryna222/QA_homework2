import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
    public static void main(String[] args){
        WebDriver driver = getInitFirefoxDriver();

        

    }

    public static WebDriver getInitFirefoxDriver(){
        System.setProperty("webdriver.gecko.driver",Test1.class.getResource("geckodriver.exe").getPath());
        return new FirefoxDriver();
    }



}
