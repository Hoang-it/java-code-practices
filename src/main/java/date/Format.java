package date;

import interfaces.Problem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Format implements Problem {
    @Override
    public void description() {
        System.out.println("How to print date in specific format?");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: pattern");
        System.out.println("Output: data in that pattern format");
    }

    @Override
    public void solve() {
        String patterm = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patterm);
        String date = simpleDateFormat.format(new Date());
        System.out.println("Output: " + date);
    }
}
