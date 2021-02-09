package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("seznam-spolecnosti.dat"));
            String SeznaSpolecnosti = br.readLine();
            String content = "";
            String[] SeznamSpolecnostipole ={""};

            while (SeznaSpolecnosti != null){
                content += SeznaSpolecnosti;
                SeznaSpolecnosti = br.readLine();
            }
            while (content != null){
                SeznamSpolecnostipole = content.split(":");
            }
            for (int i = 0; i < SeznamSpolecnostipole.length; i++) {
                System.out.println(SeznamSpolecnostipole[i]);
            }

            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
