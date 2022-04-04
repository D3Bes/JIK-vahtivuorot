package fun.debes;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Example: ma-8.45");
        while(true) {
            try {
                File listfile = new File("vuorot.txt");

                FileReader fr = new FileReader(listfile);
                BufferedReader br = new BufferedReader(fr);


                Scanner sc = new Scanner(System.in);

                System.out.println("'q' to quit");
                System.out.println("Give time: ");

                String s;
                String str = sc.nextLine();

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
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}