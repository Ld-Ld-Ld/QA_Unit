package com.chap007javarevisited.examples;

public class JavaRevisited {
    public static String addHttp(String url){
        return "http://" + url;
    }

    public static String likelyGenderIs(String title){
        String likelyGender;
        switch(title.toLowerCase()){
            case"sir":
                likelyGender="M";
                break;
            case "mr":
                likelyGender="M";
                break;
            default:
                likelyGender = "F";
                break;

        }
        return likelyGender;
    }
}
