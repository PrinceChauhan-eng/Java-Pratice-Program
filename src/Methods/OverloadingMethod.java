package Methods;

class OverloadingMethod {
     //Multiply two integer value
    public int Multiply(int x , int b){
        int prod= x*b;
        return prod;
    }
    public int Multiply(int x,int y ,int z){
        int prod=x*y*z;
        return prod;
    }


}
class main{
    static void main(String[] args) {
        OverloadingMethod om = new OverloadingMethod();
        System.out.println(om.Multiply(5,6));
        System.out.println(om.Multiply(5,6,8));
    }
}