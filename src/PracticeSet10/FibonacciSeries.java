package PracticeSet10;

public class
FibonacciSeries {
    static void main(String[] args) {
        int num = 10;
        int no1 = 0, no2 = 1;
        System.out.print("FibonacciSeries are : "+no1+" "+no2);

        for (int i=2;i<num;i++){
            int sum = no1+no2;
            System.out.print(" "+sum);
            no1=no2;
            no2=sum;
        }
    }
}
