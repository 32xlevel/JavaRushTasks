import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Testing {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int[][] matrix = new int[7][4];
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(10)-5;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
