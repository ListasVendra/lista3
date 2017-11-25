class Obra {
    private String tipoRestauro;
    private OperacaoRestauro operacao;

    public double calculoRestauro() {
        return operacao.calculoRestauro(Obra obra);
    }
}

interface OperacaoRestauro {
    double calculoRestauro(Obra obra);
}

class OperacaoRestauroManutencaoBasica {
    public double calculoRestauro(Obra obra) {
        //Aqui ele realiza o cálculo
    }
}