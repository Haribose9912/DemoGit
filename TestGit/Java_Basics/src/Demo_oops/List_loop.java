package Demo_oops;

import java.util.*;

public class List_loop {
    List<Integer> num = new ArrayList<>();
    
    public List_loop() {
        num.add(4);
        num.add(7);
        num.add(1);
        num.add(9);
        int max_num = num.get(0);
        
        for (int i = 1; i < num.size(); i++) {
            if (num.get(i) > max_num) {
                max_num = num.get(i);
            }
        }
        
        System.out.println("Max number: " + max_num);
    }
    
    public static void main(String[] args) {
        new List_loop();
    }
}
