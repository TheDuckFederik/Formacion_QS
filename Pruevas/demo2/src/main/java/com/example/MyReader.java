package com.example;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import com.google.gson.Gson;


public class MyReader {
    
    public String dato(String clavePrueva,String clave ) throws IOException{

            Reader myReader = Files.newBufferedReader(Paths.get("data.json"));
            Gson gson = new Gson();
            Map<?,Map<?,?>> userMap = gson.fromJson(myReader, Map.class);
            Map<?,?> subMap = userMap.get(clavePrueva);
            String valor = subMap.get(clave).toString();

            return valor;
    }

}
