package com.shubh.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.*;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

class WebScraper {
        private static final String DB_URL =" jdbc:postgresql://localhost:5432/scraper";
       private static final String DB_USER = "postgres";
        private static final String DB_PASSWORD = "postgres#123";
        private static final String CHROME_DRIVER_PATH = "C:\\Users\\gupta\\Downloads\\chromedriver-win64\\chromedriver-win64";


        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter State : ");
                String stateInput = sc.nextLine();
                System.out.println("Enter APMC : ");
                String apmcInput = sc.nextLine();
                System.out.println("State chosen : ");
                System.out.println("Apmc choses : ");
                System.setProperty("webdriver.chrome.driver",CHROME_DRIVER_PATH);

                WebDriver driver = new ChromeDriver();

                try{
                        driver.get("https://enam.gov.in/web/dashboard/trade-data");

                }
                catch(Exception e ){
                        e.printStackTrace();
                }
                finally{
                        driver.quit();
                }


        }
}
