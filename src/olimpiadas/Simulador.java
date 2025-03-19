package olimpiadas;

import java.util.ArrayList;

/**
 * Clase que maneja la simulación del tráfico con vehículos.
 * Se encarga de inicializar el mapa, generar carreteras y vehículos,
 * ejecutar la simulación y actualizar el estado del mapa en cada ciclo.
 */

public class Simulador {
    private Mapa mapa;
    private ArrayList<Vehiculo> vehiculos;
    private boolean estaEjecucion;

    public Simulador(int tamaño, int numCarreteras, int numVehiculos) {
        this.mapa =  new Mapa(tamaño, numCarreteras);
        this.vehiculos = vehiculos;
        this.vehiculos = new ArrayList<>();
        
        //Generar vehiculos en posiciones aletorias sobre la carretera
        for(int i=0; i<numVehiculos; i++){
            vehiculos.add(new Vehiculo(i+1, mapa));
        }
        
        //Agregar los vehiculos al mapa
        mapa.agregarVehiculos(vehiculos); 
    }
    
    //Inicializa el simulador
    public void iniciar(){
        estaEjecucion= true;
        System.out.println("\nINICIANDO EL SIMULADOR DE CARRETERA\n");
        
        while(estaEjecucion){
            mapa.mostrarMapa();
            mapa.actualizarVehiculos();
            esperar(1000);
        }
    }
    
    //Detiene el simulador
    public void detener(){
        estaEjecucion = false;
        System.out.println("\nSIMULADOR DETENIDO\n");
    }
    
    //Método auxiliar para pausar la ejecución durante un número determinado de milisegundos.
    private void esperar( int mili){
        try{
            Thread.sleep(mili);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    
    
}
