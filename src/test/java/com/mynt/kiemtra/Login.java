package com.mynt.kiemtra;

import com.mynt.common.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.mynt.common.CaptureHelper;

import java.lang.reflect.Method;

public class Login extends BaseTest {



    @Test
    public void TestLoginSuccess(Method method){
        CaptureHelper.startRecord(method.getName());
        driver.get("https://cms.anhtester.com/login");
        Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText(), "Welcome to Active eCommerce CMS", "The header of Login page not match. ");
        //Enter email password
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        sleep(1);
        Assert.assertTrue(driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).isDisplayed(), "The Dashboard page not display.");

    }
    @Test(priority = 2)
    public void testLoginFailWithEmailInvalid(Method method){
        driver.get("https://cms.anhtester.com/login");
        CaptureHelper.startRecord(method.getName());
        sleep(1);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mynt@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText(), "Welcome to Active eCommerce CMS", "Login function failed ");
    }
}
