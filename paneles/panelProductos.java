package paneles;

import javax.swing.*;
import java.awt.*;

public class panelProductos extends JPanel {

    public panelProductos() {
        setLayout(new GridLayout(2, 4, 10, 10)); // 2 filas, 4 columnas, 10px de espacio
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Ejemplo: 8 cuadritos
        for (int i = 1; i <= 8; i++) {
            JPanel cuadrito = new JPanel();
            cuadrito.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
            cuadrito.setBackground(Color.WHITE);
            cuadrito.setLayout(new BorderLayout());

            JLabel nombre = new JLabel("Producto " + i, SwingConstants.CENTER);
            cuadrito.add(nombre, BorderLayout.CENTER);

            add(cuadrito);
        }
    }
}
