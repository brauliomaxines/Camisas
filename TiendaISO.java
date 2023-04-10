/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaiso;
/**
 *
 * @author Braulio
 */

public class TiendaISO {
    private int cantidadCamisaCorta;
    private int cantidadCamisaCasual;
    private int cantidadCamisaFormal;
    private double precioCamisaCorta = 190;
    private double precioCamisaCasual = 230;
    private double precioCamisaFormal = 310;

    public TiendaISO(int cantidadCamisaCorta, int cantidadCamisaCasual, int cantidadCamisaFormal) {
        this.cantidadCamisaCorta = cantidadCamisaCorta;
        this.cantidadCamisaCasual = cantidadCamisaCasual;
        this.cantidadCamisaFormal = cantidadCamisaFormal;
    }

    public double calcularSubtotal() {
        double subtotal = cantidadCamisaCorta * precioCamisaCorta
                + cantidadCamisaCasual * precioCamisaCasual
                + cantidadCamisaFormal * precioCamisaFormal;
        return subtotal;
    }

    public double calcularDescuento() {
        int cantidadTotal = cantidadCamisaCorta + cantidadCamisaCasual + cantidadCamisaFormal;
        double descuento = 0;
        if (cantidadTotal >= 3 && cantidadTotal <= 5) {
            descuento = 0.05;
        } else if (cantidadTotal > 5) {
            descuento = 0.08;
        }
        return descuento * calcularSubtotal();
    }

    public double calcularTotal() {
        return calcularSubtotal() - calcularDescuento();
    }

    public static void main(String[] args) {
        TiendaISO tienda = new TiendaISO(2, 3, 4);
        double subtotal = tienda.calcularSubtotal();
        double descuento = tienda.calcularDescuento();
        double total = tienda.calcularTotal();
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total: " + total);
    }
}
