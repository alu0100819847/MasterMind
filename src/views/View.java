package views;

import controller.Controller;

import controller.ControllerVisitor;

public interface View extends ControllerVisitor {

    void interact(Controller controller);

}
