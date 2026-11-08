package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.sql.DriverManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://automation.co.il/tutorials/selenium/demo1/indexID.html");

        driver.findElement(By.id("firstname")).sendKeys("sari");

        driver.findElement(By.id("lastname")).sendKeys("cubby");

        driver.findElement(By.id("email")).sendKeys("s0524444@gmail.com");

        //        בשביל שהתוכנה תסגר לאחר 5 שניות
        Thread.sleep(5000);

        driver.findElement(By.id("next")).click();

        driver.findElement(By.id("Beginner")).click();

//        בשביל שהתוכנה תסגר לאחר 5 שניות
        Thread.sleep(5000);

        driver.findElement(By.id("next")).click();

        driver.findElement(By.id("streetname")).sendKeys("rashby");
        driver.findElement(By.id("streetnumber")).sendKeys("7");
        driver.findElement(By.id("city")).sendKeys("modiyinyilit");

        Thread.sleep(5000);
        driver.findElement(By.id("finish")).click();

        driver.findElement(By.id("finish")).click();


//        בשביל שהתוכנה תסגר לאחר 5 שניות
        Thread.sleep(5000);

        driver.quit();





    }
}