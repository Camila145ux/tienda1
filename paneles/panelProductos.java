package paneles;

import javax.swing.*;
import java.awt.*;

public class panelProductos extends JPanel {

    public panelProductos(String ListaDeProductos) {

        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Productos:");
        titulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(titulo, BorderLayout.NORTH);

        JPanel grid = new JPanel(new GridLayout(2, 4, 10, 10));
        String[] productos = ListaDeProductos.split(",");

        for (String nombre : productos) {
            JPanel producto = new JPanel();
            producto.setPreferredSize(new Dimension(100, 100));
            producto.setBorder(BorderFactory.createLineBorder(Color.RED));
            producto.add(new JLabel(nombre.trim()));
            grid.add(producto);
        }

        add(grid, BorderLayout.CENTER);
    }
}
