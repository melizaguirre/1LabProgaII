
//Lab1P2 - Ana Melissa Cabrera Izaguirre  - 22141111
import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;


public class Lab1P2_AnaCabrera_22141111 {
    public static void main (String[] args){
      Scanner leer = new Scanner(System.in);
     
      
    System.out.println("Ingrese la cantidad de filas");
    int n = leer.nextInt();
    
    System.out.println("Ingrese la cantidad de columnas");
    int m = leer.nextInt();
    
    System.out.println("Ingrese la cantidad de epsilon");
    int epsilon = leer.nextInt();
    
    double[][] matriz = new double [n][m];
    Random(matriz);
    imprimirMatriz(matriz);
    }
    
    public static void Random(double[][] matrizRan){
         Random lim = new Random();
        for(int i=0; i< matrizRan.length; i++){
            for (int j=0; j<matrizRan.length; j++){
                matrizRan[i][j] = lim.nextInt(100-1+1)+1;
                System.out.println("\n");
            }
        }
    }
    
    public static void imprimirMatriz(double[][]matrizRan){
        System.out.print("\t * * * M A T R I Z * * * \n");
        for(int i=0; i <matrizRan.length; i++){
            for (int j=0; j<matrizRan.length; j++){
             System.out.print("   " + matrizRan[i][j]+ "   ");
             System.out.println("\n");
            }
        }
    }
    
    public static double[][] busquedaRaices(double[][] matrizRan, double error){
        double[][] matrizRaiz = new double [matrizRan.length][matrizRan[0].length];
        for (int i = 0; i <matrizRan.length; i++)
            for(int j = 0; j <matrizRan[i].length; j++)
              
        return matrizRaiz;
    }
    
  
    public static double BusquedaBinaria(double x,double menor,double mayor,int MargenError,double Rmed){

      
        Rmed=(menor+mayor/2);


        if(x-MargenError<=Rmed && Rmed<=x+MargenError){

            return Rmed;

        }
     
        if(Rmed<x){
            
            
            return BusquedaBinaria(x,Rmed,mayor,MargenError,Rmed);



        }else{
            return BusquedaBinaria(x,menor,Rmed,MargenError,Rmed);
            
        }
        
        


    }





}
    

