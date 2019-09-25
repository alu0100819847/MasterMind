package controller;

public abstract class Controller {

     protected State state;

     Controller(State state){
         this.state = state;
     }

    public abstract void accept(ControllerVisitor controllerVisitor);

    public void next() {
        this.state.next();
    }

}
