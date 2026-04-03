package JavaConstructors;

import java.util.SortedMap;

class Student {
    String name;
//
//    //Default Constructor
//    Student(){
//        System.out.println("Default Constructor");
//    }

//    //Parameterized Constructor
//    Student(String name){
//        this.name=name;
//    }


    void display(){
        System.out.println("Name :"+name);
    }

    void show(String name){
        System.out.println("Name :"+name);
    }


    static void main(String[] args) {
//        Student st = new Student("Prince");
//        //st.display();
//        st
        Student sc = new Student();
        sc.show("Hello");
    }
}
