
package demo;

public class BorradorGrande implements Borrador {

    final EGrosor grosor = EGrosor.GRANDE;    //Estado intrínseco - compartido
    private String forma = null;                //Estado extrpinseco - entregado por el cliente

    @Override
    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public void borrar(String contenido) {
        System.out.println("Borrando con borrador " + grosor + " - Forma: " + forma);
        System.out.println(contenido);
        System.out.println(this.hashCode());
    }
}
