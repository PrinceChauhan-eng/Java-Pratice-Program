package QuestionSolving;

class Prince {
    private  int age ;

    public int getAge(){
        return age;
    }

    public void getSet(int age) {
        if (age > 18)
            this.age = age;
        else
            System.out.println("Invalid Age");

    }

    static void main(String[] args) {
        Prince p = new Prince();
        p.age=20;
        p.getSet(25);
    }
}
