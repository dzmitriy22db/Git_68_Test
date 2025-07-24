package app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter( new FileWriter("data50.txt")) ; ){
            while (true) {
                System.out.println("Введите строку (или exit для выхода): ");
                String line = scanner.nextLine();

                if (line.equals("exit")){
                    break;
                }
                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

