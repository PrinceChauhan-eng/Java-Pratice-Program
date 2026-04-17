package PracticeSet6;

public class Maximum {
    static void main(String[] args) {
        int [] arr ={45,25,98,6,5,32};
        int max=arr[0];
        for (int num : arr){
            if (num>max) {
                max = num;
            }
        }
        System.out.println("Maximum : "+max);
    }
}
