class Obra {
    private StatusObra statusObra;

    public void definirMemento(StatusObraMemento memento) {
        statusObra = memento.getStatusObra();
    }

    public StatusObraMemento criarMemento() {
        return new StatusObraMemento(this, statusObra);
    }
    
    public StatusObra getStatusObra() {
        return statusObra;
    }
    
    public void setStatusObra(StatusObra value) {
        statusObra = value;
    }
}

class StatusObraMemento {
    private StatusObra statusObra;
    private Obra obra;

    public StatusObraMemento(Obra obra, StatusObraMemento status) {
        this.obra = obra;
        statusObra = status;
    }

    public StatusObra getStatusObra() {
        return statusObra;
    }
    
    public Obra getObra() {
        return obra;
    }
}

class ControleRestauracao {
    List<StatusObraMemento> mementos = new ArrayList<StatusObraMemento>();

    public void mudarStatus(Obra obra, StatusObraMemento novoStatus) {
        mementos.add(obra.criarMemento());
        obra.setStatusObra(novoStatus);
    }
    
    public void desfazer(Obra obra, StatusObraMemento novoStatus) {
        //Pega o ultimo
        StatusObraMemento ultimo = mementos.get(list.size() - 1);
        ultimo.getObra().definirMemento(ultimo);
        mementos.remove(ultimo);
    }
}