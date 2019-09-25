package controller;

public class SolutionController extends Controller{

    SolutionController(State state){
        super(state);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor){
        controllerVisitor.visit(this);
    }

}
