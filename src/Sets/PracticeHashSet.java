package Sets;

import java.util.*;
import java.util.HashSet;

public class PracticeHashSet {
    public static void main(String[] args) {

        //🟡 HASHSET — MOST ASKED QUESTIONS

        Set<Integer>set=new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(set);

        //Remove duplicates from a list using HashSet.
        List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,1,2,4,5,5,6,8,8,9,9,9,7));
        System.out.println("Your List : "+list);
        Set<Integer>set1= new HashSet<>(list);
        System.out.println("Removed Duplicate from List : "+set1);

        //Find union of two sets.
        Set<Integer>union = new HashSet<>(set);
        union.addAll(set1);
        System.out.println("Union : "+union);

        //Find intersection of two sets.
        Set<Integer>intersection = new HashSet<>(set);
        intersection.retainAll(set1);
        System.out.println("Intersection : "+intersection);

        //Find difference between two sets.
        Set<Integer>difference = new HashSet<>(set1);
        difference.removeAll(set);
        System.out.println("Difference : "+difference);

        //Check if two sets are equal.
        System.out.println("Equal : "+set.equals(set1));

        //Find all unique elements from two lists.
        union.removeAll(intersection);
        System.out.println("Unique : "+union);

        //Convert ArrayList → HashSet → ArrayList (remove duplicates).
        List<Integer>list1=new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,6,6,7));
        Set<Integer>set2= new HashSet<>(list1);
        List<Integer>list2=new ArrayList<>(set2);
        System.out.println(list2);

        //Find common elements between two arrays using HashSet.
        Integer[] arr1={1,2,3,4,5,6,2,3,5};
        Integer [] arr2 ={1,2,3,7,8,9};
        Set<Integer>set3=new HashSet<>(Arrays.asList(arr1));
        Set<Integer>set4=new HashSet<>(Arrays.asList(arr2));
        set3.retainAll(set4);
        System.out.println("Common : "+set3);

        //Check if a set is a subset of another set.
        set3.containsAll(set4);
        System.out.println("Subset : "+set3);

        //Count distinct elements in a list using HashSet.

        Set<Integer>set5=new HashSet<>(Arrays.asList(arr1));
        int count=set5.size();
        System.out.println("Distinct : "+count);









    }
}
