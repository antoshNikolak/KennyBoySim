package GameState;

import java.util.LinkedList;
import java.util.ListIterator;

public class StateManager {

    private LinkedList<BaseState> states = new LinkedList<>();

    public StateManager() {

    }

    public void updateCurrentState(double delta){
        states.getLast().handleGame(delta);
    }

//    public void update(){
//        ListIterator<BaseState> stateItr = states.listIterator(states.size());
//        while (stateItr.hasPrevious()){
//            BaseState state = stateItr.previous();
//            if (!state.blocksUpdate){
//                state.update();
//            }else {
//                break;
//            }
//        }
//    }



    public void pushState(BaseState state){
        states.add(state);
    }

    public void popState(){
        states.removeLast();
    }

//    public BaseState getCurrentState(){
//        return states.getLast();
//    }
}
