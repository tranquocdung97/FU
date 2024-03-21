package b77;

import java.util.Scanner;

public class B77 {

    public static String Palindrome(String s) {
        String x = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            x = x + s.charAt(i);
        }
        x = " " + x;
        s = " " + s;
        int m = s.length(), n = x.length();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            matrix[i][0] = 0;
        }
        for (int i = 0; i < n; i++) {
            matrix[0][i] = 0;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (s.charAt(i) == x.charAt(j)) {
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                } else {
                    matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
                }
            }
        }
//ket qua matrix:
// 0 a c s b b a a ->j
// 0 [0, 0, 0, 0, 0, 0, 0, 0]
// a [0, 1, 1, 1, 1, 1, 1, 1]
// a [0, 1, 1, 1, 1, 1, 2, 2]
// b [0, 1, 1, 1, 2, 2, 2, 2]
// b [0, 1, 1, 1, 2, 3, 3, 3]
// s [0, 1, 1, 2, 2, 3, 3, 3]
// c [0, 1, 2, 2, 2, 3, 3, 3]
// a [0, 1, 2, 2, 2, 3, 4, 4]
// i

        String p = "";
        int i = m - 1, j = n - 1;
        while (i > 0 && j > 0) {
//nếu chữ của s và x tại vị trí xet giống nhau thì thêm chữ đó vào kết quả p
//và chuyển ô matrix xét lùi chéo lại về vị trí matrix[i-1][j-1]
            if (s.charAt(i) == x.charAt(j)) {
                p = s.charAt(i) + p;
                i--;
                j--;

            } else {
//nếu 2 ký tự khác nhau thì chuyển lên ô matrix phía trên
// hoặc sang trái
                if (matrix[i - 1][j] < matrix[i][j - 1]) {
//chuyển sang ô matrix bên trái nên giảm j và giữ nguyên i
                    j--;
                } else {
//chuyển lên ô matrix trên nên giảm i và giữ nguyên j
                    i--;
                }
            }
        }

        return p;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Palindrome(s));
    }
}
