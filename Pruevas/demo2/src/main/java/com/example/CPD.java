package com.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class CPD {

    public List<String[]> Datos()throws CsvException, FileNotFoundException, IOException{
        String archivoCSV = "demo2\\CP001Datos.txt";
        
            CSVReader csvReader = new CSVReader(new FileReader(archivoCSV));

            List<String[]> datosCSV = csvReader.readAll();

            csvReader.close();

            return datosCSV;
    }
}
