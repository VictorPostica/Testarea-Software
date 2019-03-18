import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/User/Desktop/TS/SITE/Index.html");
        Thread.sleep(1000);
        driver.findElement(By.id("username")).sendKeys("victor");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("victor123");
        Thread.sleep(1000);
        driver.findElement(By.id("submit")).click();

         try {
            driver.findElement(By.id("submit"));
            System.out.println("Logarea s-a realizat cu succes");
        } catch (NoSuchElementException x) {
            System.out.println("Eroare logare");
        }
    }
}