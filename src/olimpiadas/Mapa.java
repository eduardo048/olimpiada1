
package olimpiadas;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author eduar
 */
public class Mapa {
    private int tama�o;
    private int numCarreteraVer;
    private int numCarreteraOri; 
    private int numeroVehiculo;
    private ArrayList<Carretera> carreteras;
    
    public Mapa() {
    }

    public Mapa(int tama�o, int numeroVehiculo, int numeroCarreteras ) {
        this.tama�o = tama�o;
        this.numeroVehiculo = numeroVehiculo;
        this.carreteras = new ArrayList<>();
        calcularCarretera(numeroCarreteras);
    }
    
    private void calcularCarretera(int numeroCarreteras){
        this.numCarreteraOri=numeroCarreteras/2;
        this.numCarreteraVer=numeroCarreteras/2;
    }
    
    private void generarCarreteras(){
        Random random = new Random();
        //Generamos las carreteras verticales
        for(int i = 1; i<=this.numCarreteraVer;i++){
            int longitud = random.nextInt(this.tama�o);
        }
    }
    
    
    
    
    
    
    
}