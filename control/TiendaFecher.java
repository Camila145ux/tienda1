package control;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TiendaFecher{
    public static String obtenerProductos(String urlApi){

        //crea un string (texto) con mas opciones
        StringBuilder resultado = new StringBuilder();

        //objeto para crear conexion HTTP
        HttpURLConnection conexion = null;
        

        try {

            //crear un String a una URL
            URL url = new URL (urlApi);

            //Configuracion para la conexion HTTP
            conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.setConnectTimeout(5000);
            conexion.setReadTimeout(5000);
            conexion.connect();

            //verificar respuesta del servidor
            int code = conexion.getResponseCode();
            System.out.println(code);

            try (BufferedReader br = new BufferedReader(new InputStreamReader(conexion.getInputStream(), StandardCharsets.UTF_8)))

            {String linea;
                while ((linea = br.readLine()) != null) {
                    resultado.append(linea).append("/n ");
                 }
            }

        }catch(Exception e){
            System.out.println("Error" + e);
        }finally{
            if(conexion != null) conexion.disconnect();
        }

        return resultado.toString();
    }
}