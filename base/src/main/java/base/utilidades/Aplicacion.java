package base.utilidades;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JDialog;
import org.apache.log4j.Logger;

/**
 * Clase encargada de centrar y mostrar una ventana.
 *
 * @author Omar Paché
 */
public class Aplicacion {

    private static final Logger LOG = Logger.getLogger(Aplicacion.class);

    // Entorno grafico
    public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public void show(JDialog dialogo, boolean centrar) {
        LOG.info("abriendo ventana: " + dialogo.getName());

        if (centrar) {
            centrarVentana(dialogo);
            dialogo.pack();
        }

        dialogo.setVisible(true);
    }

    public static void centrarVentana(Window ventana) {
        if (screenSize.width < ventana.getPreferredSize().width) {
            ventana.setPreferredSize(new Dimension(screenSize.width - 50, ventana.getPreferredSize().height));
        }

        int x = (screenSize.width - ventana.getPreferredSize().width) / 2;
        int y = (screenSize.height - ventana.getPreferredSize().height) / 2;

        ventana.setLocation(x, y);
    }

}
