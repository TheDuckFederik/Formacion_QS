package web;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import com.google.gson.Gson;


public class MyReaderPlantilla {
    
    public String[] dato(String clavePrueba,int posicion ) throws IOException{

            Reader myReader = Files.newBufferedReader(Paths.get("jugadoresyPuntos.json"));
            Gson gson = new Gson();
            Map<?,Map<?,?>> userMap = gson.fromJson(myReader, Map.class);
            Map<?,?> subMap = userMap.get(clavePrueba);

            Object[] clave = subMap.keySet().toArray();
            String[] claveStrings = new String[posicion];

            for (int i = 0; i < posicion; i++) {
                claveStrings[i] = clave[i].toString();
            }

            return claveStrings;
            
    }

}
