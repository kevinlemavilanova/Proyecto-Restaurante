package restaurante;
import java.util.ArrayList;
import restaurante.Comida;

public class Pedido {
    int n_mesa;
    ArrayList<Comida> primerPlato;
    ArrayList<Comida> segundoPlato;
    ArrayList<Comida> postre;
    ArrayList<Comida> bebida;
    float precioPedido;

    public Pedido() {
        
    }
    

    public void escogerPrimerPlato(Comida c) {
        primerPlato.add(c);
    }
    
    public void escogerSegundoPlato(Comida c) {
        segundoPlato.add(c);
    }
    
    public void escogerPostre(Comida c) {
        postre.add(c);
    }
    
    public void escogerebida(Comida c) {
        bebida.add(c);
    }
    
    public void añadirPedido(Pedido p){
        Principal.TotalPedidos.add(p);
    }

    @Override
    public String toString() {
        return "Pedido{" + "n_mesa=" + n_mesa + ", primerPlato=" + primerPlato + ", segundoPlato=" + segundoPlato + ", postre=" + postre + ", bebida=" + bebida + ", precioPedido=" + precioPedido + '}';
    }
    
    
    
    ///////////////////////////////////////////////Setters y Getters////////////////////////////////////////////////////////
    public int getN_mesa() {
        return n_mesa;
    }

    public void setN_mesa(int n_mesa) {
        this.n_mesa = n_mesa;
    }

    public ArrayList getPrimerPlato() {
        return primerPlato;
    }

    public void setPrimerPlato(ArrayList primerPlato) {
        this.primerPlato = primerPlato;
    }

    public ArrayList getSegundoPlato() {
        return segundoPlato;
    }

    public void setSegundoPlato(ArrayList segundoPlato) {
        this.segundoPlato = segundoPlato;
    }

    public ArrayList getPostre() {
        return postre;
    }

    public void setPostre(ArrayList postre) {
        this.postre = postre;
    }

    public ArrayList getBebida() {
        return bebida;
    }

    public void setBebida(ArrayList bebida) {
        this.bebida = bebida;
    }

    public float getPrecioPedido() {
        return precioPedido;
    }

    public void setPrecioPedido(float precioPedido) {
        this.precioPedido = precioPedido;
    }



}
