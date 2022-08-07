package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {

        //klass Pattern pozvolit zadati regex. V compile peredaetsea regex:
        // CASE_INSENSITIVE ctob iskal v oboih slucaeah
        Pattern pattern = Pattern.compile("stepIT", Pattern.CASE_INSENSITIVE);

        //Matcher eto obiekt klassa kot budet iskati sovpadenia. u kot esti metod find
        //peredaem nash text
        Matcher matcher = pattern.matcher("Visit stepIt!");

        //peremennaia tipa boolean - naideno ili net
        //i resultat vizova metoda matcher.find()
        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32")); //true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kvvarun32")); //false
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JKG32f")); //true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2")); //false
        System.out.println("-----------------------");
        System.out.println(Pattern.matches("[798][0-9]{9}", "9953038949")); //true
        System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949")); //false
        System.out.println(Pattern.matches("[789]{2}\\d{9}", "79530389490")); //true

        String EXAMPLE_TEST = "This is an example of a text , please check if it got corrected . here !";
        String pattern1 = "(\\w)(\\s+)([\\.,\\?\\!])";
        //nahodit probeli pered .,?! i delaet replace
        // $1$3 eto formula. udaleaet probeli
        System.out.println(EXAMPLE_TEST.replaceAll(pattern1, "$1$3"));

        final String EXAMPLE_TEXT = "This is my small example " +
                "String which I'm going to " + " use for pattern matching.";
        System.out.println("is this string not empty? " + EXAMPLE_TEST.matches("\\w.+"));

        //ishem 1 i bolee probel, razdeleam po nemu i formiruem massiv strok
        String[] splitString = (EXAMPLE_TEST.split("\\s+"));
        System.out.println(splitString.length);
        for(String string: splitString) {
            System.out.println(string);
        }
        //zamenil na tab vse probeli
        System.out.println(EXAMPLE_TEXT.replaceAll("\\s", "\t"));
    }
}
