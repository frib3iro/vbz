package br.states;

import java.awt.Graphics;

public class StateManager {

    public static final int numberState = 2;
    public static State[] states = new State[numberState];
    public static int currentState = 0;

    public static void setState(int state) {
        currentState = state;
        states[currentState].init();
    }

    public static State getState() {
        return states[currentState];
    }

    public StateManager() {

    }

    public void update() {
        states[currentState].update();
    }

    public void render(Graphics g) {
        states[currentState].render(g);
    }

}
