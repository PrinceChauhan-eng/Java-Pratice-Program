package PracticeSet6;

public class Minimum {
    public static void main(String[] args){
        int [] arr ={22,54,89,65,23,5,44};
        int min=arr[0];
        for (int num : arr){
            if (num<min){
                min=num;
            }
        }
        System.out.println("Minimum :" +min);
    }
}
