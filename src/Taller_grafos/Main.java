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
                    for (int i = 0; i < numVertices; i++) {
                        for (int j = 0; j < numVertices; j++) {
                            dijkstraMatrix[i][j] = 0;
                        }
                    }
                    break;
                case 1:
                    // Implementar función para llenar matriz para Dijkstra
                    // Llenar la matriz manualmente pidiendo los valores al usuario
                    int numAristas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de aristas:"));
                    for (int k = 1; k <= numAristas; k++) {
                        int posX = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el vértice de inicio para la arista "  + ":"));
                        int posY = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el vértice de fin para la arista " + ":"));
                        int weight = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el peso para la arista " + ":"));
                        dijkstraMatrix[posX][posY] = weight;  // ejemplo  (2,3)
                        dijkstraMatrix[posY][posX] = weight;  // ejemplo (3,2)
                        System.out.println("(" +posX + "," + posY + ")" + " = " + weight );
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
                    int origen = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el origen del Recorrido: "));
                    int destino = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el destino del Recorrido: "));
                    Dijkstra ejemplo1 = new Dijkstra(dijkstraMatrix ,origen, destino);
                    ejemplo1.imprimirRecorrido();
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
                    int numAristas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de aristas:"));
                    for (int k = 1; k <= numAristas; k++) {
                        int posX = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el vértice de inicio para la arista "  + ":"));
                        int posY = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el vértice de fin para la arista " + ":"));
                        int weight = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el peso para la arista " + ":"));
                        kruskalMatrix[posX][posY] = weight;  // ejemplo  (2,3)
                        kruskalMatrix[posY][posX] = weight;  // ejemplo (3,2)
                        System.out.println("(" +posX + "," + posY + ")" + " = " + weight );
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
