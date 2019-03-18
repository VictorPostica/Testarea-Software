import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String... args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://worldofwatches.com");

        Thread.sleep(3000);
        driver.findElement(By.id("close-button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("ui-id-5")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/ol/li[10]/a")).click();


        List<WebElement> elements = driver.findElements(By.className("product-item-name")); //pentru a prinde toate elementele web în listă
        List<String> allElements = new ArrayList<String>();                                 //lista contine toate elementele web // daca vrei sa obtineti toate elementele text in lista de tabele

        List<WebElement> priceList = driver.findElements(By.className("price-wrapper"));
        List<String> allPriceList = new ArrayList<String>();

        for (int i = 0; i < priceList.size(); i++) {

            //incarcarea textului fiecarul element in array
            allElements.add(elements.get(i).getText());
            allPriceList.add(priceList.get(i).getText());

            //afisarea in cons.
            System.out.println(elements.get(i).getText());
            System.out.println(priceList.get(i).getText());
            System.out.println();
        }
        System.out.println("Elemente pe pagina: " + allPriceList.size());
        System.out.println("Pretul minim: " + Collections.min(allPriceList));
    }
}
