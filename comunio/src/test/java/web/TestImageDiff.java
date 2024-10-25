package  web;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import io.qameta.allure.Attachment;


class TestImageDiff {

    @Test
    public void testSingleImageAttachment(String rutaString) throws IOException {
        // Lee la imagen desde el sistema de archivos como bytes
        byte[] imageBytes = Files.readAllBytes(Paths.get("ruta/a/tu/imagen/imagen.png"));

        // Adjuntar la imagen al reporte de Allure
        attachImage("Captura de pantalla", imageBytes);
    }

    // Método para adjuntar la imagen en Allure
    @Attachment(value = "{imageName}", type = "image/png")
    public byte[] attachImage(String imageName, byte[] imageBytes) {
        return imageBytes;  // Retorna la imagen como un arreglo de bytes para que Allure la adjunte
    }
}