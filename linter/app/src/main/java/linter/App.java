 /*
  * This Java source file was generated by the Gradle 'init' task.
  */
 package linter;

 import java.io.File;
 import java.io.FileNotFoundException;
 import java.util.Scanner;
 public class App {

     public static void main(String[] args) {
         try {

             File myObj = new File("./app/src/main/resources/gates.js");
             Scanner myReader = new Scanner(myObj);
             int value = 1;
             while (myReader.hasNextLine()) {
                 String line = myReader.nextLine();
                 if (!line.endsWith(";") && !line.endsWith("}") && !line.endsWith("{") && !line.contains("else") && !line.contains("if") && !line.equals("")) {

                     String printLine = "Line " + value + " : Missing semicolon.";
                     System.out.println(printLine);
                 }
                 value++;
             }
             myReader.close();
         } catch (FileNotFoundException e) {
             System.out.println("An error occurred.");
             e.printStackTrace();
         }
     }
 }
