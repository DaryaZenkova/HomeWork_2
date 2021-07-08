package ru.geekbrains.webuigroup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://crm.geekbrains.space/user/login");

        WebElement loginName = driver.findElement(By.name("_username"));
        loginName.sendKeys("Applanatest1");

        WebElement loginPassword = driver.findElement(By.name("_password"));
        loginPassword.sendKeys("Student2020!");

        WebElement loginButton = driver.findElement(By.name("_submit"));
        loginButton.click();

        String contacts = driver.findElement(By.xpath(".//ul[@class='dropdown-menu menu_level_1']/li[4]/a[@href='/contact/']")).getAttribute("href");
        driver.get(contacts);

        String contactPerson = driver.findElement(By.xpath(".//div[@class='pull-left btn-group icons-holder']/a[@href='/contact/create']")).getAttribute("href");
        driver.get(contactPerson);

        WebElement surname = driver.findElement(By.name("crm_contact[lastName]"));
        surname.sendKeys("Зенкова");

        WebElement contactName = driver.findElement(By.name("crm_contact[firstName]"));
        contactName.sendKeys("Дарья");

        WebElement position = driver.findElement(By.name("crm_contact[jobTitle]"));
        position.sendKeys("Менеджер");

        WebElement organization = driver.findElement(By.xpath(".//div[@id='s2id_crm_contact_company-uid-60e6f8fb2ca83']"));
        organization.click();
        WebElement organizationName = driver.findElement(By.xpath(".//ul[@class='select2-results']/li[10]/div[@class='select2-result-label']"));
        organizationName.click();
    }
}
