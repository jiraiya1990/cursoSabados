package Clase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class registrationFacebookTest {

    public WebDriver getDriver(String URL){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        return driver;
    }

    //Crear un método de test llamado fullRegistrationTest
    //Ir a Facebook https://www.facebook.com/
    //Completar los campos de registro con los siguientes valores:
    //First Name: “John”
    //Last Name: “Smith”
    //Mobile: “5555555”
    //New Password: “123456789”
    //Birthday: Jun 26 1980
    //Gender: Male

    @Test
    public void fullRegistrationTest() throws InterruptedException {
        WebDriver driver = getDriver("https://www.facebook.com/");
        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Jhon");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("5555555");
        driver.findElement(By.id("password_step_input")).sendKeys("123456789");

        WebElement elementoDias = driver.findElement(By.id("day"));
        Select dias = new Select(elementoDias);
        dias.selectByVisibleText("26");

        WebElement elementoMes = driver.findElement(By.id("month"));
        Select mes = new Select(elementoMes);
        mes.selectByVisibleText("jun");

        WebElement elementoAños = driver.findElement(By.id("year"));
        Select años = new Select(elementoAños);
        años.selectByValue("1980");

        driver.findElement(By.id("u_1_3")).click();




    }


}
