package Clase4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngSalesforce {
    public static final  String SALESFORCE_URL = "https://login.salesforce.com/";
    public WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=eu");


        //driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    //Crear un método llamado validateSalesforceLogoTest
    //El test debe mostrar el tagName del id logo en pantalla y su atributo “alt’
    //El orden de prioridad de este test, debe ser 1

    @Test (priority = 1)
    public void validateSalesforceLogoTest(){


        WebElement logo = driver.findElement(By.id("logo"));
        System.out.println(logo.getTagName());
        System.out.println(logo.getAttribute("alt"));
    }

    //Crear un método llamado RememberMeIsSelected
    //Ingresar al sitio: https://login.salesforce.com/?locale=eu
    //Hacer click en el botón de Remember me
    //Validar que el checkbox está seleccionado
    //El orden de prioridad de este test, debe ser 4

    @Test (priority = 4)
    public void rememberMeIsSelected() throws InterruptedException {
        Thread.sleep(3000);
        WebElement rememberMe = driver.findElement(By.id("rememberUn"));
        rememberMe.click();
        Assert.assertTrue(rememberMe.isSelected());






    }



    @AfterMethod
    public void close(){
        //driver.close();
    }


}
