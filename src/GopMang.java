import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int size1, size2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập độ dài của mảng 1: ");
        size1 = sc.nextInt();

        System.out.print("Nhập độ dài của mảng 2: ");
        size2 = sc.nextInt();

        int[] array1 = new int[size1];
        int[] array2 = new int[size2];

        for (int i = 0; i < size1; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng 1: ");
            array1[i] = sc.nextInt();
        }

        for (int j = 0; j < size2; j++) {
            System.out.print("Nhập phần tử thứ " + (j + 1) + " của mảng 2: ");
            array2[j] = sc.nextInt();
        }

        int size3 = size1 + size2;
        int[] array3 = new int[size3];

        for (int k = 0; k < size1; k++) {
            array3[k] = array1[k];
        }
        for (int m = 0; m < size2; m++) {
            array3[m + size1] = array2[m];
        }
        for (int l = 0; l < size3; l++) {
            System.out.print(array3[l] + "\t");
        }
    }
}
