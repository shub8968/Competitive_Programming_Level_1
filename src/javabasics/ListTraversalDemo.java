package javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ListTraversalDemo {

    public static void main(String[] args) {

        var arr1 = new ArrayList<String>(Arrays.asList("Rupee","Yen", "Yuan", "Dollar", "Euro"));  // mutuable // local variable type inference
        var arr2 = Arrays.asList("Rupee", "Yen", "Yuan", "Dollar", "Euro"); // immutable
        arr1.add("Ruble");
        try {
            arr2.add("Ruble");
        }catch(UnsupportedOperationException ex){
            System.out.println(ex.toString());
        }
        var arr3 = new ArrayList<>(arr1); // mutuable
        Iterator iterator1 = arr1.iterator();
        Iterator iterator2 = arr2.iterator();
        System.out.println("---First way--- : ");
        iterator1.forEachRemaining( x -> System.out.println(x));
        System.out.println("---Second way--- : ");  //Iterator vs IterableR
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println("---Third way--- : ");
        for(String x: arr1){
            System.out.println(x);
        }

    }
}
