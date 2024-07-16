package Assignment1;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyName {
    @Test
    @Owner("Hari")
    @Severity(SeverityLevel.NORMAL)
    @Description("TC#1 - Verify Username")
    public void LoginTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys("vwo@1secmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Vwo@1234");
        driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(5000);
        String username = driver.findElement(By.xpath("//span[contains(@data-qa,'lufexuloga')]")).getText();
        System.out.println(username);
        Assert.assertEquals("V W",username);
        driver.quit();



    }
}
