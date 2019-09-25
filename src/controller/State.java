package controller;

import models.Game;

public class State {

    private StateValue stateValue;

    private Game game;

    public State() {
        this.stateValue = StateValue.initialize;
        this.game = new Game();
    }

    public void next() {
        if(this.stateValue.ordinal() < 3) {
            this.stateValue = StateValue.values()[this.stateValue.ordinal() + 1];
        } else {
            if(game.getAttemptNumber() < 10 && !game.isWon()){
                this.iterate();
            } else{
                this.stateValue = StateValue.values()[this.stateValue.ordinal() + 1];
            }
        }
    }

    public void reset() {
        this.stateValue = StateValue.initialize;
    }

    public void iterate(){
        this.stateValue = StateValue.printSolution;
    }

    public StateValue getValueState() {
        return this.stateValue;
    }

    public Game getGame(){
        return this.game;
    }

}
