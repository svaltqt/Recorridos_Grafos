package Taller_grafos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kruskal {

    public List<int[]> aplicarKruskal(int[][] grafo) {
        int numVertices = grafo.length;

        int parent[] = new int[numVertices]; // Almacena el conjunto al que pertenece cada vértice
        Arrays.fill(parent, -1);

        List<int[]> result = new ArrayList<>(); // Almacena el resultado final

        // Número de aristas seleccionadas es igual a numVertices-1
        for (int count = 0; count < numVertices - 1; ++count) {
            int min = Integer.MAX_VALUE;
            int u = -1;
            int v = -1;

            // Encuentra la arista de menor peso que no forma un ciclo
            for (int i = 0; i < numVertices; ++i) {
                for (int j = 0; j < numVertices; ++j) {
                    if (grafo[i][j] != 0 && find(parent, i) != find(parent, j) && grafo[i][j] < min) {
                        min = grafo[i][j];
                        u = i;
                        v = j;
                    }
                }
            }

            if (u != -1 && v != -1) {
                result.add(new int[]{u, v, grafo[u][v]});
                union(parent, u, v);
            }
        }

        return result;
    }

    // Función para encontrar el conjunto de un elemento i
    private int find(int parent[], int i) {
        // Encuentra el conjunto y realiza la compresión de ruta
        if (parent[i] == -1)
            return i;
        return find(parent, parent[i]);
    }

    // Une dos conjuntos en uno solo
    private void union(int parent[], int x, int y) {
        int xroot = find(parent, x);
        int yroot = find(parent, y);
        parent[xroot] = yroot;
        }
}