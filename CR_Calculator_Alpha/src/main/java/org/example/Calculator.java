package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int AC;
        int HP;
        int dmgRound;
        int atkBonus;
        int saveDC;
        int offCR;
        int defCR;
        int CR;

        int a =1;

        System.out.println(2*a++ + 5 + a);
        System.out.println(a++ + ++a + ++a);



        DefensiveCR defensiveCR = new DefensiveCR();
        OffensiveCR offensiveCR = new OffensiveCR();
        Reference reference = new Reference();

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter AC: ");
//        AC = sc.nextInt ();
//        int is = reference.dmgToExpectedCR(AC);
//        System.out.println(is);

        //INPUT [uncomment & modify if required]
        System.out.print("Enter AC: ");
        AC = sc.nextInt ();

        System.out.print("Enter HP: ");
        HP = sc.nextInt ();

        System.out.print("Enter Attack Bonus: ");
        atkBonus = sc.nextInt ();

        System.out.print("Enter Damage per Round: ");
        dmgRound = sc.nextInt ();
        System.out.println();


        sc.close ();


//        dmgRound = 15;
//        atkBonus = 3;
//        HP = 86;
//        AC = 13;

        offCR = offensiveCR.calculateOffensiveCR(dmgRound,atkBonus,true);
        defCR = defensiveCR.calculateDefensiveCR(HP,AC);

        CR = (offCR+defCR)/2;

        System.out.println("AC = " + AC);
        System.out.println("HP = " + HP);
        System.out.println("Attack Bonus = " + atkBonus);
        System.out.println("Damage/Round = " + dmgRound);
        System.out.println("Offensive CR = " + offCR);
        System.out.println("Defensive CR = " + defCR);
        System.out.println();
        System.out.println("CR = " + CR);

    }




}