package com.yujia.www.chapter11;

import java.util.Random;

interface Game {
    void toss();
}

interface GameFactory {
    Game getGame();
}

class CoinGame implements Game {
    private Random rand = new Random();

    @Override
    public void toss() {
        System.out.print("Toss Coin: ");
        switch (rand.nextInt(2)) {
            case 0:
                System.out.println("Heads");
                break;
            default:
                System.out.println("Tails");
        }
    }
}

class DiceGame implements Game {
    private Random rand = new Random();

    @Override
    public void toss() {
        System.out.print("Toss Dice: ");
        System.out.println(rand.nextInt(6) + 1);
    }
}

class CoinGameFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new CoinGame();
    }
}

class DiceGameFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new DiceGame();
    }
}

public class Exercise11_19 {
    public static void play(GameFactory gameFactory) {
        Game game = gameFactory.getGame();
        game.toss();
    }

    public static void main(final String[] args) {
        play(new CoinGameFactory());
        play(new DiceGameFactory());
    }
}
