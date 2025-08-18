import javax.swing.*;
import java.awt.*;
import paneles.panelBuscar;
import paneles.panelProductos;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tienda");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setLayout(new BorderLayout());

        panelBuscar buscarPanel = new panelBuscar();
        frame.add(buscarPanel, BorderLayout.WEST);

        panelProductos productosPanel = new panelProductos();
        frame.add(productosPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
