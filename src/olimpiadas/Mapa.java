
package olimpiadas;

/**
 *
 * @author eduar
 */
public class Mapa {
    private int tama�o;
    private int numCarreteraVer;
    private int numCarreteraOri; 
    private int cruces;
    private int numeroVehiculo;

    public Mapa() {
    }

    public Mapa(int tama�o, int numeroVehiculo, int numeroCarreteras ) {
        this.tama�o = tama�o;
        calcularCarretera( numeroCarreteras);
        this.numeroVehiculo = numeroVehiculo;
    }
    
    public void calcularCarretera(int numeroCarreteras){
        
        this.numCarreteraOri=numeroCarreteras/2;
        this.numCarreteraVer=numeroCarreteras/2;
    }
    
    
    
    
    
    
    
    
}
