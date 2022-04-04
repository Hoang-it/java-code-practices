package string;

import interfaces.Problem;

public class RemoveWhitespace implements Problem {
    @Override
    public void description() {
        System.out.println("How to remove Whitespaces from String");
        System.out.println("Ref: https://www.journaldev.com/370/java-programming-interview-questions");
        System.out.println("Input: a string");
        System.out.println("Ouptut: a string without whitespace");
    }

    public String removeWhitespace(String input){
        StringBuilder output = new StringBuilder();

        char[] charArray = input.toCharArray();
        for(char c: charArray){
            if(!Character.isWhitespace(c)){
                output.append(c);
            }
        }
        return output.toString();
    }


    @Override
    public void solve() {
        String test = "Tôi tên là Hoàng";
        System.out.println("Input: " + test);
        System.out.println("Output: " + removeWhitespace(test));
    }
}
