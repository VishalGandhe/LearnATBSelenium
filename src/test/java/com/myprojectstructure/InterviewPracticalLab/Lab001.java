package com.myprojectstructure.InterviewPracticalLab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab001 {



        //1.Get Row and Column values from an HTML WebTable
        public static void main(String[] args) {


            WebDriver driver= new ChromeDriver();
            driver.get("https://www.w3schools.com/html/html_tables.asp");

            int rowCount = driver.findElements(By.xpath("//table [@id=\"customers\"]//tr")).size();
            int columnCount= driver.findElements(By.xpath("//table [@id=\"customers\"]//th")).size();


            for(int i=1; i<rowCount;i++){
                for(int j=1; j<=columnCount; j++)
                {
                    String actValue= driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
                    if(actValue.equals("Francisco Chang")){
                        System.out.println(i+ " : " +j);
                    }
                }

            }



        }


    }


