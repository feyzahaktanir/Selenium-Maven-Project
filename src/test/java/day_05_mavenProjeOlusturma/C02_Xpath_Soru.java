package day_05_mavenProjeOlusturma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath_Soru {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // 1. http://zero.webappsecurity.com sayfasına gidin.
        driver.get("http://zero.webappsecurity.com");

        // 2. Sign in butonuna tıklayın.
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();

        // 3. Login alanına "username" yazdırın
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");


        // 4. Password alanına "password" yazdırın
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");

        // 5. Sign in butonuna tıklayın.
        driver.findElement(By.name("submit")).click();
        driver.get("http://zero.webappsecurity.com");

        // 6. Pay Bills sayfasına gidin.


        // 7. amount kısmına yatırmak istediğiniz herhangi bir miktarı yazın


        // 8. tarih kısmına "2020-09-10" yazdırın


        // 9. Pay butonuna tıklayın


        // 10. "The payment by successfully submitted." mesajının çıktığını kontrol edin.


        //driver.close();
    }
}
