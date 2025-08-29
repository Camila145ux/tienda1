import javax.swing.*;

import control.TiendaFecher;

import java.awt.*;
import paneles.panelBuscar;
import paneles.panelProductos;
import views.Dashboard;

public class Main {
    public static void main(String[] args) {
        
        try{

            //conlsulta
            String urlApi = "https://jsonplaceholder.typicode.com/posts/99";
            String respuesta = TiendaFecher.obtenerProductos(urlApi);
            System.out.println("respuesta de la API");

            for(int i = 0; i< respuesta.length(); i++) {
                System.out.print(respuesta.charAt(i));
            
            
        }

        } catch (Exception e){
            //TODO:handle exeption
        }
    }
}
