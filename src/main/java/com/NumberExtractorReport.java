package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractorReport extends  ExtractorReport
{
   private static final Pattern PATTERN = Pattern.compile("^[0-9]*$");

    @Override
    public Pattern getPatter() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Number Extractor";
    }
}
