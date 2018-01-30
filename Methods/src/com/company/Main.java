package com.company;

public class Main {

    public static void main(String[] args) {


//        int highScore = calculateScore(true, 800, 5, 100);
//
//        System.out.println(highScore);
//
//        highScore = calculateScore(true, 10000, 8, 200);
//        System.out.println(highScore );

        calculateHighScorePosition(1500, "Player A");
        calculateHighScorePosition(900, "Player B");
        calculateHighScorePosition(400, "Player C");
        calculateHighScorePosition(50, "Player D");

    }


    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position);
    }

    public static void calculateHighScorePosition( int playerScore, String playerName) {
        if (playerScore >= 1000) {
            displayHighScorePosition( playerName, 1);
        } else if ( playerScore > 500 && playerScore < 1000 ){
            displayHighScorePosition( playerName, 2);
        } else if ( playerScore <=500 && playerScore > 100 ) {
            displayHighScorePosition( playerName, 3);
        } else {
            displayHighScorePosition( playerName, 4);;
        }


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}

		return -1;

	}
}
