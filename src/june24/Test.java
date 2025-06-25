package june24;


import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(null);
        set.add(null);
        System.out.println(set);


        // for every Integer in the given collection, print that interger
        for (Integer nums : set) {
            System.out.println(nums);
        }


        // forEach() method in Java 8

/*
        TreeSet treeSet = new TreeSet();
        treeSet.add(null);
        System.out.println(treeSet);*/

        System.out.println();

        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        lh.add(10);
        lh.add(20);
        lh.add(110);
        lh.add(540);
        lh.add(50);
        lh.add(null);
        lh.add(null);

        System.out.println(lh);

        List<Integer> list = Arrays.asList(10, 20, 43, 5, 2, 5, 34, 34, 53, 43, 22, 43);
       // remove duplicates from this list


        HashSet<Integer> removedDuplicates = new HashSet<>(list);
        System.out.println(removedDuplicates);
        // sort in ascending order




    }
}
