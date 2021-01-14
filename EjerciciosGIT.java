package Clase3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EjerciciosGIT {

    //Crear un método llamado spotifyByPlaceHolder
    //Ingresar al sitio: https://www.spotify.com/uy/signup/
    //Completar todos los campos con Css Selector placeholder

    public WebDriver getDriver(String URL){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        return driver;
    }

    @Test

    public void spotifyByPlaceHolder(){
        WebDriver driver = getDriver("https://www.spotify.com/uy/signup/");
        driver.findElement(By.cssSelector("input[placeholder='Introduce tu correo electrónico.']")).sendKeys("gaston.t90@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("gaston.t90@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Crea una contraseña.']")).sendKeys("123456789");
        driver.findElement(By.cssSelector("input[placeholder='Introduce un nombre de perfil.']")).sendKeys("jiraiya1990");
        driver.findElement(By.cssSelector("input[placeholder='DD']")).sendKeys("16");

        WebElement elemento = driver.findElement(By.xpath("//select[@name='month']"));
        Select mes = new Select(elemento);
        mes.selectByVisibleText("Julio");

        driver.findElement(By.cssSelector("input[placeholder='AAAA']")).sendKeys("1990");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/form/div[6]/div[2]/label[1]/span[1]")).click();    







    }

}
