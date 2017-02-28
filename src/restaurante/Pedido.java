/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Pedido {
    int n_mesa;
    ArrayList primerplato = new ArrayList();
    ArrayList segundoplato = new ArrayList();
    ArrayList postre = new ArrayList();
    ArrayList bebida = new ArrayList();

    public Pedido() {
    }
    
    public void escogerPrimerPlato(Comida c) {
        primerplato.add(c);
    }
    
    public void escogerSegundoPlato(Comida c) {
        segundoplato.add(c);
    }
    
    public void escogerPostre(Comida c) {
        postre.add(c);
    }
    
    public void escogerebida(Comida c) {
        bebida.add(c);
    }
    
}
