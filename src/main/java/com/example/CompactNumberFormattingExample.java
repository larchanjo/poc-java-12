package com.example;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;

public class CompactNumberFormattingExample {

  public static void main(String[] args) {
    NumberFormat shortNumberFormat = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
    String shortNumber = shortNumberFormat.format(1000000);
    System.out.println(shortNumber);

    NumberFormat longNumberFormat = NumberFormat.getCompactNumberInstance(Locale.US, Style.LONG);
    String longNumber = longNumberFormat.format(1000000);
    System.out.println(longNumber);
  }

}
