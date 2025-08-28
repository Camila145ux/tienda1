import javax.swing.*;

import control.TiendaFecher;

import java.awt.*;
import paneles.panelBuscar;
import paneles.panelProductos;
import views.Dashboard;

public class Main {
    public static void main(String[] args) {
        
        new Dashboard("Pan,Leche,Queso,Café,Azúcar,Arroz,Frijoles,Aceite");
        try{

            //conlsulta
            String urlApi = "https://jsonplaceholder.typicode.com/posts";
            String respuesta = TiendaFecher.obtenerProductos(urlApi);
            System.out.println("respuesta de la API");

            for(int i = 0; i< respuesta.length(); i++) {
            String letra ="" + respuesta.charAt(i);
            if (letra.equalsIgnoreCase("}")) {
                System.out.println(respuesta.charAt(i));
            }
            
        }

        } catch (Exception e){
            //TODO:handle exeption
        }
    }
}
