package com.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileMismatchExample {

  public static void main(String[] args) throws IOException {
    File fileOne = File.createTempFile("file-one", ".txt");
    fileOne.deleteOnExit();
    Files.writeString(fileOne.toPath(), "I am testing the new File method");

    File fileTwo = File.createTempFile("file-two", ".txt");
    fileTwo.deleteOnExit();
    Files.writeString(fileTwo.toPath(), "I am testing the new File method");

    long mismatch = Files.mismatch(fileOne.toPath(), fileTwo.toPath());
    System.out.println("Mistmatch result = " + mismatch);
  }

}
