package com.pluralsight;
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the story: ");
        String storyName = scanner.nextLine();

        String fileName = storyName + ".txt";
        File storyFile = new File("BedtimeStories/" + fileName);

        System.out.println("Looking for file at: " + storyFile.getAbsolutePath());

        try {
            Scanner fileScanner = new Scanner(storyFile);
            int lineNumber = 1;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }

            fileScanner.close();
        } catch (FileNotFoundException e){
            System.out.println("Sorry, the story file "  + fileName + " was not found.");
        }



        scanner.close();

    }
}