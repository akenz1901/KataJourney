package coderbyteAlgorithm;

import java.util.*;
import java.io.*;
import java.net.*;

class AgeCount {
    public static void main (String[] args) {
        String url = "https://coderbyte.com/api/challenges/json/age-counting";

        try{
            URL urlOb = new URL(url);

            InputStream conn = urlOb.openStream();
            InputStreamReader isR = new InputStreamReader(conn);
            BufferedReader reader = new BufferedReader(isR);
            StringBuilder json = new StringBuilder();

            int c;
            while((c = reader.read()) != -1){
                json.append((char) c);
            }
            System.out.println(json);

            String[] arrJson = json.toString().split("");
            System.out.println(arrJson[0]);
//            int count = 0;
//            for(String field:arrJson){
//                String[] each = field.split("=");
//                if(each[0].strip().equals("age") && Integer.parseInt(each[1].strip())>=50){
//                    count++;
//                    System.out.println(count);
//                }
//            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}