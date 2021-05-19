package demo;

public class DemoCliente {

    public static void main(String[] args) {

        Borrador borradorCirculoGrande = BorradorFactory.getBorradorGrande("Circulo");  
        borradorCirculoGrande.borrar("Hello World se borro con el borrador de circulo!");
        
        System.out.println("Hash de objeto: " + borradorCirculoGrande.getClass().getName() + " " + borradorCirculoGrande.hashCode()+ " \n");
        
        Borrador borradorTrianguloMediano = BorradorFactory.getBorradorMediano("Triangulo");  
        borradorTrianguloMediano.borrar("Hello World se borro con el borrador de triangulo!");
        
        System.out.println("Hash de objeto: " + borradorTrianguloMediano.getClass().getName() + " " + borradorTrianguloMediano.hashCode()+ " \n");
    
        Borrador borradorCuadradoPequeño = BorradorFactory.getBorradorPequeño("Cuadrado");  
        borradorCuadradoPequeño.borrar("Hello World se borro con el borrador de cuadrado!");
        
        System.out.println("Hash de objeto: " + borradorCuadradoPequeño.getClass().getName() + " " + borradorCuadradoPequeño.hashCode()+ " \n");
    }
}
