import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class problem2 {

    public static int getFileSize() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("./input1.txt"));

        int size = 0;
        while (scan.hasNextLine()) {
            size++;
            scan.nextLine();
        }
        return size;
    }

    public static int compareSum(int size) throws FileNotFoundException {

        int arr[] = new int[size];
        Scanner scan = new Scanner(new File("./input1.txt"));
        int count = 0;

        // scan file into array
        for (int i = 0; scan.hasNextLine(); i++) {
            arr[i] = Integer.parseInt(scan.nextLine());
        }

        for (int i = 3; i < arr.length; i++) {
            if (arr[i - 3] + arr[i - 2] + arr[i - 1] < arr[i] + arr[i - 2] + arr[i - 1]) {
                count++;
            }
        }

        // int sumArr[] = new int[(int) Math.ceil(size / 3)];
        // for (int i = 0; i < sumArr.length; i++) {
        // sumArr[i] = arr[i] + arr[i + 1] + arr[i + 2];
        // }

        // for (int i = 0; i < sumArr.length - 1; i++) {
        // if (sumArr[i + 1] > sumArr[i]) {
        // count++;
        // }
        // }
        return count;
    }

    public static void main(String args[]) throws FileNotFoundException {
        int size = getFileSize();

        System.out.println(compareSum(size));
    }
}
