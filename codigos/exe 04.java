class Restauracao {
    Set<Observer> observers = new HashSet<Observer>();

    public void anexar(Observer observer) {
        observers.add(observer);
    }

    public void desanexar(Observer observer) {
        observers.remove(observer);
    }
    
    public void notificar() {
        for (Observer ob : observers) {
            ob.atualizar();
        }
    }
}

abstract class Observer {
    public abstract void atualizar();
}

class ObserverFimRestauracao {
    @Override
    public void atualizar() {
        //Aqui ele executa o código...
    }
}