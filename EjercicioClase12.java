package Clase4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EjercicioClase12 {
    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test(priority = 3)
    public void LoginFailureTest(){
        driver.get("https://login.salesforce.com/?locale=eu");
        WebElement logo = driver.findElement(By.id("logo"));
        System.out.println("el nombre del logo es: " + logo.getTagName());

        driver.findElement(By.id("username")).sendKeys("test@test.com");
        driver.findElement(By.id("password")).sendKeys("123466");
        driver.findElement(By.id("Login")).click();

        WebElement mensajeError = driver.findElement(By.xpath("//*[contains(text(),'Your access to salesforce.com has been disabled')]"));
        System.out.println(mensajeError.getText());








    }

}
