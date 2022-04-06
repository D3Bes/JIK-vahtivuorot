package fun.debes;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws IOException, ParseException, InterruptedException {
        System.out.println("Enter 'q' to quit");
        while(true){

        JSONParser parser = new JSONParser();

        FileReader fr = new FileReader(".//files//ilvuorot.json");

        Object obj = parser.parse(fr);

        JSONObject vjo = (JSONObject) obj;



        Scanner scan = new Scanner(System.in);
        System.out.print("Enter day: ");
        String vkp = scan.nextLine();

        if(vkp.equals("q")) {
            System.out.println("Terminating...");
            TimeUnit.SECONDS.sleep(1);
            break;
        }


        if (vkp.contains("ma")) {

            System.out.println("Viikonpaiva: " + vkp);

            JSONArray array = (JSONArray) vjo.get("maanantai");

            if(array == null) {
                System.out.println("FATAL: Array is null!");
                break;
            }

            for(int i=0; i <array.size(); i++) {

                JSONObject jsonobj = (JSONObject) array.get(i);

                String valvoja1 = (String) jsonobj.get("8.45");
                String valvoja2 = (String) jsonobj.get("9.45");
                String valvoja3 = (String) jsonobj.get("10.45");
                String valvoja4 = (String) jsonobj.get("11.00");
                String valvoja5 = (String) jsonobj.get("11.45");
                String valvoja6 = (String) jsonobj.get("12.00");

                System.out.println("Valvojat:");
                System.out.println("8.45: " + valvoja1);
                System.out.println("9.45: " + valvoja2);
                System.out.println("10.45: " + valvoja3);
                System.out.println("11.00: " + valvoja4);
                System.out.println("11.45: " + valvoja5);
                System.out.println("12.00: " + valvoja6);
            }
        }
        if (vkp.contains("ti")) {

            System.out.println("Viikonpaiva: tiistai");

            JSONArray array = (JSONArray) vjo.get("tiistai");

            if(array == null) {
                System.out.println("FATAL: Array is null!");
                break;
            }

            for(int i=0; i <array.size(); i++) {

                JSONObject jsonobj = (JSONObject) array.get(i);

                String valvoja1 = (String) jsonobj.get("8.45");
                String valvoja2 = (String) jsonobj.get("9.45");
                String valvoja3 = (String) jsonobj.get("10.45");
                String valvoja4 = (String) jsonobj.get("11.00");
                String valvoja5 = (String) jsonobj.get("11.45");
                String valvoja6 = (String) jsonobj.get("12.00");

                System.out.println("Valvojat:");
                System.out.println("8.45: " + valvoja1);
                System.out.println("9.45: " + valvoja2);
                System.out.println("10.45: " + valvoja3);
                System.out.println("11.00: " + valvoja4);
                System.out.println("11.45: " + valvoja5);
                System.out.println("12.00: " + valvoja6);
            }
        }
        if (vkp.contains("ke")) {

            System.out.println("Viikonpaiva: keskiviikko");

            JSONArray array = (JSONArray) vjo.get("keskiviikko");

            if(array == null) {
                System.out.println("FATAL: Array is null!");
                break;
            }

            for(int i=0; i <array.size(); i++) {

                JSONObject jsonobj = (JSONObject) array.get(i);

                String valvoja1 = (String) jsonobj.get("8.45");
                String valvoja2 = (String) jsonobj.get("9.45");
                String valvoja3 = (String) jsonobj.get("10.45");
                String valvoja4 = (String) jsonobj.get("11.00");
                String valvoja5 = (String) jsonobj.get("11.45");
                String valvoja6 = (String) jsonobj.get("12.00");

                System.out.println("Valvojat:");
                System.out.println("8.45: " + valvoja1);
                System.out.println("9.45: " + valvoja2);
                System.out.println("10.45: " + valvoja3);
                System.out.println("11.00: " + valvoja4);
                System.out.println("11.45: " + valvoja5);
                System.out.println("12.00: " + valvoja6);
                }
            }
            if (vkp.contains("to")) {

                System.out.println("Viikonpaiva: torstai");

                JSONArray array = (JSONArray) vjo.get("torstai");

                if(array == null) {
                    System.out.println("FATAL: Array is null!");
                    break;
                }

                for(int i=0; i <array.size(); i++) {

                    JSONObject jsonobj = (JSONObject) array.get(i);

                    String valvoja1 = (String) jsonobj.get("8.45");
                    String valvoja2 = (String) jsonobj.get("9.45");
                    String valvoja3 = (String) jsonobj.get("10.45");
                    String valvoja4 = (String) jsonobj.get("11.00");
                    String valvoja5 = (String) jsonobj.get("11.45");
                    String valvoja6 = (String) jsonobj.get("12.00");

                    System.out.println("Valvojat:");
                    System.out.println("8.45: " + valvoja1);
                    System.out.println("9.45: " + valvoja2);
                    System.out.println("10.45: " + valvoja3);
                    System.out.println("11.00: " + valvoja4);
                    System.out.println("11.45: " + valvoja5);
                    System.out.println("12.00: " + valvoja6);
                }
            }
            if (vkp.contains("pe")) {

                System.out.println("Viikonpaiva: perjantai");

                JSONArray array = (JSONArray) vjo.get("perjantai");

                if(array == null) {
                    System.out.println("FATAL: Array is null!");
                    break;
                }

                for(int i=0; i <array.size(); i++) {

                    JSONObject jsonobj = (JSONObject) array.get(i);

                    String valvoja1 = (String) jsonobj.get("8.45");
                    String valvoja2 = (String) jsonobj.get("9.45");
                    String valvoja3 = (String) jsonobj.get("10.45");
                    String valvoja4 = (String) jsonobj.get("11.00");
                    String valvoja5 = (String) jsonobj.get("11.45");
                    String valvoja6 = (String) jsonobj.get("12.00");

                    System.out.println("Valvojat:");
                    System.out.println("8.45: " + valvoja1);
                    System.out.println("9.45: " + valvoja2);
                    System.out.println("10.45: " + valvoja3);
                    System.out.println("11.00: " + valvoja4);
                    System.out.println("11.45: " + valvoja5);
                    System.out.println("12.00: " + valvoja6);
                }
            }
        }
    }
}