package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class errors {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://automation.co.il/tutorials/selenium/demo1/indexID.html");
//        שאלה 1
  //בדית שגיאה
//        driver.findElement(By.id("firstname")).sendKeys("sari");
//
//        driver.findElement(By.id("lastname")).sendKeys("!!");
//
//        driver.findElement(By.id("email")).sendKeys("!!rerr");
//
//
//        driver.findElement(By.id("next")).click();
//
//        String arr1 =driver.findElement(By.id("lastname-error")).getText();
//        if (arr1.equals("Please enter at least 3 characters.")){
//            System.out.println("ההודעה תקינה");
//        }
//        else {
//            System.out.println("ההודעה לא תקינה");      }
//
//        String arr2 =driver.findElement(By.id("email-error")).getText();
//        if (arr2.equals("Please enter a valid email address.")){
//            System.out.println("ההודעה תקינה");
//        }
//        else {
//            System.out.println("ההודעה לא תקינה");      }
//
//








//        שאלה 2
        driver.findElement(By.id("firstname")).sendKeys("sari");

        driver.findElement(By.id("lastname")).sendKeys("cubby");

        driver.findElement(By.id("email")).sendKeys("s0524444@gmail.com");

        driver.findElement(By.id("next")).click();

//        String tab2 =driver.findElement(By.className("moving-tab")).getText();
//
//        if (tab2.equals("Account")){
//            System.out.println("שגיאה");
//        }
//        else {
//            System.out.println(" הגעתה לטאב 2");      }
        //        בשביל שהתוכנה תסגר לאחר 5 שניות
//        Thread.sleep(3000);

   driver.findElement(By.id("Beginner")).click();

//        בשביל שהתוכנה תסגר לאחר 5 שניות

     driver.findElement(By.id("next")).click();

        driver.findElement(By.id("streetname")).sendKeys("rashby");
        driver.findElement(By.id("streetnumber")).sendKeys("7");
        driver.findElement(By.id("city")).sendKeys("modiyinyilit");

//        Thread.sleep(5000);
        driver.findElement(By.id("finish")).click();




////        בשביל שהתוכנה תסגר לאחר 5 שניות
        Thread.sleep(1000);



        String mesgreen=driver.findElement(By.className("cta-title")).getText();

        if (mesgreen.equals("הטופס הזה הוא רק טופס דוגמה")){
            System.out.println("כל הכבוד הצלחת להריץ את התרגיל ");
        }
        else {
            System.out.println("חבל נסה שנית ");      }

        driver.findElement(By.id("Finish")).click();

        driver.quit();


       


    }
}