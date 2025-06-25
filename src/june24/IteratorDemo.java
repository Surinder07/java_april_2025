package june24;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
      //  List<String> names = Arrays.asList("ABC","Parminder", "Edward", "Dharmik", "Utsav", "Maitree");

        List<String> names = new ArrayList<>();
        names.add("Parminder");
        names.add("Edward");
        names.add("Dharmik");
        names.add("Utsav");
        names.add("Parminder");

        List<String> unmodifiableList = Collections.unmodifiableList(names);


        Iterator<String> iterator = unmodifiableList.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.equals("Edward")){
                iterator.remove();
            }
        }
        System.out.println(unmodifiableList);



       /* List<String> names = Arrays.asList("Parminder", "Edward", "Dharmik", "Utsav", "Maitree");

        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Edward")){
                names.remove(i);
            }
            System.out.println(names);
        }*/

    }
}
