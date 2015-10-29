
package creencias;

import java.util.ArrayList;

public class desorden {

    public desorden() {
    }
    
int AUX;    
    
String[] original = new String[28];    
   
int[] desorden = new int[28];    
    
String[] total = new String[28];    
    


  

 public void BURBUJA( int[] array ){


     int PR; //auxiliar 
     
     boolean cambio = false;
     
     while(true){  
     
        cambio = false;
    
        for (int i = 1; i < array.length; i++) {
            
            if ( array[ i ] < array[ i - 1 ] ) {
                
             PR = array[ i ];
             
             array[ i ] = array[ i - 1 ] ; 

             array[ i - 1 ] = PR;
                     
             cambio = true;
             
            }
          
      
            }
   
         if ( cambio == false )
             break;
        
     }
        
  
     
    
    
     
   
   }

   
public void INSERCION( int[] array ){

int Aux; //auxiliar
int cont1; //contador1
int cont2; //contador2

    for ( cont1 = 1; cont1  < array.length; cont1++) {
        
        Aux = array[cont1];
    
        for( cont2 = cont1 - 1 ;  cont2 >= 0 && array[cont2] > Aux; cont2--) {
            array[cont2 + 1] = array[cont2];
            array[cont2] = Aux;  
        }
        
        
    }


}   
   

public void SELECCION( int[] array ){

    for (int i = 0; i < array.length - 1 ; i++) {
        
        int minimo = i ;
        
        for (int j = ( i + 1 ); j < array.length ; j++) {
            
            if ( array[ j ] < array[ minimo ]) {
                
                minimo = j ;
            }
            
        }
        
        int Aux = array[ i ];
        array[ i ] = array[ minimo ] ;
        array[ minimo ] = Aux;
        
    }


}

/*
public void MEZCLA( int[] array ){

int Izquierda = 0; 

int Izq = 0;

int Derecha = array.length ;
    
int Der;

boolean ordenado = false;

do{

    ordenado = true;
    
    Izquierda = 0;
    
    while( Izquierda < Derecha ){
    Izq = Izquierda;
     
    while( Izq < Derecha && array[Izq] <= array[Izq + 1]){
    
    Izq ++;    
        
    }
    
    Der = (Izq + 1);
    
    while( Der == (Derecha - 1) || Der < Derecha && array[Der] <= array[Der + 1] ){
   
    Der++;    
        
    }
    
        if (Der <= Derecha) {
            
        }
    }
}while( !ordenado ){
}
}
  */  
}
