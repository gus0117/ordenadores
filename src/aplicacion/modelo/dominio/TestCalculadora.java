
package aplicacion.modelo.dominio;

import aplicacion.modelo.dominio.DispositivoCientifico;
import java.util.Scanner;

public class TestCalculadora {
    private DispositivoCientifico dc;
    private Scanner sc;
    
    public void mostrarTabla(){
        int valor;
        System.out.print("Ingrese numero: ");
        valor = sc.nextInt();
        for(int i = 1; i <= 100; i++){
            System.out.println(i + "x" + valor + "=" + dc.calcularMultiplicacion(i, valor));
        }
    }
    public void mostrarDivisores(){
        int valor;
        System.out.print("Ingrese numero: ");
        valor = sc.nextInt();
        System.out.print("Sus divisores: ");
        
        
        for(int i = valor; i > 0; i--){
            if(dc.calcularResto(valor, i) == 0){
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    public void mostrarImpares(){
        int cotaInferior;
        int cotaSuperior;
        System.out.print("Ingrese Cota Inferior: ");
        cotaInferior = sc.nextInt();
        System.out.println("Ingrese Cota Superior: ");
        cotaSuperior = sc.nextInt();
        System.out.println("Lista de impares");
        for(int i = cotaInferior; i <= cotaSuperior; i++){
            if(dc.calcularResto(i, 2) != 0){
                System.out.println(i);
            }
        }
    }
    public void mostrarCoseno(){
        System.out.println("Cos(10)="+dc.calcularCoseno(10, 5));
    }
    public void mostrarMenu(){
        dc = new DispositivoCientifico();
        sc = new Scanner(System.in);
        byte opcion = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Mostrar tabla");
            System.out.println("2. Mostrar divisores");
            System.out.println("3. Mostrar numeros impares");
            System.out.println("4. Mostrar coseno de 10");
            System.out.println("5. Salir");
            opcion = (byte)sc.nextInt();
            switch(opcion){
                case 1:
                    mostrarTabla();
                    break;
                case 2:
                    mostrarDivisores();
                    break;
                case 3:
                    mostrarImpares();
                    break;
                case 4:
                    mostrarCoseno();
                    break;
                case 5:
                    System.out.println("Finalizado");
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }
        }while(opcion != 5);
    }

}
