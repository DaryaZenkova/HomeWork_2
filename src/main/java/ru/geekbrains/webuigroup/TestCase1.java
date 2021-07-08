package ru.geekbrains.webuigroup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
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

        String projectsLink = driver.findElement(By.xpath(".//div[@id='main-menu']/ul/li/ul/li[4]/a[@href='/project/my']")).getAttribute("href");
        System.out.println(projectsLink);
        driver.get(projectsLink);

        String createProject = driver.findElement(By.xpath(".//div[@class='pull-right title-buttons-container']/div/div/a[@href='/project/create/']")).getAttribute("href");
        driver.get(createProject);

        WebElement name = driver.findElement(By.name("crm_project[name]"));
        name.sendKeys("Первый проект");

        WebElement organization = driver.findElement(By.xpath(""));
        organization.click();

        WebElement subdivision = driver.findElement(By.xpath(".//select[@name='crm_project[businessUnit]']"));
        subdivision.click();
        WebElement valueSubdivision = driver.findElement(By.xpath(".//select[@name='crm_project[businessUnit]']/option[@value='1']"));
        valueSubdivision.click();

        WebElement curator = driver.findElement(By.name("crm_project[curator]"));
        curator.click();
        WebElement valueCurator = driver.findElement(By.xpath(".//select[@name='crm_project[curator]']/option[@value='93']"));
        valueCurator.click();

        WebElement leader = driver.findElement(By.name("crm_project[rp]"));
        leader.click();
        WebElement valueLeader = driver.findElement(By.xpath(".//select[@name='crm_project[rp]']/option[@value='93']"));
        valueLeader.click();

        WebElement admin = driver.findElement(By.name("crm_project[administrator]"));
        admin.click();
        WebElement valueAdmin = driver.findElement(By.xpath(".//select[@name='crm_project[administrator]']/option[@value='93']"));
        valueAdmin.click();

        WebElement manager = driver.findElement(By.name("crm_project[manager]"));
        manager.click();
        WebElement valueManager = driver.findElement(By.xpath(".//select[@name='crm_project[manager]']/option[@value='93']"));
        valueManager.click();
    }
}
