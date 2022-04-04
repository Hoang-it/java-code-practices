package string;

import interfaces.Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckInTextFile implements Problem {
    @Override
    public void description() {
        System.out.println("How to find if a string is present in a text file?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: string, text file");
        System.out.println("Output: boolean");
    }

    @Override
    public void solve() {
        String filePath = "C:\\Users\\hoang\\IdeaProjects\\java-code-practices\\src\\main\\java\\string\\CheckInTextFile.java";
        String test = "CheckInTextFile";
        System.out.println("Input: " + filePath + ", " + test);
        try {
            System.out.println("Output: " + findStringInFile(test, filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean findStringInFile(String str, String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            if (line.contains(str)){
                scanner.close();
                return true;
            }
        }
        scanner.close();
        return false;
    }
}
