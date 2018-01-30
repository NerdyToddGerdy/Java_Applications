package com.company;

import java.util.Scanner;

public class Main {

    private static boolean currentPlayerBoolean = true;
    private static Pokemon currentPlayer;
    private static Pokemon opponentPlayer;
    private static boolean gameOver = false;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pokemon player1 = new Pokemon("Pika", 60,"Thunderbolt", 40,"Quick Attack", 20,"Thunderwave", 10,"Tackle", 20);

        Pokemon player2 = new Pokemon("Mush", 40, "Scratch", 30, "Stun Spore", 10, "Giga Drain", 30, "absorb", 10 );
//        attackPhase(sc, player1, player2);

        while (!gameOver) {
            chooseCurrentPlayer(player1, player2);
            attackPhase(sc, currentPlayer);
            currentPlayerBoolean = !currentPlayerBoolean;
        }

    }

    private static void chooseCurrentPlayer (Pokemon player1, Pokemon player2) {
        if (currentPlayerBoolean) {
            currentPlayer = player1;
            opponentPlayer = player2;
            System.out.println(currentPlayer.getName() + " it is your turn.");
        } else {
            currentPlayer = player2;
            opponentPlayer = player1;
            System.out.println(currentPlayer.getName());
        }
    }

    private static void attackPhase(Scanner sc, Pokemon player1) {
        System.out.println(currentPlayer.getName() + " health: " + currentPlayer.getHp() + "    " + opponentPlayer.getName() + " health: " + opponentPlayer.getHp());
        System.out.println("1- " + currentPlayer.getAttack1() + " deals " + currentPlayer.getAttack1Damage());
        System.out.println("2- " + currentPlayer.getAttack2() + " deals " + currentPlayer.getAttack2Damage());
        System.out.println("3- " + currentPlayer.getAttack3() + " deals " + currentPlayer.getAttack3Damage());
        System.out.println("4- " + currentPlayer.getAttack4() + " deals " + currentPlayer.getAttack4Damage());

        System.out.print(currentPlayer.getName() + " Choose attack # ");
        int answer = sc.nextInt();
        int damage = currentPlayer.attack(answer);
        opponentPlayer.setHp(opponentPlayer.getHp() - damage);
        checkIfOver(currentPlayer, opponentPlayer);
    }


    public static void checkIfOver(Pokemon currentPlayer, Pokemon opponentPlayer) {
        if (currentPlayer.getHp() <=  0) {
            System.out.println(opponentPlayer.getName() + " wins");
            gameOver = true;
        } else if (opponentPlayer.getHp() <= 0) {
            System.out.println(currentPlayer.getName() + " wins");
            gameOver = true;
        } else {
            System.out.println("Keep going");
            gameOver = false;
        }
    }
}
