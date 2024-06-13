package com.mynt.kiemtra;

import com.mynt.common.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import com.mynt.common.CaptureHelper;

public class AddNewProduct extends BaseTest {
    @Test
    public void TestAddNewProduct(Method method){
        String productname = "T-shirt";
        CaptureHelper.startRecord(method.getName());
        driver.get("https://cms.anhtester.com/login");
        //Login
        sleep(1);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        //Click Products
        driver.findElement(By.xpath("//span[text()='Products']")).click();
        driver.findElement(By.xpath("//span[text()='Add New Product']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h5[normalize-space()='Add New Product']")).isDisplayed(), "Add New Product not display.");
        //ProductName
        driver.findElement(By.xpath("//input[@placeholder='Product Name']")).sendKeys(productname);
        //Category
        driver.findElement(By.xpath("//div[@id='category']/div")).click();
        sleep(1);
        driver.findElement(By.xpath("//span[normalize-space()='------ Women Clothing & Model']")).click();
        //Brand
        driver.findElement(By.xpath("//div[text()='Select Brand']")).click();
        sleep(1);
        driver.findElement(By.xpath("//span[text()='Demo brand1']")).click();
        //Unit
        driver.findElement(By.xpath("//input[@name='unit']")).sendKeys("3");
        //Weight
        driver.findElement(By.xpath("//input[@name='weight']")).clear();
        sleep(1);
        driver.findElement(By.xpath("//input[@name='weight']")).sendKeys("8");
        //Minimum Purchase Qty
        driver.findElement(By.xpath("//input[@name='min_qty']")).clear();
        sleep(1);
        driver.findElement(By.xpath("//input[@name='min_qty']")).sendKeys("3");
        //Tags
        driver.findElement(By.xpath("//span[@data-placeholder='Type and hit enter to add a tag']")).sendKeys("clothes");
        //Gallery Images
        driver.findElement(By.xpath("//label[text()='Gallery Images ']/following::div[1]")).click();
        sleep(1);
        driver.findElement(By.xpath("//input[@placeholder='Search your files']")).sendKeys("images");
        sleep(2);
        driver.findElement(By.xpath("//div[@title='images.jpg']")).click();
        sleep(1);
        driver.findElement(By.xpath("//button[text()='Add Files']")).click();
        sleep(2);
        //Thumbnail Image
        driver.findElement(By.xpath("//label[text()='Thumbnail Image ']/following::div[1]/div[1]")).click();
        sleep(1);
        driver.findElement(By.xpath("//input[@placeholder='Search your files']")).sendKeys("gio-qua-2");
        sleep(3);
        driver.findElement(By.xpath("(//div[@title='gio-qua-2.jpg'])[1]")).click();
        sleep(1);
        driver.findElement(By.xpath("//button[text()='Add Files']")).click();
        sleep(2);
        //Video Provider
        driver.findElement(By.xpath("//label[text()='Video Provider']/following::div[1]")).click();
        driver.findElement(By.xpath("//span[text()='Dailymotion']")).click();
        sleep(1);
        //Video Link
        driver.findElement(By.xpath("//input[@placeholder='Video Link']")).sendKeys("https://www.youtube.com/?app=desktop&hl=vi");
        //color
        driver.findElement(By.xpath("//input[@name='colors_active']/following-sibling::span")).click();
        sleep(2);
        driver.findElement(By.xpath("//select[@id='colors']/following::button[1]")).click();
        sleep(1);
        driver.findElement(By.xpath("//span[text()='Amethyst']")).click();
        sleep(2);
        //Attributes
        driver.findElement(By.xpath("//input[@value='Attributes']/following::div[1]")).click();
        driver.findElement(By.xpath("//span[text()='Size']")).click();
        driver.findElement(By.xpath("//input[@value='Attributes']")).click();
        sleep(2);
        driver.findElement(By.xpath("//input[@placeholder='Choice Title']/following::div[1]")).click();
        driver.findElement(By.xpath("//span[text()='22']")).click();
        //unit price
        driver.findElement(By.xpath("//input[@placeholder='Unit price']")).sendKeys("8000");
        sleep(2);
        //discount
        driver.findElement(By.xpath("//input[@placeholder='Discount']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Discount']")).sendKeys("5");
        sleep(1);
        driver.findElement(By.xpath("//input[@placeholder='Discount']/following::div[1]")).click();
        driver.findElement(By.xpath("(//span[text()='Percent'])[1]")).click();
        sleep(2);
        //SEO Meta Tags
        driver.findElement(By.xpath("//input[@placeholder = 'Meta Title']")).sendKeys("T-shirt new");
        driver.findElement(By.xpath("//textarea[@name = 'meta_description']")).sendKeys("1. Điều kiện áp dụng . Hàng hoá vẫn còn mới, chưa qua sử dụng, chưa giặt , chưa bỏ mạc thẻ bài. Hàng hoá bị lỗi hoặc hư hỏng do vận chuyển hoặc do nhà sản xuất ...");
        //Xử lý ảnh
//        driver.findElement(By.xpath("//label[text()='Meta Image']/following::div")).click();
//        sleep(1);
//        driver.findElement(By.xpath("//input[@placeholder='Search your files']")).sendKeys("");
//        sleep(2);
//        driver.findElement(By.xpath("")).click();
//        sleep(1);
//        driver.findElement(By.xpath("//button[text()='Add Files']")).click();
//        sleep(2);
        //Low Stock Quantity Warning
        driver.findElement(By.xpath("//input[@name = 'low_stock_quantity']")).sendKeys("3");
        //Stock Visibility State
        driver.findElement(By.xpath("(//label[text() = 'Show Stock With Text Only']/following::span)[1]")).click();
        //Features
        driver.findElement(By.xpath("//input[@name = 'featured']/following::span[1]")).click();
        //Flash Deal
        driver.findElement(By.xpath("//div[text()='Choose Flash Title']")).click();
        sleep(1);
        driver.findElement(By.xpath("//span[normalize-space() = 'Hoa Hồng trắng']")).click();
        driver.findElement(By.xpath("//input[@name = 'flash_discount']")).clear();
        driver.findElement(By.xpath("//input[@name = 'flash_discount']")).sendKeys("15");
        driver.findElement(By.xpath("//label[normalize-space()='Discount Type']/following::div[1]")).click();
        sleep(1);
        driver.findElement(By.xpath("//span[text()='Percent']"));
        //Estimate Shipping Time
        driver.findElement(By.xpath("//input[@placeholder='Shipping Days']")).sendKeys("3");
        sleep(1);
        //Vat & TAX
        driver.findElement(By.xpath("//input[@placeholder='Tax']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Tax']")).sendKeys("8");
        driver.findElement(By.xpath("//div[text()='Flat']")).click();
        sleep(2);
        driver.findElement(By.xpath("(//span[text()='Percent'])[3]")).click();
        sleep(2);
        driver.findElement(By.xpath("//button[text()='Save & Publish']")).click();
        sleep(1);
        Assert.assertTrue(driver.findElement(By.xpath("//span[normalize-space()='Product has been inserted successfully']")).isDisplayed(), "The alert message success not display.");
        //Search
        driver.findElement(By.xpath("//input[@placeholder ='Type & Enter']")).sendKeys(productname);
        sleep(2);
        Assert.assertTrue(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).isDisplayed(), "The Category not display.");
        Assert.assertEquals(driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText(),productname, "The Category Name not match.");
    }
}
