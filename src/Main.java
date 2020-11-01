public class Main {

    public static void main(String[] args) {
        System.out.println("Game with 3 starting coins and 4 rounds.");
	    CoinGame game1 = new CoinGame(3, 4);
	    game1.playGame();

        System.out.println("Game with 5 starting coins and 8 rounds.");
        CoinGame game2 = new CoinGame(5, 8);
        game2.playGame();

        System.out.println("Game with 6 starting coins and 2 rounds.");
        CoinGame game3 = new CoinGame(6, 2);
        game3.playGame();

        System.out.println("Game with 4 starting coins and 2 rounds.");
        CoinGame game4 = new CoinGame(4, 2);
        game4.playGame();

    }
}
