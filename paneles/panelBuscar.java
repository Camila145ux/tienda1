package paneles;

import javax.swing.*;
import java.awt.*;

public class panelBuscar extends JPanel {

    public JTextField txtBuscar;
    public JButton btnBuscar;

    public panelBuscar() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        txtBuscar = new JTextField(20);
        btnBuscar = new JButton("Buscar");

        add(new JLabel("Buscar Producto:"));
        add(txtBuscar);
        add(btnBuscar);
    }
}
