package com.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHome {

    public static void main(String[] args) {

    String input;

    Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("An email address is a designation for an electronic " +
            "mailbox that sends and receives messages, known as email, " +
            "on a computer network. Since the 1980s, all email addresses follow the same format: @. " +
            "An example is below. On the far right, the .com component represents the top level " +
            "domain (TLD) for the email address. An email address, such as john.smith@example.com, " +
            "is made up from a local-part, the symbol @, and a domain, " +
            "which may be a domain name or an IP address enclosed in brackets. " +
            "A professional email address is one that includes the name of the business domain. " +
            "For example, peter.parker@bookhouse.com is a professional email address.");

    while(matcher.find())
        System.out.println(matcher.group());



    }
}
