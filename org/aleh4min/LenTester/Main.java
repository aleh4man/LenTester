package org.aleh4min.LenTester;

import org.aleh4min.LenTester.Primers.AddPrimer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; ++i) {
            AddPrimer ap = new AddPrimer(30);
            do {
                System.out.println(ap);
                String tmp = sc.nextLine();
                ap.setUserAnswer(tmp);
            } while(!ap.isAnswerRight());
        }
    }
}