package Fig16_04_05;

// Fig 16.4: ArregloBinario.java
// Clase que contiene un arreglo de enteros aleatorios y un m�todo 
// que utiliza la b�squeda binaria para encontrar un entero.
import java.util.Random;
import java.util.Arrays;

public class ArregloBinario {

    private int[] datos; // arreglo de valores
    private static Random generador = new Random();

    // crea un arreglo de un tama�o dado y lo llena con enteros aleatorios
    public ArregloBinario(int tamanio) {
        datos = new int[tamanio]; // crea espacio para el arreglo

        // llena el arreglo con enteros aleatorios en el rango de 10 a 99
        for (int i = 0; i < tamanio; i++) {
            datos[i] = 10 + generador.nextInt(90);
        }

        Arrays.sort(datos);
    } // fin del constructor de ArregloBinario

    // realiza una b�squeda binaria en los datos
    public int busquedaBinaria(int elementoBusqueda) {
        int inferior = 0; // extremo inferior del �rea de b�squeda
        int superior = datos.length - 1; // extremo superior del �rea de b�squeda
        int medio = (inferior + superior + 1) / 2; // elemento medio
        int ubicacion = -1; // devuelve el valor; -1 si no lo encontr�

        do // ciclo para buscar un elemento
        {
            // imprime el resto de los elementos del arreglo
            System.out.print(elementosRestantes(inferior, superior));

            // imprime espacios para alineaci�n
            for (int i = 0; i < medio; i++) {
                System.out.print("   ");
            }
            System.out.println(" * "); // indica el elemento medio actual

            // si el elemento se encuentra en medio
            if (elementoBusqueda == datos[medio]) {
                ubicacion = medio; // la ubicaci�n es el elemento medio actual
            } // el elemento medio es demasiado alto
            else if (elementoBusqueda < datos[medio]) {
                superior = medio - 1; // elimina la mitad superior
            } else // el elemento medio es demasiado bajo
            {
                inferior = medio + 1; // elimina la mitad inferior
            }
            medio = (inferior + superior + 1) / 2; // recalcula el elemento medio
        } while ((inferior <= superior) && (ubicacion == -1));

        return ubicacion; // devuelve la ubicaci�n de la clave de b�squeda
    } // fin del m�todo busquedaBinaria

    // m�todo para imprimir ciertos valores en el arreglo
    public String elementosRestantes(int inferior, int superior) {
        StringBuilder temporal = new StringBuilder();

        // imprime espacios para alineaci�n
        for (int i = 0; i < inferior; i++) {
            temporal.append("   ");
        }

        // imprime los elementos que quedan en el arreglo
        for (int i = inferior; i <= superior; i++) {
            temporal.append(datos[i] + " ");
        }

        temporal.append("\n");
        return temporal.toString();
    } // fin del m�todo elementosRestantes

    // m�todo para imprimir los valores en el arreglo
    public String toString() {
        return elementosRestantes(0, datos.length - 1);
    } // fin del m�todo toString   
} // fin de la clase ArregloBinario


/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/
