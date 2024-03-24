package multithreading;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.concurrent.Exchanger;

class ExchangerSynchronization {
    public static void main(String[] args) {
Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Actions = List.of(Action.PAPER, Action.SCISSORS, Action.STONE);
        List<Action> friend2Actions = List.of(Action.STONE, Action.SCISSORS, Action.PAPER);
        new BestFriend("Igor", friend1Actions, exchanger).start();
        new BestFriend("Arnold", friend2Actions, exchanger).start();
    }
}
enum Action {
    STONE, SCISSORS, PAPER
}
@NoArgsConstructor@AllArgsConstructor
class BestFriend extends Thread{
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    private void whoWins(Action myAction, Action friendsAction){
        if(myAction == friendsAction){
            System.out.println("Tie");
        }
        else if((myAction == Action.STONE && friendsAction == Action.SCISSORS) ||
                (myAction == Action.SCISSORS && friendsAction == Action.PAPER) ||
                (myAction == Action.PAPER && friendsAction == Action.STONE)){
            System.out.println(name + " wins");
        }
        else {
            System.out.println(name + " loses");
        }
    }
    public void run(){
        Action reply;
        for(Action action: myActions){// перебираем все действия из списка myActions и обмениваемся ими с другом (потоком) через exchanger
            try {
                reply = exchanger.exchange(action);// обмен действиями с другом (потоком) и получение ответа от него (потока) в переменную reply
                whoWins(action, reply);// определение победителя
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
