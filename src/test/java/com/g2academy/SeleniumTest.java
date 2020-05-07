package com.g2academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://www.youtube.com/");

        WebElement inputSearch = driver.findElement(By.name("search_query"));
        inputSearch.click();
        inputSearch.sendKeys("Selenium Tutorial");

        WebElement buttonSearh = driver.findElement(By.id("search-icon-legacy"));
        buttonSearh.click();

        Thread.sleep(2000);

        driver.quit();
    }
}
