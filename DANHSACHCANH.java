import java.util.ArrayList;
import java.util.Scanner;

public class DANHSACHCANH {
    public static void main(String[] args) {
        try (// process input
        Scanner sc = new Scanner(System.in)) {
            int vertex = sc.nextInt();
            if (vertex > 0 && vertex <= 1000) {
                int[][] matrix = new int[vertex+1][vertex+1];
                for (int i = 1; i<=vertex; i++) {
                    for (int j = 1; j<=vertex; j++) {
                        matrix[i][j] = sc.nextInt();
                    }
                }
                ArrayList<String> edgeList = new ArrayList<>();
                // charge matrix to edge list
                for (int i = 1; i <= vertex; i++) {
                    for (int j = i ; j <= vertex; j++) {
                        if (matrix[i][j] == 1) {
                            edgeList.add("("+i+","+j+")");
                        }
                    }
                }
                // print relsult
                for (String item: edgeList) {
                    System.out.println(item);
                }
            }
        }

    }
}
