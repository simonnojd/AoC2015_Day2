package Puzzle1;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanFile = new Scanner(new File("src\\Puzzle1\\Database"));

        int paper_length = 0;

        while (scanFile.hasNext()) {
            int length;
            int width;
            int height;

            String[] temp = scanFile.next().split("x");

            length = Integer.parseInt(temp[0]);
            width = Integer.parseInt(temp[1]);
            height = Integer.parseInt(temp[2]);

            paper_length += ((2 * length * width) + (2 * width * height) + (2 * height * length));

            if (length >= width && length >= height) {
                paper_length += width * height;
            } else if (width >= height) {
                paper_length += length * height;
            } else {
                paper_length += length * width;
            }

        }

        System.out.printf("The required paper length: %d%n", paper_length);
    }
}