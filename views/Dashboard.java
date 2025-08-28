package views;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

import paneles.panelBuscar;
import paneles.panelProductos;

public class Dashboard extends JFrame {

    public Dashboard(String ListaDeProductos) {
        setTitle("Tienda en Java");
        setSize(1000, 600); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel PadrePanel = new JPanel(new BorderLayout());
        PadrePanel.setBorder(new LineBorder(Color.RED, 2));

        panelBuscar buscador = new panelBuscar();
        PadrePanel.add(buscador, BorderLayout.WEST);

        panelProductos productos = new panelProductos(ListaDeProductos); 
        PadrePanel.add(productos, BorderLayout.CENTER);

        this.add(PadrePanel);
        this.setVisible(true);
    }
}
