package day2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class problem1 {

    public static int readFile() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("./input.txt"));
        int horizontalPos = 0;
        int depth = 0;
        int aim = 0;

        ArrayList<String> direction = new ArrayList<String>(1000);
        ArrayList<String> magnitude = new ArrayList<String>(1000);

        for (int i = 0; scan.hasNext(); i++) {
            direction.add(i, scan.next());
            magnitude.add(i, scan.next());
        }
        scan.close();

        for (int i = 0; i < magnitude.size(); i++) {
            if (direction.get(i).equals("forward")) {
                horizontalPos += Integer.parseInt(magnitude.get(i));
            } else if (direction.get(i).equals("down")) {
                depth += Integer.parseInt(magnitude.get(i));
            } else if (direction.get(i).equals("up")) {
                depth -= Integer.parseInt(magnitude.get(i));
            }
        }

        return horizontalPos * depth;
    }

    public static void main(String args[]) throws FileNotFoundException {
        System.out.println(readFile());
    }
}
