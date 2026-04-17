package PracticeSet7;

class ReversePattern {
    void reversePattern(){
        int n =5;
        for (int i =n;i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void main(String[] args) {
        ReversePattern rp = new ReversePattern();
        rp.reversePattern();
    }
}
