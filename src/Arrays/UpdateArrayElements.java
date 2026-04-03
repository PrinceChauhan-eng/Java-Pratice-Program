package Arrays;

public class UpdateArrayElements {
    static void main() {
        int[] arr = {500, 400, 600, 800, 700};

        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;

        for (int i : arr) {
            System.out.print(i + " ");

            //Size of array
            System.out.println("Size of array : " + arr.length);
        }
    }
}

