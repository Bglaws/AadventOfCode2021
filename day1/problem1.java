import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class problem1 {

    public static int getFileSize() throws FileNotFoundException{
        Scanner scan = new Scanner(new File("./input1.txt"));

        int size = 0;
        while(scan.hasNextLine()) {
            size++;
            scan.nextLine();
        }
        return size;
    }

    public static int readFile(int size) throws FileNotFoundException {
        int arr[] = new int[size];
        Scanner scan = new Scanner(new File("./input1.txt"));

        for(int i = 0; i < size - 1; i++) {
            arr[i] = Integer.parseInt(scan.nextLine());
        }

        int count = 0;
        for (int i = 0; i < size -1 ; i++) {
            if (arr[i + 1] > arr[i]) {
                count++;
            }
        }
        
        return count;
    }
    public static void main (String args[]) throws FileNotFoundException {
        int size = getFileSize();
	    
        System.out.println(readFile(size)); 
    }

}
