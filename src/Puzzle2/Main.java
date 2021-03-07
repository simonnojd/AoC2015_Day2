package Puzzle2;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanFile = new Scanner(new File("src\\Puzzle1\\Database"));

        int paper_length = 0;
        int ribbon_length = 0;

        while (scanFile.hasNext()) {

            String[] temp = scanFile.next().split("x");

            int length = Integer.parseInt(temp[0]);
            int width = Integer.parseInt(temp[1]);
            int height = Integer.parseInt(temp[2]);

            paper_length += ((2 * length * width) + (2 * width * height) + (2 * height * length));

            if (length >= width && length >= height) {
                paper_length += width * height;
                ribbon_length += 2 * width + 2 * height;
            } else if (width >= height) {
                paper_length += length * height;
                ribbon_length += 2 * length + 2 * height;
            } else {
                paper_length += length * width;
                ribbon_length += 2 * length + 2 * width;
            }
                ribbon_length += length * width * height;
        }

        System.out.printf("The required paper length: %d%n", paper_length);
        System.out.printf("The required ribbon length: %d%n", ribbon_length);
    }
}