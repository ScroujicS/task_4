import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите четное число N: ");
        int N = scanner.nextInt();

        if (N % 2 != 0) {
            System.out.println("N должно быть четным!");
            scanner.close();
            return;
        }

        int[][] matrix = new int[N][N];
        int layers = N / 2;

        for (int layer = 0; layer < layers; layer++) {
            int value = (layer < layers - 1) ? layers - layer - 1 : 0;
            for (int i = layer; i < N - layer; i++) {
                matrix[layer][i] = value;
                matrix[N - 1 - layer][i] = value;
                matrix[i][layer] = value;
                matrix[i][N - 1 - layer] = value;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
