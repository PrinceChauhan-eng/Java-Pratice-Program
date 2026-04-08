package PracticeSet8;

class Rectangle {
    int length;
    int breadth;


    int area(){
        return length*breadth;
    }

    int perimeter(){
        return 2*(length+breadth);
    }

    static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length=10;
        r.breadth=5;
        System.out.println("Area of Rectangle is :"+r.area());
        System.out.println("Perimeter of Rectangle is :"+r.perimeter());
    }
}
