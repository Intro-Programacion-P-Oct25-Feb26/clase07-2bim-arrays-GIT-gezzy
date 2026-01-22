/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import paquete04.Operacion;

/**
 *
 * @author reroes
 */
public class Informe {

    public static int obtenerTotalDia(int[][] pedidos, int dia) {
        // La funcion obtiene el numero total de pedidos del dia miercoles(3)
        // que es restado dentro del ciclo for para que concida con la posicion
        // del arreglo. La funcion retorna el valor de suma a la variable pedidosMiercoles
        // del main.

        int suma = 0;
        for (int i = 0; i < pedidos.length; i++) {
            suma = suma + pedidos[i][dia - 1];
        }
        return suma;
    }

    public static String obtenerCafeteriaMasPedidos(int[][] pedidos, String[] cafeterias) {
        // La funcion calcula cual fue la cafeteria con mas pedidos apoyandose
        // de un bucle for con un condicional que compara cada posicion del
        // arreglo hasta obtener la posicion que tenga el mayor valor.
        // La funcion devuelve el nombre de la cafeteria que concide en la posicion
        // con ms pedidos.

        int[] sumaSemanal = Operacion.obtenerSumaSemanal(pedidos);

        int mayor = sumaSemanal[0];
        int indice = 0;
        for (int i = 0; i < sumaSemanal.length; i++) {
            int valor = sumaSemanal[i];

            if (valor > mayor) {
                mayor = valor;
                indice = i;
            }
        }

        return cafeterias[indice];

    }

    public static int[] obtenerMenorPedidoCafeteria(int[][] pedidos) {
        // La funcion recorre el arreglo misPedidos del main para encontrar
        // el menor numero de pedidos de cada cafeteria.
        int[] pedidosMenores = new int[8];

        for (int i = 0; i < pedidos.length; i++) {
            pedidosMenores[i] = Operacion.obtenerMenor(pedidos[i]);
        }

        return pedidosMenores;

    }

    public static int[] obtenerMayorPedidoCafeteria(int[][] pedidos) {
        // La funcion recorre el arreglo misPedidos del main para encontrar
        // el mayor numero de pedidos de cada cafeteria.
        int[] pedidosMayores = new int[8];

        for (int i = 0; i < pedidos.length; i++) {
            pedidosMayores[i] = Operacion.obtenerMayor(pedidos[i]);
        }

        return pedidosMayores;
    }

}
