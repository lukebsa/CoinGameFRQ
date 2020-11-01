public class CoinGame {
    private int startingCoins; // starting number of coins
    private int maxRounds; // maximum number of rounds played

    public CoinGame(int s, int r) {
        startingCoins = s;
        maxRounds = r;
    }

    // Returns the number of coins (1, 2, or 3) that player 1 will spend
    public int getPlayer1Move () {
        // Implemented this method using random numbers for testing purposes
        int result;
        int rand = (int) (Math.random()*(3-1+1)+1);
        if (rand%3 == 0) {
            result = 3;
        }
        else if (rand%2 == 0) {
            result = 2;
        }
        else {
            result = 1;
        }
        return result;
    }

    // Returns the number of coins (1, 2, or 3) that player 2 will spend, as described in part a
    public int getPlayer2Move (int round) {
        int result;
        if (round%3 == 0) {
            result = 3;
        }
        else if (round%2 == 0) {
            result = 2;
        }
        else {
            result = 1;
        }
        return result;
    }

    // Plays a simulated game between two players, as described in part b
    public void playGame() {
        int round;
        int player1Coins = startingCoins;
        int player2Coins = startingCoins;
        for (round = 1; round <=maxRounds; round++) {
            // Same rule
            if (getPlayer1Move() == getPlayer2Move(round)) {
                player2Coins++;
            }
            // Off-by-one rule
            else if (Math.abs(getPlayer1Move() - getPlayer2Move(round)) == 1) {
                player2Coins++;
            }
            // Off-by-two rule
            else {
                player2Coins += 2;
            }
        }
        if (player1Coins > player2Coins) {
            System.out.println("player 1 wins");
        }
        else if (player2Coins > player1Coins) {
            System.out.println("player 2 wins");
        }
        else {
            System.out.println("tie game");
        }
        // Added for testing purposes
        System.out.println("Player 1 final balance: " + player1Coins);
        System.out.println("Player 2 final balance: " + player2Coins);
    }


}