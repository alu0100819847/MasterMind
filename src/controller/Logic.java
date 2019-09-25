package controller;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    private Map<StateValue, Controller> acceptorControllers;
    private State state;

    public Logic() {
        this.state = new State();
        this.acceptorControllers = new HashMap<>();
        this.acceptorControllers.put(StateValue.initialize, new GameController(this.state));
        this.acceptorControllers.put(StateValue.printSolution, new SolutionController(this.state));
        this.acceptorControllers.put(StateValue.printResult, new GameController(this.state));
        this.acceptorControllers.put(StateValue.nextAttempt, new AttemptController(this.state));
        this.acceptorControllers.put(StateValue.gameEnd, new GameController(this.state));
        this.acceptorControllers.put(StateValue.exit, null);
    }

    public Controller getController() {
        return this.acceptorControllers.get(this.state.getValueState());
    }

}
