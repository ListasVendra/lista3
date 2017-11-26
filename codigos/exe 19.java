interface Controles {
    void liberarCartaoManetico(CartaoMagnetico cartao);
}


class ControleFaçade implements Controles {
    public void liberarCartaoManetico(CartaoMagnetico cartao) {
        //Pega a instancia do ControleVisita e chama o controle visita
    }
}

class ControleVisita {
    public void liberarCartaoMagnetico(CartaoMagnetico cartao) {
        //Realiza o método
    }
}