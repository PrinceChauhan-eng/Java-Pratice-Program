package Class;

public class Dog {
    String name;
    String Breed;
    int age ;
    String Colour;

    Dog(String name,String Breed,int age,String Colour){
        this.name=name;
        this.Breed=Breed;
        this.age=age;
        this.Colour=Colour;
    }

    //Getter
    public String getName(){
        return name;
    }
    public String getBreed(){
        return Breed;
    }
    public String getColour(){
        return Colour;
    }
    public int getAge(){
        return age;
    }

    //Setter
    public void setName(){
        this.name=name;
    }
    public void setBreed(){
        this.Breed=Breed;
    }
    public void setAge(){
        this.age=age;
    }
    public void setColour(){
        this.Colour=Colour;
    }


}
