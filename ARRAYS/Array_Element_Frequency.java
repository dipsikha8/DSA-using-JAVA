import java.util.Scanner;

class Array_Element_Frequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");

        int size = s.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Array is :");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
        frequency(a);
    }

    static void frequency(int[] a) {
        boolean[] visited = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            if (visited[i]) {
                continue;
            }
            int ele = a[i];
            int c = 0;
            for (int j = 0; j < a.length; j++) {
                if (ele == a[j]) {
                    c++;
                    visited[j] = true;
                }
            }
            System.out.println("Frequency of " + ele + " is: " + c);
        }
    }
}
