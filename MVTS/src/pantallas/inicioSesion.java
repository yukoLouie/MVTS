package pantallas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class inicioSesion extends JFrame implements ActionListener {
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;

    public inicioSesion() {
        // Maximizar ventana
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        // setUndecorated(true); // Opcional: quitar bordes de la ventana

        // Configurar layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        // Título "MVTS"
        JLabel titleLabel = new JLabel("MVTS");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 48));
        titleLabel.setForeground(new Color(139, 69, 19)); // Marrón
        gbc.anchor = GridBagConstraints.CENTER;
        add(titleLabel, gbc);

        // Campo de texto para el usuario
        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(10, 10, 80, 25);
        add(userLabel, gbc);

        userField = new JTextField(20);
        userField.setBounds(100, 10, 160, 25);
        add(userField, gbc);

        // Campo de contraseña
        JLabel passLabel = new JLabel("Contraseña:");
        passLabel.setBounds(10, 40, 80, 25);
        add(passLabel, gbc);

        passField = new JPasswordField(20);
        passField.setBounds(100, 40, 160, 25);
        add(passField, gbc);

        // Botón de inicio de sesión
        loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(100, 70, 160, 25);
        loginButton.addActionListener(this);
        add(loginButton, gbc);

        // Mostrar ventana
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String usuario = userField.getText();
        char[] contraseña = passField.getPassword();

        // Aquí deberías verificar las credenciales del usuario
        if (usuario.equals("user") && String.valueOf(contraseña).equals("123")) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
               // Ocultar la ventana actual de inicio de sesión
        this.setVisible(false);
        
        // Crear y mostrar la pantalla MapaInteractivo
        mapa Mapa = new mapa();
        Mapa.setVisible(true);
            // Aquí puedes ocultar esta ventana y mostrar la siguiente pantalla del sistema
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
        }
    }

    public static void main(String[] args) {
        new inicioSesion();
    }
}
