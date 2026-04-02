package Arrays;

public class ArraryMain {
    static void main(String[] args) {
        //Creating array
        ArrayObject[] arr;
        arr = new ArrayObject[5];

        arr[0] = new ArrayObject("Prince", 1);
        arr[1] = new ArrayObject("Pankaj", 2);
        arr[2] = new ArrayObject("Praveen", 3);
        arr[3] = new ArrayObject("Pavan", 4);
        arr[4] = new ArrayObject("Pradeep", 5);

        for (int i=0;i< arr.length;i++){
            //System.out.println("Element at "+i+": { " +arr[i].roll_no+" "+arr[i].name+" }");

            System.out.println(arr[i].name);
        }

    }
}
