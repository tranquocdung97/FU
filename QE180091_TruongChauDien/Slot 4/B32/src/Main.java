import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.add(x);
        }
        int k = sc.nextInt();
        for (int i=0; i<list.size(); i++){
            if (k==list.get(i)){
                System.out.println(i);
                break;
            }
        }
        if (!list.contains(k)){
            System.out.println("-1");
        }
    }
}
