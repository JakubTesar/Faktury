package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String[]> data = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("VF_2015.dat"));

            String nextline = br.readLine();
            while (nextline != null) {
                String[] row = nextline.split(",");
                data.add(row);

                nextline = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("VF_2015.csv"));

            for (int i = 0; i < data.size(); i++) {
                bw.write(data.get(i)[0]);
                bw.newLine();
            }

        bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        ///
    }
}
