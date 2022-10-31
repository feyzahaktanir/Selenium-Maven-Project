package day_05_mavenProjeOlusturma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_FirstMavenClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //1-https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/");

        //2-arama kutusunu locate edelim.
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        //3-"Samsung headphones" ile arama yapalım.
//        searchBox.sendKeys("Samsung headphones");
//        searchBox.submit();

        searchBox.sendKeys("Samsung headphones"+ Keys.ENTER);

        //4-Bulunan sonuç sayısını yazdıralım.
        System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText());

        //5-ilk ürüne tıklayalım
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

        //6-Bir önceki sayfaya dönüp, sayfadaki tüm başlıkları yazdıralım.
        driver.navigate().back();
        List <WebElement> titles = driver.findElements(By.xpath("//a[@class='a-link-normal s-navigation-item']"));
        System.out.println("Sayfadaki başlık sayısı: " + titles.size());

        driver.close();

    }
}
