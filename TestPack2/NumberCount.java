package TestPack2;
import java.util.*;
public class NumberCount {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("List of numbers: "+list);
        System.out.println("\nCount all with frequency:");
        Set<Integer> uniqueSet = new HashSet<Integer>(list);
        for (Integer i : uniqueSet) {
            System.out.println(i + ": " + Collections.frequency(list, i));
        }
    }
}
