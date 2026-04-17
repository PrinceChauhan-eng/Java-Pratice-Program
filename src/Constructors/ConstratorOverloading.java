package Constructors;

class ConstratorOverloading {

    ConstratorOverloading(String name){
        System.out.println("One Parameter: "+name);
    }

    ConstratorOverloading(String name, int age){
        System.out.println("Two Parameter : "+name+" "+"\n"+"Second Parameter : "+age);
    }

    ConstratorOverloading(long id){
        System.out.println("one paramter with different :"+id);
    }

    public static void main(String[] args){
        ConstratorOverloading co = new ConstratorOverloading("Prince");
        ConstratorOverloading co1 = new ConstratorOverloading("Prince",1);
        ConstratorOverloading co2 = new ConstratorOverloading(14523);


    }
}

