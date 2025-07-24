package ObserverDesignPattern;

interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
