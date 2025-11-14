package com;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class ExtractorReport {
    abstract public  Pattern getPatter();
    abstract  public String getReportName();

    public String parse(InputStream path) throws FileNotFoundException{
        String out = "";

        Scanner scanner = new Scanner(path);
        if(!scanner.hasNext()){
            return "Empty file";
        }

        while (scanner.hasNext()){
            String nextLine = scanner.nextLine(); // storing next line while we have a next line
            Matcher matcher = getPatter().matcher(nextLine); //

            boolean matches = matcher.matches(); // if matches out
            if (matcher.matches()) {
                out += nextLine + "\n";
            }
        }
        if (out.isBlank()) {
            return "Empty file";
        }

        return out;
    }
    public void prepareAndSendReport(InputStream path){
        try{
        System.out.println("Starting report "+getReportName()+ "...");
        String report = parse(path);
        System.out.println(report);
        System.out.println("Sent report "+getReportName());

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage() + "THIS IS FROM THE SEND REPORT");
        }
    }
}
