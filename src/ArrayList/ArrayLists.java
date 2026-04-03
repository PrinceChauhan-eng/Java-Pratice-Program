package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
   public static void main(String[] args){
       ArrayList<Integer> list = new ArrayList<Integer>();

       // Add Elements
       list.add(1);
       list.add(3);
       list.add(5);
       list.add(9);
       list.add(11);
       System.out.println(list);

       // Get Elements
       int Elements= list.get(0);
       System.out.println(Elements);

       // Set Element
       list.set(1,4);  // We are updating a List index Value
       list.set(2,9);
       list.set(3,2);
       System.out.println(list);

       // Delete Elements
       list.remove(4);
       System.out.println(list);

       // Size Elements
       int size = list.size();
       System.out.println(size);

       // For Loops
       for (int i = 0;i<size;i++)
       {
           System.out.print(list.get(i)+" ");
       }
       System.out.println();

       //Sorting Elements
       Collections.sort(list);
       System.out.println(list);


    }
}
