
package b34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (list.get(i) == x)
                count++;
        }
        System.out.println(count);
    }
    
}
