package PracticeSet8;

class Square {
    int side;
    int area(){
        return side*side;
    }
    int perimeter(){
        return 4*side;
    }

    static void main(String[] args) {
        Square s = new Square();
        s.side=5;
        System.out.println("Area of Sqaure is : "+s.area());
        System.out.println("Area of Perimeter is : "+s.perimeter());

    }
}

