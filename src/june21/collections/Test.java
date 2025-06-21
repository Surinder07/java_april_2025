package june21.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> oldList = new LinkedList<>();
        oldList.add(10);
        oldList.add(20);
        oldList.add(30);
        oldList.add(40);
        oldList.add(50);
        System.out.println(oldList);
        oldList.add(1, 200);
        System.out.println(oldList);

        List<Integer> newList = new ArrayList<>();
        newList.add(2001);
        newList.add(2002);

        newList.addAll(oldList);
        System.out.println(newList);


        oldList.set(2, 100001);
        System.out.println(oldList);
        System.out.println(oldList.get(1));

        System.out.println(oldList.size());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(120);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(100);



//        List<String> names = new ArrayList<>();
//        names.add("Edward");
//        names.add("Dharmik");
//        names.add("Roop");
//        names.add("Sunny");
//        names.add("Utsav");
//        System.out.println(names);


    }
}
