package base.paneles;

import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 * Clase usada para agregar atajos de teclado a los formularios
 *
 * @author Omar Paché
 * @author Cristián Alarcón de la Maza
 */
public class AtajoDeTeclado {

    private final JPanel panel;

    public AtajoDeTeclado(JPanel panel) {
        this.panel = panel;
    }

    public void agregarAtajoBotonNuevo(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK), "Nuevo"
        );
        panel.getActionMap().put("Nuevo", accion);
    }

    public void agregarAtajoBotonModificar(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_MASK), "Modificar"
        );
        panel.getActionMap().put("Modificar", accion);
    }

    public void agregarAtajoBotonEliminar(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK), "Eliminar"
        );
        panel.getActionMap().put("Eliminar", accion);
    }

    public void agregarAtajoBotonDescartar(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK), "Descartar"
        );
        panel.getActionMap().put("Descartar", accion);
    }

    public void agregarAtajoBotonMas(Action accion) {
        panel.getInputMap(JComponent.WHEN_FOCUSED).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, 0), "Mas"
        );
        panel.getActionMap().put("Mas", accion);
    }

    public void agregarAtajoBotonAgregar(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0), "Agregar"
        );
        panel.getActionMap().put("Agregar", accion);
    }

    public void agregarAtajoBotonMenos(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, 0), "Menos"
        );
        panel.getActionMap().put("Menos", accion);
    }

    public void agregarAtajoBotonQuitar(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0), "Quitar"
        );
        panel.getActionMap().put("Quitar", accion);
    }

    public void agregarAtajoBotonAprobar(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK), "Aprobar"
        );
        panel.getActionMap().put("Aprobar", accion);
    }

    public void agregarAtajoBotonRechazar(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK + InputEvent.ALT_MASK), "Rechazar"
        );
        panel.getActionMap().put("Rechazar", accion);
    }

    public void agregarAtajoBotonCancelar(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK), "Cancelar"
        );
        panel.getActionMap().put("Cancelar", accion);
    }

    public void agregarAtajoBotonAgregarTodo(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ADD, InputEvent.CTRL_MASK), "AgregarTodo"
        );
        panel.getActionMap().put("AgregarTodo", accion);
    }

    public void agregarAtajoBotonQuitarTodo(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, InputEvent.CTRL_MASK), "QuitarTodo"
        );
        panel.getActionMap().put("QuitarTodo", accion);
    }

    public void agregarAtajoBotonRefrescar(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK), "Refrescar"
        );
        panel.getActionMap().put("Refrescar", accion);
    }

    public void agregarAtajoBotonGuardar(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK), "Guardar"
        );
        panel.getActionMap().put("Guardar", accion);
    }

    public void agregarAtajoBotonBorrador(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_MASK), "Borrador"
        );
        panel.getActionMap().put("Borrador", accion);
    }

    /**
     *
     * @param accion
     * @param jTable
     */
    public void agregarAtajoEnterTabla(Action accion, JTable jTable) {
        jTable.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "Enter");
        jTable.getActionMap().put("Enter", accion);
    }

    public void agregarAtajoBotonContinuarPanel(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "Continuar"
        );
        panel.getActionMap().put("Continuar", accion);
    }

    public void agregarAtajoBotonEnterPanel(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "Enter");
        panel.getActionMap().put("Enter", accion);
    }

    public void agregarAtajoBotonImprimir(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK), "Imprimir"
        );
        panel.getActionMap().put("Imprimir", accion);
    }

    /**
     * Se agrega el atajo de teclado para que al presionar la tecla escape, se cierre la venta actual.
     */
    public void agregarAtajoSalirDialog() {
        AbstractAction accion = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                // Cerrar ventana actual
                ((JDialog) panel.getParent().getParent().getParent()).dispose();
            }
        };
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
                "cerrar ventana"
        );
        panel.getActionMap().put("cerrar ventana", accion);
    }

    /**
     * Se agrega el atajo de teclado para que al presionar la tecla escape, pregunta si esta seguro antes de cerrar.
     *
     * @param existenCambios
     */
    public void agregarAtajoSalirDialogCondicion(boolean existenCambios) {
        AbstractAction accion = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (existenCambios) {
                    if (JOptionPane.showConfirmDialog(
                            panel,
                            "¿Está seguro(a) que desea cerrar el panel?",
                            "Confirmación", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        // Cerrar ventana actual
                        ((JDialog) panel.getParent().getParent().getParent()).dispose();
                    }
                } else {
                    ((JDialog) panel.getParent().getParent().getParent()).dispose();
                }
            }
        };
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
                "cerrar ventana"
        );
        panel.getActionMap().put("cerrar ventana", accion);
    }

    /**
     * Se agrega el atajo de teclado para que al presionar la tecla escape, se cierre la venta actual
     */
    public void agregarAtajoSalirFrame() {
        Action accion = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                // Cerrar ventana actual
                ((JFrame) panel.getParent().getParent().getParent()).dispose();
            }
        };
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
                "cerrar ventana"
        );
        panel.getActionMap().put("cerrar ventana", accion);
    }

    public void agregarAtajoIrAfiltro(JTextField txtFiltro) {
        Action accion = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                txtFiltro.requestFocusInWindow();
            }
        };
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK), "Ir a Filtro");
        panel.getActionMap().put("Ir a Filtro", accion);
    }

    public void agregarAtajoBajarDesdeFiltro(JTable tabla, JTextField txtFiltro) {
        Action accion = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (tabla.getRowCount() > 0) {
                    tabla.requestFocusInWindow();
                    tabla.setRowSelectionInterval(0, 0);
                }
            }
        };
        txtFiltro.getInputMap(JComponent.WHEN_FOCUSED).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, InputEvent.CTRL_MASK), "Bajar desde Filtro");
        txtFiltro.getInputMap(JComponent.WHEN_FOCUSED).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "Bajar desde Filtro");
        txtFiltro.getActionMap().put("Bajar desde Filtro", accion);
    }
}