package string;

import interfaces.Problem;

public class ResersedString implements Problem {
    @Override
    public void description() {
        System.out.println("How to reverse a String in Java?");
        System.out.println("Input : String (Hoang)");
        System.out.println("Output : String reserved (gnaoH)");
    }

    public String reserve(String in){
        if (in == null) throw new IllegalArgumentException("In not null");
        StringBuilder out = new StringBuilder();
        char[] chars = in.toCharArray();
        for(int i=chars.length - 1; i >= 0; i--){
            out.append(chars[i]);
        }
        return out.toString();
    }

    @Override
    public void solve() {
        System.out.println("======SOVLE=======");
        String str = "Hoang";
        System.out.println("Input: " + str);
        System.out.println("Output: " + reserve(str));
    }
}
