package fun.debes;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("vuorot1.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s;
            Scanner sc = new Scanner(System.in);
            System.out.println("Example: ma-8.45");
            System.out.println("Give time: ");
            String str = sc.nextLine();
            String input = str;

            while ((s = br.readLine()) != null) {
                if (s.contains(str)) {
                    String nextline = br.readLine();
                    System.out.println(nextline);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}