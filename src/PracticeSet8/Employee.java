package PracticeSet8;

class Employee {
    String name;
    int salary;

    int getSalary(){
        return salary;
    }
    String getName(){
        return name;
    }

    void setName(String n){
        name =n;
    }

    static void main(String[] args) {
        Employee e = new Employee();
        e.salary=50000;
        e.setName("Prince");
        System.out.println("Employee name is : "+e.getName());
        System.out.println(e.getName() + " Salary is : " + e.getSalary());
    }

}
