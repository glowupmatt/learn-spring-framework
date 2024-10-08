package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.game.GameRunner;
import com.in28minutes.game.GamingConsole;
import com.in28minutes.game.PacManGame;


@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        PacManGame game = new PacManGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

}
