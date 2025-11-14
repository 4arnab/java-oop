package com;

import java.util.regex.Pattern;

public class EmailExtractor extends ExtractorReport{
    static String  emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final Pattern PATTERN = Pattern.compile(emailRegex);

    @Override
    public Pattern getPatter() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Email Report";
    }
}
