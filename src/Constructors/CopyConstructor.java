package Constructors;

class CopyConstructor {
    String name;
    int id;

    CopyConstructor(){

    };

    CopyConstructor(String name,int id){
        this.name=name;
        this.id=id ;
    }

    CopyConstructor(CopyConstructor obj2){
        this.name=obj2.name;
        this.id=obj2.id;
    }
}

class ASD extends CopyConstructor{
    CopyConstructor a;
    ASD(CopyConstructor c){
        this.name= c.name;
    }

}

class GFG{
    static void main(String[] args) {

        // This would invoke the parameterized constructor
        CopyConstructor sc = new CopyConstructor("Prince",1);
        System.out.println("First Object");
        System.out.println(sc.name);
        System.out.println(sc.id);
        System.out.println();


        //This would invoke the copy constructor
         CopyConstructor sc1 =new CopyConstructor("Chauhan",2);
        System.out.println("Second Object");
        System.out.println(sc1.name);
        System.out.println(sc1.id);
        System.out.println();

        ASD a =new ASD(new CopyConstructor("King",5));

        System.out.println(a.name);
    }
}



