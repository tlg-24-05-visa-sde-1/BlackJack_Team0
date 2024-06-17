package com.games.blackjack.client;

import com.games.blackjack.controller.BlackJackController;

class Main {

    // instantiate controller and say "go"
    public static void main(String[] args) {
        BlackJackController app = new BlackJackController();
        app.execute();
    }
}