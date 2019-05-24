package MessageBoard;

import java.util.Observable;
import java.util.Observer;

public class MessageBoard {
    public static void main(String[] args) {
        new MessageBoard();
    }

    public MessageBoard() {
        NotificationBoard board = new NotificationBoard();
        Student bob = new Student();
        Student joe = new Student();

        board.addObserver(bob);
        board.addObserver(joe);

        board.changeMessage("More Homework!");
    }


    class NotificationBoard extends Observable {

        public void changeMessage(String message) {
            setChanged();
            notifyObservers(message);
        }
    }


    class Student implements Observer {

        public void update(Observable o, Object arg) {
            System.out.println("Message board changed: " + arg);
        }
    }
}