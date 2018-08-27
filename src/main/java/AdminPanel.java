import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPanel {
    public AdminPanel(WebDriver driver) {
        this.driver = driver;
    }

   /* public void printRefrash (WebDriver driver) {
        System.out.println("Page title is: " + driver.getTitle());
        driver.navigate().refresh();
    }*/

    private WebDriver driver;

    public void loginnew(String login, String password) {
        this.driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        driver.findElement(By.id("email")).sendKeys(login);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.name("submitLogin")).click();
        driver.findElement(By.id("tab-AdminDashboard")).click();
        driver.findElement(By.className("page-title"));
        System.out.println("Page title is: " + driver.getTitle());
        driver.navigate().refresh();
        driver.findElement(By.id("subtab-AdminParentOrders")).click();
        System.out.println("Page title is: " + driver.getTitle());
        driver.navigate().refresh();
        driver.findElement(By.id("subtab-AdminCatalog")).click();
        System.out.println("Page title is: " + driver.getTitle());
        driver.navigate().refresh();
        //Thread.sleep(200);
        driver.findElement(By.id("subtab-AdminParentCustomerThreads")).click();
        System.out.println("Page title is: " + driver.getTitle());
        driver.navigate().refresh();
        driver.findElement(By.id("subtab-AdminStats")).click();
        System.out.println("Page title is: " + driver.getTitle());
        driver.navigate().refresh();
        driver.findElement(By.id("subtab-AdminParentModulesSf")).click();
        System.out.println("Page title is: " + driver.getTitle());
        driver.navigate().refresh();
        driver.findElement(By.id("subtab-AdminParentThemes")).click();
        System.out.println("Page title is: " + driver.getTitle());
        driver.navigate().refresh();
        driver.findElement(By.id("subtab-AdminParentShipping")).click();
        System.out.println("Page title is: " + driver.getTitle());
        driver.navigate().refresh();
        driver.findElement(By.id("subtab-AdminParentPayment")).click();
        System.out.println("Page title is: " + driver.getTitle());
        driver.navigate().refresh();
        driver.findElement(By.id("subtab-AdminInternational")).click();
        System.out.println("Page title is: " + driver.getTitle());
        driver.navigate().refresh();
        driver.findElement(By.id("subtab-ShopParameters")).click();
        System.out.println("Page title is: " + driver.getTitle());
        driver.navigate().refresh();
        driver.findElement(By.id("subtab-AdminAdvancedParameters")).click();
        System.out.println("Page title is: " + driver.getTitle());
        driver.navigate().refresh();
    }
}
