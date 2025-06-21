package june21.immutable;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("");

        for (Integer element : list) {
            System.out.println(element);
        }


    }
}
