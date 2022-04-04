package fun.debes;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            try {
                File file = new File("vuorot.txt");
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String s;
                Scanner sc = new Scanner(System.in);
                System.out.println("Example: ma-8.45");
                System.out.println("'q' to quit");
                System.out.println("Give time: ");
                String str = sc.nextLine();
                String input = str;

                while ((s = br.readLine()) != null) {
                    if (s.contains(str)) {
                        String nextline = br.readLine();
                        System.out.println(nextline);
                        System.out.println(" ");
                    }
                }
                if(str.contains("q")) {
                    break;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}