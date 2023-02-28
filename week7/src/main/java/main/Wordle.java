package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Wordle {
    
    private final static String FILENAME = "words.txt";
    private int attempt;
    private String word;
    private String[] words;

    private final static String RESET = "\u001B[0m";
    private final static String GREEN = "\u001B[32m";
    private final static String YELLOW = "\u001B[33m";


    public Wordle() {
        attempt = 1;
        readFile();
    }
    
    public int getAttempt() {
        return this.attempt;
    }

    public String getWord() {
        word = words[(int)(Math.random() * words.length)];
        return word;
    }


    private void readFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
            String line;
            while ((line = reader.readLine()) != null) {
                words = line.split(" ");
            }
            reader.close();

        } catch (IOException e) {
            //System.out.println("Virhe haettaessa dataa");
            e.printStackTrace();
        }
    }

}
