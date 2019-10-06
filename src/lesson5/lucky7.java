package lesson5;

import java.util.Scanner;

public class lucky7 {

    public static void main(String[] args) {
        dice d1 = new dice();
        int com;
        dice d2 = new dice();
        d1.roll();
        d2.roll();
        Scanner s = new Scanner(System.in);
        int money, rolls = 0, ogmoney, highrolls = 0;

        System.out.print("How much money you have in $? ");
        money = s.nextInt();
        ogmoney = money;
        while (true) {
            rolls++;
            d1.roll();
            d2.roll();
            money--;
            int total = d1.getValue() + d2.getValue();
            if (total == 7) {
                money += 4;
            }
            if (money >= ogmoney) {
                highrolls = rolls;
                ogmoney = money;
            }
            if (money == 0) {
                break;
            }
        }
        System.out.println("You are broke after " + rolls + " rolls");
        System.out.println("You should have quit after " + highrolls + " rolls when you had $" + ogmoney);
         com = (int) (Math.random() * 100 + 1);
         System.out.println(""+com);
    }

}
