package paneles;

import javax.swing.*;
import java.awt.*;

public class panelBuscar extends JPanel {

    public JTextField txtBuscar;
    public JButton btnBuscar;

    public panelBuscar() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(180, 750));
        setBackground(Color.YELLOW);

        //titulo
        JLabel TBuscar = new JLabel("Buscar Producto:");
        add(TBuscar, BorderLayout.NORTH);

        //texto
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        inputPanel.setBackground(Color.YELLOW);

        txtBuscar = new JTextField();
        txtBuscar.setPreferredSize(new Dimension(160, 25));
        inputPanel.add(txtBuscar);

        add(inputPanel, BorderLayout.CENTER);
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }
}
