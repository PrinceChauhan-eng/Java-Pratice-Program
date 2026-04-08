package PracticeSet6;

public class ArraySum {
    static void main(String[] args) {
        float arr[]={15.2f,580.5f,21.3f,22.3f,78.2f};
        float sum=0;
        for (float i : arr){
            sum+=i;
        }
        System.out.println(sum);
    }
}
