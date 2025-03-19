
package olimpiadas;

/**
 *
 * @author eduar
 */
public class Mapa {
    private int tamaño;
    private int numCarreteraVer;
    private int numCarreteraOri; 
    private int cruces;
    private int numeroVehiculo;

    public Mapa() {
    }

    public Mapa(int tamaño, int numeroVehiculo ) {
        this.tamaño = tamaño;
        
        this.numeroVehiculo = numeroVehiculo;
    }
    
    public void calcularCarretera(int numeroCarreteras){
        
        this.numCarreteraOri=numeroCarreteras/2;
        this.numCarreteraVer=numeroCarreteras/2;
    }
    
    
    
    
    
    
    
    
}
