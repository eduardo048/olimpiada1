
package olimpiadas;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author eduar
 */
public class Mapa {
    private int tamaño;
    private int numCarreteraVer;
    private int numCarreteraOri; 
    private int numeroVehiculo;
    private ArrayList<Carretera> carreteras;
    
    public Mapa() {
    }

    public Mapa(int tamaño, int numeroVehiculo, int numeroCarreteras ) {
        this.tamaño = tamaño;
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
            int longitud = random.nextInt(this.tamaño);
        }
    }
    
    
    
    
    
    
    
}