import java.util.ArrayList;

public class Channel implements Subject {
    private ArrayList<Observer> observers;
    private String channelName;
    private String status;

    public Channel(ArrayList<Observer> observers, String channelName, String status) {
        this.observers = observers;
        this.channelName = channelName;
        this.status = status;
    }

    public Channel(String channelName, String status) {
        this.observers = new ArrayList<Observer>();
        this.channelName = channelName;
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void notifyObserver() {
        for (Observer i : this.observers)
            i.update(getStatus());
    }

    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }
}