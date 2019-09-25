package controller;

public class AttemptController extends Controller{

    AttemptController(State state){
        super(state);
    }

    public void nextAttempt(String attemptInput){
        this.state.getGame().nextAttempt(attemptInput);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
