package controller;

public interface ControllerVisitor {

    void visit(GameController gameController);

    void visit(SolutionController solutionController);

    void visit(AttemptController attemptController);

}
