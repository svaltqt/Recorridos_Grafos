package Taller_grafos;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int option;

        do {
            String[] mainOptions = {"Dijkstra", "Kruskal", "Salir"};
            option = JOptionPane.showOptionDialog(
                    null,
                    "Selecciona una opción:",
                    "Menú Principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    mainOptions,
                    mainOptions[0]
            );

            switch (option) {
                case 0: // Dijkstra
                    dijkstraMenu();
                    break;
                case 1: // Kruskal
                    kruskalMenu();
                    break;
            }

        } while (option != 2); // 2 es la opción "Salir"
    }

    private static void dijkstraMenu() {
        int option;
        int numVertices = 0; // Inicializamos el número de vértices
        int[][] dijkstraMatrix = null;

        do {
            String[] dijkstraOptions = {"Crear Matriz", "Llenar Matriz", "Imprimir Matriz", "Recorrido", "Distancia", "Volver"};
            option = JOptionPane.showOptionDialog(
                    null,
                    "Selecciona una opción para Dijkstra:",
                    "Menú Dijkstra",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    dijkstraOptions,
                    dijkstraOptions[0]
            );

            switch (option) {
                case 0:
                    // Implementar función para crear matriz para Dijkstra
                    numVertices = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de vértices para la matriz:"));
                    // Crear matriz para Dijkstra
                    dijkstraMatrix = new int[numVertices][numVertices];
                    break;
                case 1:
                    // Implementar función para llenar matriz para Dijkstra
                    // Llenar la matriz manualmente pidiendo los valores al usuario
                    for (int i = 0; i < numVertices; i++) {
                        for (int j = 0; j < numVertices; j++) {
                            dijkstraMatrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor para la posición [" + i + "][" + j + "]"));
                        }
                    }
                    break;
                case 2:
                    // Implementar función para imprimir matriz para Dijkstra
                    StringBuilder matrixString = new StringBuilder("Matriz:\n");

                    for (int i = 0; i < dijkstraMatrix.length; i++) {
                        for (int j = 0; j < dijkstraMatrix[i].length; j++) {
                            matrixString.append(dijkstraMatrix[i][j]).append("\t  ");
                        }
                        matrixString.append("\n");
                    }

                    JOptionPane.showMessageDialog(null, matrixString.toString(), "Matriz", JOptionPane.INFORMATION_MESSAGE);

                    break;
                case 3:
                    // Implementar función para recorrido para Dijkstra
                    break;
                case 4:
                    // Implementar función para distancia para Dijkstra
                    break;
            }

        } while (option != 5); // 5 es la opción "Volver"
    }

    private static void kruskalMenu() {
        int option;
        int[][] kruskalMatrix = null;
        int numVertices = 0; // Inicializamos el número de vértices

        do {
            String[] kruskalOptions = {"Crear Matriz", "Llenar Matriz", "Imprimir Matriz", "Recorrido", "Distancia", "Vertices", "Volver"};
            option = JOptionPane.showOptionDialog(
                    null,
                    "Selecciona una opción para Kruskal:",
                    "Menú Kruskal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    kruskalOptions,
                    kruskalOptions[0]
            );

            switch (option) {
                case 0:
                    // Implementar función para crear matriz para Kruskal
                    // Implementar función para crear matriz para Dijkstra
                    numVertices = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de vértices para la matriz:"));
                    // Crear matriz para Dijkstra
                    kruskalMatrix = new int[numVertices][numVertices];
                    break;
                case 1:
                    // Implementar función para llenar matriz para Kruskal
                    // Llenar la matriz manualmente pidiendo los valores al usuario
                    for (int i = 0; i < numVertices; i++) {
                        for (int j = 0; j < numVertices; j++) {
                            kruskalMatrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor para la posición [" + i + "][" + j + "]"));
                        }
                    }
                    break;
                case 2:
                    // Implementar función para imprimir matriz para Kruskal
                    StringBuilder matrixString = new StringBuilder("Matriz:\n");

                    for (int i = 0; i < kruskalMatrix.length; i++) {
                        for (int j = 0; j < kruskalMatrix[i].length; j++) {
                            matrixString.append(kruskalMatrix[i][j]).append("\t  ");
                        }
                        matrixString.append("\n");
                    }

                    JOptionPane.showMessageDialog(null, matrixString.toString(), "Matriz", JOptionPane.INFORMATION_MESSAGE);


                    break;
                case 3:
                    // Implementar función para recorrido para Kruskal
                    break;
                case 4:
                    // Implementar función para distancia para Kruskal
                    break;
                case 5:
                    // Implementar función para vértices para Kruskal
                    break;
            }

        } while (option != 6); // 6 es la opción "Volver"
    }
}
