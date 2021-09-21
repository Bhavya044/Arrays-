import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class removeDuplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> ob = new ArrayList<Integer>();

        while (true) {
            int i = sc.nextInt();
            if (i == -1)
                break;
            ob.add(i);
        }
        for (int i = 0; i < ob.size(); i++) {
            for (int j = i + 1; j < ob.size(); j++) {
                if (ob.get(i).equals(ob.get(j))) {
                    ob.remove(j);
                }
            }
        }
        System.out.print(ob);
    }
}