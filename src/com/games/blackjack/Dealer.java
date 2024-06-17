package com.games.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Dealer extends Player {
    private String name;
    private final List<Player> players = new ArrayList<>();

    public Dealer(String name) {
        super(name);
    }

    public void addPlayer(String playerName) {
        players.add(new Player(playerName));
    }
}