package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> emailListe = new ArrayList<>();
	    File CSVDatei = new File("E:/Eclipse/Workspace/CSVAuslesen/src/csv/email.csv");
        Scanner sc = new Scanner(CSVDatei);
        sc.useDelimiter("\n");
        while (sc.hasNext())
        {
            emailListe.add(sc.next() + " , ");
        }

        System.out.println(emailListe.get(1));
        sc.close();
    }
}
