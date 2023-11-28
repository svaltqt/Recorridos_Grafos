package Taller_grafos;

import java.util.ArrayList;
import java.util.List;

public class Dijkstra {
    private int[] distancias;
    private int[] recorridos;

    public void dijkstra(int[][] grafo, int origen) {
        int numVertices = grafo.length;
        distancias = new int[numVertices];
        recorridos = new int[numVertices];
        boolean[] visitados = new boolean[numVertices];

        // Inicializar distancias, recorridos y visitados
        for (int i = 0; i < numVertices; i++) {
            distancias[i] = Integer.MAX_VALUE;
            recorridos[i] = -1;  // -1 indica que el recorrido es desconocido
            visitados[i] = false;
        }

        // La distancia del origen a sí mismo siempre es 0
        distancias[origen] = 0;

        // Encontrar el camino más corto para todos los vértices
        for (int count = 0; count < numVertices - 1; count++) {
            int u = minDistance(distancias, visitados);
            visitados[u] = true;

            for (int v = 0; v < numVertices; v++) {
                if (!visitados[v] && grafo[u][v] != 0 &&
                        distancias[u] != Integer.MAX_VALUE &&
                        distancias[u] + grafo[u][v] < distancias[v]) {
                    distancias[v] = distancias[u] + grafo[u][v];
                    recorridos[v] = u;  // Registrar el recorrido
                }
            }
        }
    }

    public List<Integer> obtenerRecorrido(int destino) {
        List<Integer> recorrido = new ArrayList<>();
        int actual = destino;

        while (actual != -1) {
            recorrido.add(0, actual);
            actual = recorridos[actual];
        }
        return recorrido;
    }

    private int minDistance(int[] distancias, boolean[] visitados) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < distancias.length; v++) {
            if (!visitados[v] && distancias[v] <= min) {
                min = distancias[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    public int calcularDistancia(int[][] grafo, int origen, int destino) {
        dijkstra(grafo, origen); // Llamar al método dijkstra para calcular el recorrido y las distancias
        return distancias[destino];
    }
}
