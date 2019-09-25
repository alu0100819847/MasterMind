package controller;

import models.Attempt;

import java.util.ArrayList;

public class GameController extends Controller {


       public GameController(State state){
              super(state);
       }

       public void start(){
              this.state.getGame().start();
       }

       public boolean isWon(){
              return this.state.getGame().isWon();
       }

       public ArrayList<Attempt> getAttempt(){
              return  this.state.getGame().getAttempt();
       }

       public int getAttemptNumber(){
              return  this.state.getGame().getAttemptNumber();
       }

       public void accept(ControllerVisitor controllerVisitor){
              controllerVisitor.visit(this);
       }

       public int getStateValue(){
              return state.getValueState().ordinal();
       }

       public void reset(){
              this.state.reset();
              this.state.getGame().start();
       }

}
