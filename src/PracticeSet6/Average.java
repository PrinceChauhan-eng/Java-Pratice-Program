package PracticeSet6;

public class Average {
    static void main(String[] args) {
        float [] arr={45,89,65,78,54};
        float sum=0;
        float avg=0;
        for(float i : arr){
            sum+=i;

        }
        avg=sum/arr.length;
        System.out.println(avg);
    }
}
