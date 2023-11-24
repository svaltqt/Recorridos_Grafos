package Recorrido_DFS_Madya;

public class Main {

    public static void main(String[] args) {
        // Ejemplo de uso:
        // Supongamos que Madya es la matriz de adyacencia del grafo y n es el número de nodos
        int n = 10;
        DFSAlgorithm.Madya = new int[][]{
                {0, 0, 0, 0, 0, 1, 0, 0, 1, 0},
                {0, 0, 1, 1, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1},
                {0, 1, 0, 0, 0, 0, 1, 1, 0, 0},
                {1, 0, 1, 0, 0, 0, 0, 0, 1, 1},
                {0, 1, 1, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 1, 0},
                {1, 0, 0, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 1, 0, 0},
                {0, 0, 1, 0, 1, 0, 0, 0, 0, 0}
        };

        // Inicializar el arreglo de nodos visitados
        DFSAlgorithm.visitado = new int[n];

        // Llamar al algoritmo de recorrido en profundidad desde el nodo 0
        DFSAlgorithm.recorridoDFS(5);
    }
}