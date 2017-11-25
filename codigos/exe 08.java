class Obra {
    //Atributos e métodos da classe Obra
}

class Quadro extends Obra {
    //Atributos e métodos da classe Quadro
}

abstract class CriadorObra {
    public abstract Obra criarObra();
}

class CriadorQuadro extends CriadorObra {
    @Override
    public Obra criarObra() {
        return new Quadro();
    }
}