package base.paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.text.JTextComponent;
import org.jdesktop.swingx.prompt.PromptSupport;

/**
 * Panel base para que los demás hereden de esta
 *
 * @author Omar Paché
 */
public class PanelBase extends JPanel {

    /**
     * Cerrar ventana actual
     */
    protected void cerrarVentana() {
        ((JDialog) this.getParent().getParent().getParent()).dispose();
    }

    /**
     * Limita la escritura en las entradas de texto solo a números.
     *
     * @param evt evento al presionar una tecla
     */
    protected void limitarAsoloNumeros(KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }

    /**
     * Limita la escritura en las entradas de texto solo a números, comas y
     * puntos.
     *
     * @param evt evento al presionar una tecla
     */
    protected void limitarAdecimales(KeyEvent evt) {
        int key = (int) evt.getKeyChar();
        if (key > 57 || key < 48) {
            if (key != 46 && key != 44) {
                evt.consume();
            }
        }
    }

    /**
     * Limita la escritura en las entradas de texto solo a números, puntos,
     * guiones y letra k.
     *
     * @param evt evento al presionar una tecla
     */
    protected void limitarAcaracteresRut(KeyEvent evt) {
        int key = (int) evt.getKeyChar();
        if (key > 57 || key < 48) { //digitos
            if (key != 46 && key != 45) { // punto y guion
                if (key != 107) { //letra k
                    evt.consume();
                }
            }
        }
    }

    /**
     * Transforma el carácter digitado a mayúscula.
     *
     * @param evt evento al presionar una tecla (keytyped)
     */
    protected void letraAmayuscula(KeyEvent evt) {
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
    }

    /**
     * Evalúa si se presionó la tecla enter.
     *
     * @param evt evento al presionar una tecla
     * @return true si se presiono, false de lo contrario
     */
    protected boolean sePresionoTeclaEnter(KeyEvent evt) {
        int key = evt.getKeyCode();
        return (key == KeyEvent.VK_ENTER);
    }

    /**
     * Evalúa si se presionó una flecha.
     *
     * @param evt evento al presionar una tecla
     * @return true si se presiono una flecha, false de lo contrario
     */
    protected boolean sePresionoFlecha(KeyEvent evt) {
        int key = evt.getKeyCode();
        return key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT;
    }

    /**
     * Deshabilita en una entrada de texto el pegar desde el porta papeles con
     * Ctrl + V o con el clic derecho del mouse. -> Pegar
     *
     * @param campo componente de entrada de texto en donde se desea
     * deshabilitar el porta papeles
     */
    protected void deshabilitarPortapapeles(JTextComponent campo) {
        campo.setTransferHandler(null);
    }

    /**
     * Asigna un placeholder a una entrada de texto.
     *
     * @param campo componente de entrada de texto a utilizar
     * @param texto texto a usar como placeholder
     */
    protected void setPlaceholder(JTextComponent campo, String texto) {
        PromptSupport.setPrompt(texto, campo);
        PromptSupport.setFontStyle(Font.BOLD, campo);
    }

    /**
     * Pinta de color rojo los labels que corresponden a error.
     *
     * @param componentes labels a marcar
     */
    public void pintarRojoLabel(JLabel... componentes) {
        for (JLabel componente : componentes) {
            componente.setForeground(Color.red);
        }
    }

    /**
     * Pinta de color rojo textField.
     *
     * @param componentes textField a marcar
     */
    public void pintarRojoText(JTextComponent... componentes) {
        for (JTextComponent componente : componentes) {
            componente.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
    }

    /**
     * Pinta de color negro los labels.
     *
     * @param componentes labels a marcar
     */
    public void setCamposSinError(JLabel... componentes) {
        for (JLabel componente : componentes) {
            componente.setForeground(Color.BLACK);
        }
    }

    /**
     * Pinta de color negro textField.
     *
     * @param componentes textField a marcar
     */
    public void pintarTextSinError(JTextComponent... componentes) {
        for (JTextComponent componente : componentes) {
            componente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        }
    }

    /**
     * Hace invisibles a un grupo de elementos.
     *
     * @param componentes elementos a ocultar
     */
    protected void hacerInvisibles(JComponent... componentes) {
        for (JComponent componente : componentes) {
            componente.setVisible(false);
        }
    }

    /**
     * Hace visibles a un grupo de elementos.
     *
     * @param componentes elementos a mostrar
     */
    protected void hacerVisibles(JComponent... componentes) {
        for (JComponent componente : componentes) {
            componente.setVisible(true);
        }
    }

    /**
     * Deshabilitar a un grupo de elementos.
     *
     * @param componentes elementos a ocultar
     */
    protected void deshabilitar(JComponent... componentes) {
        for (JComponent componente : componentes) {
            componente.setEnabled(false);
        }
    }

    /**
     * Habilitar un grupo de elementos.
     *
     * @param componentes elementos a mostrar
     */
    protected void habilitar(JComponent... componentes) {
        for (JComponent componente : componentes) {
            componente.setEnabled(true);
        }
    }

    /**
     * Lleva el foco al elemento recibido.
     *
     * @param componente elementos para dejar el foco
     */
    public void dejarFocoEn(JComponent componente) {
        componente.requestFocusInWindow();
    }

    /**
     * Centra los datos de tipo DateTime para una columna de una de una tabla.
     *
     * @param tabla tabla de la cual se desea ordenar sus columnas
     * @param columna índice de la columna de la tabla que se requiere ordenar
     * (comienza con el 0)
     */
    public void centrarColumnaFecha(JTable tabla, int columna) {
        ((DefaultTableCellRenderer) tabla.getColumnModel().getColumn(columna).getCellRenderer())
                .setHorizontalAlignment(SwingConstants.CENTER);
    }

    /**
     * Centra los datos para una columna de una de una tabla. Soporta enteros y
     * texto.
     *
     * @param tabla tabla de la cual se desea ordenar sus columnas
     * @param columna índice de la columna de la tabla que se requiere ordenar
     * (comienza con el 0)
     */
    public final void centrarColumna(JTable tabla, int columna) {
        if (tabla != null) {
            DefaultTableCellRenderer tcrCentrado = new DefaultTableCellRenderer();
            tcrCentrado.setHorizontalAlignment(SwingConstants.CENTER);
            tabla.getColumnModel().getColumn(columna).setCellRenderer(tcrCentrado);
        }
    }

    /**
     * Centrar los datos de un JTextField.
     *
     * @param txtField texto a centrar
     */
    public void centrarTexto(JTextField txtField) {
        if (txtField != null) {
            txtField.setHorizontalAlignment(SwingConstants.CENTER);
        }
    }

    /**
     * Alinear a la derecha los datos para una columna de una de una tabla.
     * Soporta enteros y texto.
     *
     * @param tabla tabla de la cual se desea ordenar sus columnas
     * @param columna índice de la columna de la tabla que se requiere ordenar
     * (comienza con el 0)
     */
    public void alinearDerechaColumna(JTable tabla, int columna) {
        DefaultTableCellRenderer tcrCentrado = new DefaultTableCellRenderer();
        tcrCentrado.setHorizontalAlignment(SwingConstants.RIGHT);
        tabla.getColumnModel().getColumn(columna).setCellRenderer(tcrCentrado);
    }

    /**
     * Alinear a la derecha los datos para una columna de una de una tabla.
     * Soporta enteros y texto.
     *
     * @param tabla tabla de la cual se desea ordenar sus columnas
     * @param columna índice de la columna de la tabla que se requiere ordenar
     * (comienza con el 0)
     */
    public void alinearIzquierdaColumna(JTable tabla, int columna) {
        DefaultTableCellRenderer tcrCentrado = new DefaultTableCellRenderer();
        tcrCentrado.setHorizontalAlignment(SwingConstants.LEFT);
        tabla.getColumnModel().getColumn(columna).setCellRenderer(tcrCentrado);
    }

    /**
     * Restringe el numero de caracteres ingresado al máximo recibido.
     *
     * @param evt evento al presionar una tecla (keytyped)
     * @param componente componente de entrada de texto a utilizar
     * @param largoMaximo
     */
    protected void limitarLargo(KeyEvent evt, JTextComponent componente, int largoMaximo) {
        if (componente.getText().length() == largoMaximo) {
            evt.consume();
        }
    }

    /**
     * Restringe los números y caracteres especiales, solo deja ingresar letras
     * y tildes.
     *
     * @param evt evento al presionar una tecla
     */
    protected void limitarAletras(KeyEvent evt) {
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            evt.consume();
        }

        if (Character.isSpaceChar(c)) {
            evt.consume();
        }

        if (!Character.isUnicodeIdentifierPart(c)) {
            evt.consume();
        }
    }

    /**
     * Restringe los números y caracteres especiales, solo deja ingresar letras,
     * tildes y espacios.
     *
     * @param evt evento al presionar una tecla
     */
    protected void limitarNombreApellido(KeyEvent evt) {
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            evt.consume();
        }

        if (!Character.isUnicodeIdentifierPart(c)) {
            if (c != ' ') {
                evt.consume();
            }
        }
    }

    /**
     * Restringe los caracteres especiales, solo deja ingresar letras, tildes y
     * números.
     *
     * @param evt evento al presionar una tecla
     */
    protected void limitarAletrasNumeros(KeyEvent evt) {
        char c = evt.getKeyChar();

        if (!Character.isUnicodeIdentifierPart(c)) {
            evt.consume();
        }
    }

    /**
     * Evalúa si se hizo doble clic con el botón derecho del mouse.
     *
     * @param evt evento al hacer clic con el mouse
     * @return true, si hizo doble clic
     */
    protected boolean hizoDobleClic(MouseEvent evt) {
        return (evt.getButton() == 1 && evt.getClickCount() == 2);
    }

    /**
     * Habilita el ordenamiento en las tablas pinchando en el nombre de las
     * columnas.
     *
     * @param txtFiltro campo de texto que representa al filtro a aplicar en un
     * tabla
     */
    protected void habilitarOrdenamiento(JTextField txtFiltro) {
        txtFiltro.setText("1");
        txtFiltro.setText("");
    }

    protected void reducirEncabezadoTabla(JTable tabla) {
        tabla.getTableHeader().setFont(new Font("Deja Vu Sans", Font.PLAIN, 10));
    }
}
