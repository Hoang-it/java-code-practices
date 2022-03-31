package string;

import interfaces.Problem;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class CompareString implements Problem {
    private Logger logger = LogManager.getLogger(CompareString.class);

    @Override
    public void description() {
        BasicConfigurator.configure();
        logger.info("How to compare two strings ?");
        logger.info("Ref: https://www.tutorialspoint.com/javaexamples/string_compare.htm");
    }

    @Override
    public void solve() {
        String str = "Hello World";
        String anotherString  = "hello world";
        Object objStr = str;

        logger.info("Use compareTo");
        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString));
        System.out.println(str.compareTo(objStr.toString()));

        logger.info("Use equals()");
        System.out.println(str.equals(str));
        System.out.println(str.equals(anotherString));
        System.out.println(str.equals(objStr.toString()));

        logger.info("== operator");
        System.out.println(str == anotherString);
        System.out.println(str == objStr.toString());

    }
}
