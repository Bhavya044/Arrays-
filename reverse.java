import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.event.ListSelectionEvent;

public class reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listt = new ArrayList<>();
        while (true) {
            int i = sc.nextInt();
            if (i == -1)
                break;
            listt.add(i);
        }
        Collections.reverse(listt);
        System.out.println(listt);
    }

}
