package Recorrido_DSF_Madya;



public class DFSAlgorithm {

    // Matriz de adyacencia y arreglo de visitados como variables globales o accesibles
    static int[][] Madya;
    static int[] visitado;

    // Método para realizar el Recorrido en Profundidad (DFS)
    // Parámetros:
    // v: Nodo de inicio
    public static void recorridoDFS(int v) {
        if (Madya == null || visitado == null || v < 0 || v >= Madya.length) {
            System.out.println("Matrices no inicializadas o nodo fuera de rango.");
            return;
        }

        // Marcar el nodo como visitado
        visitado[v] = 1;

        // Imprimir o procesar el nodo actual
        System.out.print(v + " ");

        // Recorrer los nodos adyacentes
        for (int k = 0; k < Madya[v].length; k++) {
            // Verificar la adyacencia y si el nodo adyacente no ha sido visitado
            if (Madya[v][k] == 1 && visitado[k] == 0) {
                // Llamada recursiva para explorar el nodo adyacente
                recorridoDFS(k);
            }
        }
    }
}
