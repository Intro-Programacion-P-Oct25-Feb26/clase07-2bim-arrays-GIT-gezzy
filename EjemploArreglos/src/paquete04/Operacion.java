/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Operacion {

    public static double[] obtenerPromedioSemanal(int[][] pedidos) {
        // La funcion calcula el promedio semanal de pedidos de cada cafeteria
        // y lo retorna en cada posicion del arreglo promedioSemanal del main.
        double[] promedios = new double[8];
        int suma;
        double promedio;
        for (int i = 0; i < pedidos.length; i++) {
            suma = 0;
            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }
            promedio = (double) suma / 7;
            promedios[i] = promedio;
        }

        return promedios;
    }

    public static int obtenerSumaTotal(int[][] pedidos) {
        // La funcion no tiene ningun efecto dentro del main por lo que su
        // eliminacion no rompe el programa.

        int suma = 0;
        for (int i = 0; i < pedidos.length; i++) {
            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }

        }

        return suma;
    }

    public static int[] obtenerSumaSemanal(int[][] pedidos) {
        // La fuincion calcula la suma total de pedidos a la semana de cada
        // cafeteria lo retorna en cada posicion del arreglo sumaSemanal de la
        // clase informe para luego obtener la cafeteria con mas pedidos.

        int[] sumaSemanal = new int[8];
        int suma;
        for (int i = 0; i < pedidos.length; i++) {
            suma = 0;
            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }
            sumaSemanal[i] = suma;
        }

        return sumaSemanal;
    }

    public static int obtenerMenor(int[] pedidosCafeteria) {
        // La funcion no tiene ningun efecto dentro del main por lo que su
        // eliminacion no rompe el programa.

        int menor = pedidosCafeteria[0];
        int valor;
        for (int i = 0; i < pedidosCafeteria.length; i++) {
            valor = pedidosCafeteria[i];
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }

    public static int obtenerMayor(int[] pedidosCafeteria) {
        // La funcion no tiene ningun efecto dentro del main por lo que su
        // eliminacion no rompe el programa.

        int mayor = pedidosCafeteria[0];
        int valor;
        for (int i = 0; i < pedidosCafeteria.length; i++) {
            valor = pedidosCafeteria[i];
            if (valor > mayor) {
                mayor = valor;
            }
        }
        return mayor;
    }

}
