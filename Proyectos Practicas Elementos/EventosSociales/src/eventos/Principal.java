
package eventos;

import guis.MenuForm;
/**
 * Clase principal del programa.
 */
public class Principal {
/**
 * Metodo main principak
 * @param args Argumentos
 */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuForm().setVisible(true);
            }
        });
    }
}
