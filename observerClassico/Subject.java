package observerClassico;

import java.util.ArrayList;
import java.util.List;

// sujeito - mantem umka lista de observers e os notifica quando ha mudancas
public class Subject {
    private String state;

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        //adiciona o observer na lista
        observers.add(observer);
    }

    public void detach(Observer observer) {
        //remove o observer da lista
        observers.remove(observer);
    }

    //notifica todos os observers registrados sobre uma mudança
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    public String getState() {
        return state;
    }
}
