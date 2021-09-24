/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;


/**
 *
 * @author Leonardo
 */
public class Arreglo {
    
    public static void sumarLista(int lista[]){
        int suma=0;
        float prom;
        
        
        for (int i : lista) {
            suma+=i;
        }
        prom=(float)suma/lista.length;
        
        System.out.println("La suma es : "+suma);
        System.out.println("El Promedio es : "+prom);
    }
   
    public static void buscarMayor(int num[][]){
        int mayor=0;
        for (int i = 0; i < num.length; ++i) {
      for(int j = 0; j < num[i].length; ++j)
                if (mayor<num[i][j]){
                    mayor=num[i][j];
                }
                
            }
            System.out.println("El mayor de los numeros es: "+mayor);
        }
        
    
    
    
     public static void cuentaVocales(String s){
         
         char caract []= s.toCharArray();// convierte el String en una cadena de caracteres
         System.out.println("La cadera tiene : "+caract.length+" letras");
    }
    
      public static void cuentaCaracter(String s, char c){
         char caract []= s.toCharArray();
         int cant=0;
         for(int i=0; i<caract.length;i++){
             if(caract[i]==c){
                 cant++;
             }
         }
          System.out.println("la letra "+c+" se encuentra "+cant+" veces en la cadena");
    }
    
    
}  
