package restaurante;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author nina
 */
public class Funciones {

    public void seleccionarProducto(ArrayList<Comida> lista, Comida comida, DefaultListModel modelo) {
        int aux = 0;
        if (lista.size() > 0) {
            for (Comida c : lista) {
                if (c.getNombre().equals(comida.getNombre())) {
                    c.setCantidad(c.getCantidad() + 1);
                    break;
                } else {
                    aux++;
                }
                if (aux == lista.size()) {
                    comida.setCantidad(comida.getCantidad() + 1);
                    lista.add(comida);
                    break;
                }
            }
        } else {
            comida.setCantidad(comida.getCantidad() + 1);
            lista.add(comida);
        }
        modelo.removeAllElements();
        for (Comida c : lista) {
            modelo.addElement(c.getCantidad() + "x   " + c.getNombre());
        }
    }

    public void cargarLista(ArrayList<Comida> lista, DefaultListModel modelo) {
        modelo.removeAllElements();
        for (Comida c : lista) {
            modelo.addElement(c.getCantidad() + "x   " + c.getNombre());
        }    
    }
}
