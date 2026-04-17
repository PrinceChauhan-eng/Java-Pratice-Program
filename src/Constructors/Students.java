package Constructors;

class Students {
    String name;
    int age ;

    //Parameterized Constructor
    Students(String name,int age){
        this.name=name;
        this.age=age;
    }

    static void main(String[] args) {
        Students s = new Students("Prince",25);
//        s.name="King";
//        s.age=30;
        System.out.println(s.name);
        System.out.println(s.age);
    }
}
