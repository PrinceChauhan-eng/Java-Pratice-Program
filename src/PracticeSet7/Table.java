package PracticeSet7;

class Table {
    void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "X" + i + "=" +n*i);
        }
    }

    static void main(String[] args) {
        Table t = new Table();
        t.table(5);
    }
}
