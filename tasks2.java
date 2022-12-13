package homeWork1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class tasks2 {
    public static void main(String[] args) {
        System.out.println(isItPalindrome(inputString())); // задача 1
        replay(repeat(inputString())); // задача 2
    }

    public static String inputString(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите текст");
        return iScanner.nextLine();
    }
    public static boolean isItPalindrome(String s) {
        String replaced = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuffer(replaced).reverse().toString();
        return reversed.equals(replaced);
    }

    public static String repeat(String a){
        String rep = a.repeat(10);
        System.out.println(rep);
        return rep;
    }

    public static void replay(String rep) {
        File file = new File("src/main/resources/file/home.txt");
        FileWriter fr = null;
        try{
            fr = new FileWriter(file);
            fr.write(rep);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                fr.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        }

}
