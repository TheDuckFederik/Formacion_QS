package com.example;

import java.io.IOException;

import org.testng.annotations.Test;

import com.opencsv.exceptions.CsvException;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
public class Buy extends Main{
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void BuyPlayer() throws InterruptedException, IOException, CsvException {

        testId = "BuyPlayer";
        
        //CASO DE Prueba 001
        try{       

           
            
        } catch(Exception e){
            e.printStackTrace();
        }finally{
            driver.quit();
        }
    }
}
