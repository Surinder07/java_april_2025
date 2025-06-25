package june24;

import sun.reflect.generics.tree.Tree;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        System.out.println(set.contains(0));
        System.out.println(set.remove(0));

        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(10);
        tree.add(20);
        tree.add(30);
        tree.add(40);
        tree.add(50);
        tree.add(60);
        NavigableSet<Integer> result = tree.tailSet(30, false);
        System.out.println(result);

        System.out.println(tree.pollFirst());
        System.out.println(tree.pollLast());

    }
}
