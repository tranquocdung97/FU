package b35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        boolean isFind = false;
        for (int i = 0; i < n; i += 2) {
            if (list.get(i) % 2 != 0) {
                isFind = true;
                System.out.print(list.get(i) + " ");
            }
        }
        if (!isFind)
            System.out.println("NULL");
    }

}
