package olimpiadas;

import java.util.ArrayList;
import java.util.Random;
import simulador.Carretera;
/**
 *
 * @author eduar
 */
public class GeneradorAleatorio {
    public static ArrayList<Carretera> generarCarreteras(int tama�o, int  numCarreteras){
        ArrayList<Carretera> carreteras = new ArrayList<>();
        Random rand = new Random();
        
        for(int i=0; i<numCarreteras; i++){
            Carretera carretera = new Carretera(tama�o);
            carretas.add(carretera);
        }
        return carreteras;   
    }
    
}
