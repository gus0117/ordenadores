/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.modelo.dominio.Celular;

/**
 * Clase utilizada para probar la clase celular
 */
public class TestCelular {

    /**
     * Metodo principal de la clase
     * @param args 
     */
    public static void main(String[] args) {
        Celular cel = new Celular();

        System.out.println("Calcular Suma: 2 + 3 = " + cel.getDispositivoCientifico().calcularSuma(2, 3));
        System.out.println("Calcular Resta:  4 - 2 = " + cel.getDispositivoCientifico().calcularResta(4, 2));
        System.out.println("Calcular Resto: 25 mod 2 = " + cel.getDispositivoCientifico().calcularResto(25, 2));
        System.out.println("Calcular Potencia: 3^2 = " + cel.getDispositivoCientifico().calcularPotencia(3, 2));
        System.out.println("Calcular Producto: 2 * 2 = " + cel.getDispositivoCientifico().calcularMultiplicacion(2, 2));
        System.out.println("Calcular Factorial: !5 = " + cel.getDispositivoCientifico().calcularFactorial(5));
        System.out.println("Calcular Division: 10 / 2 = " + cel.getDispositivoCientifico().calcularDivision(10, 2));
        System.out.println("Calcular Cos(10) = " + cel.getDispositivoCientifico().calcularCoseno(10, 10));
    }
}
