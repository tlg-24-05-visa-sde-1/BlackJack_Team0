package com.games.blackjack.controller;

import static com.apps.util.Console.*;
import com.apps.util.Console;
import com.apps.util.Prompter;
import com.games.blackjack.Dealer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class BlackJackController {
    private final Prompter prompter = new Prompter(new Scanner(System.in));
    private final Dealer dealer = new Dealer("D E A L E R");

    public void execute() {
        welcome();
        promptForPlayers();
    }

    private void promptForPlayers() {
        clear();

        boolean done = false;
        while (!done) {
            String input = prompter.prompt("Enter player name, or press [Enter] when done: ");
            if (!input.trim().isEmpty()) {
                dealer.addPlayer(input);
            }
            else {
                done = true;
            }
        }
        goodbye();
    }

    private void goodbye() {
        clear();
        String text = "T H A N K S   F O R   P L A Y I N G";

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            Console.pause(100);
        }
        pause(2000);
        clear();
    }

    private void welcome() {
        try {
            clear();
            String welcome = Files.readString(Path.of("resources/welcome.txt"));
            System.out.println("\n" + welcome + "\n");
            pause(3000);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}