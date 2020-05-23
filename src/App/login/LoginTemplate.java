package login;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginTemplate extends JFrame{

    private JPanel pIzquierda, pDerecha;
    private JLabel lTituloApp;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JComboBox cbTipoUsuario;
    private JCheckBox checkMantenerConexion;
    private JButton bAyuda,bEntrar,bCrearCuenta,bCantSesion,bVers;

    public LoginTemplate(){

        pIzquierda = new JPanel();
        pIzquierda.setSize(400, 730);
        pIzquierda.setLocation(0, 0);
        pIzquierda.setLayout(null);
        pIzquierda.setBackground(Color.WHITE);
        this.add(pIzquierda);

        pDerecha = new JPanel();
        pDerecha.setSize(900, 730);
        pDerecha.setLocation(400, 0);
        pDerecha.setLayout(null);
        pDerecha.setBackground(Color.RED);
        this.add(pDerecha);

        bAyuda = new JButton("?");
        bAyuda.setSize(20, 20);
        bAyuda.setLocation(325, 70);
        pIzquierda.add(bAyuda);

        lTituloApp = new JLabel("Inicia sesión con tu cuenta de Rito");
        lTituloApp.setSize(284, 47);
        lTituloApp.setLocation((pIzquierda.getWidth()-lTituloApp.getWidth())/2, 170);
        lTituloApp.setForeground(Color.black);
        pIzquierda.add(lTituloApp);

        tNombreUsuario = new JTextField("Nombre usuario");
        tNombreUsuario.setSize(284, 47);
        tNombreUsuario.setLocation((pIzquierda.getWidth()-tNombreUsuario.getWidth())/2, 280);
        tNombreUsuario.setForeground(Color.DARK_GRAY);
        tNombreUsuario.setBackground(new Color(237, 237, 237));
        tNombreUsuario.setCaretColor(Color.BLUE);
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pIzquierda.add(tNombreUsuario);
        
        tClaveUsuario = new JPasswordField();
        tClaveUsuario.setSize(284, 47);
        tClaveUsuario.setLocation((pIzquierda.getWidth()-tClaveUsuario.getWidth())/2, 344);
        tClaveUsuario.setText("Contraseña");
        tClaveUsuario.setForeground(Color.DARK_GRAY);
        tClaveUsuario.setBackground(new Color(237, 237, 237));
        //tClaveUsuario.setCaretColor(Color.BLUE);
        tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pIzquierda.add(tClaveUsuario);

        checkMantenerConexion = new JCheckBox("Permanecer conectado");
        checkMantenerConexion.setSize(283, 30);
        checkMantenerConexion.setLocation(56, 410);
        checkMantenerConexion.setFocusable(false);
        checkMantenerConexion.setForeground(new Color(194, 194, 194));
        checkMantenerConexion.setBackground(Color.WHITE);
        pIzquierda.add(checkMantenerConexion);

        cbTipoUsuario = new JComboBox();
        cbTipoUsuario.addItem("Administrador");
        cbTipoUsuario.addItem("Cajero");
        cbTipoUsuario.addItem("Cliente");
        cbTipoUsuario.setSize(250, 20);
        cbTipoUsuario.setLocation((pIzquierda.getWidth()-cbTipoUsuario.getWidth())/2, 450);
        cbTipoUsuario.setForeground(Color.GRAY);
        cbTipoUsuario.setBackground(new Color(237, 237, 237));
        ((JLabel) cbTipoUsuario.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        pIzquierda.add(cbTipoUsuario);

        bEntrar = new JButton("Entrar");
        bEntrar.setSize(100, 47);
        bEntrar.setLocation((pIzquierda.getWidth()-bEntrar.getWidth())/2, 486);
        bEntrar.setBackground(new Color(209, 54, 57));
        bEntrar.setFocusable(false);
        bEntrar.setEnabled(false);
        pIzquierda.add(bEntrar);

        bCrearCuenta = new JButton("CREAR UNA CUENTA");
        bCrearCuenta.setSize(165, 14);
        bCrearCuenta.setLocation(50, 640);
        pIzquierda.add(bCrearCuenta);

        bCantSesion = new JButton("¿NO PUEDES INICIAR SESIÓN?");
        bCantSesion.setSize(165, 14);
        bCantSesion.setLocation(50, 654);
        pIzquierda.add(bCantSesion);

        bVers = new JButton("V20.3.0");
        bVers.setSize(55, 14);
        bVers.setLocation(290, 654);
        pIzquierda.add(bVers);

        this.setSize(1300, 730);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(this);
        this.setLayout(null);
        this.setUndecorated(true);
        this.setTitle("Login de Usuario");
        this.setVisible(true);
    }
}