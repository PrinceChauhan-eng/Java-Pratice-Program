package Constructors;

class PrivateConstructor {
   private PrivateConstructor(){
       System.out.println("This is Private Constructor");
   }
   public static void display(){
       System.out.println("Hello Java");
   }
}

class main{
    public static void main(String[] args){
        //PrivateConstructor pv =new PrivateConstructor();
        PrivateConstructor.display();
    }

}

