class Sujeito {
    Set<Observador> observadores = new HashSet<Observador>();

    public void anexar(Observador observador) {
        observadores.add(observador);
    }

    public void desanexar(Observador observador) {
        observadores.remove(observador);
    }
    
    public void notificar() {
        for (Observador ob : observador) {
            ob.atualizar();
        }
    }
}

interface Observador {
    public void atualizar();
}

class Obra extends Sujeito {
    private StatusObra statusObra;
}

class Exposicao implements Observador {
    public void atualizar();
}