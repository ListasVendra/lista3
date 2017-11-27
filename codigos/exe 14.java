interface Funcionario  {
    double calcularComisao(double valor);
}

class Gerente implements Funcionario {
    public double calcularComisao(double valor) {
        //Faria o calculo da comissao aqui
    }
}

class PagamentoVisita {
    protected double valorPagamento;
    protected Funcionario funcionario;

    public abstract Boolean validarPagamento(Funcionario funcionario);
}

class PagamentoAVista {
    @Override
    public Boolean validarPagamento(Funcionario funcionario) {
        double comissao = funcionario.calcularCommisao(valorPagamento);
        //Outras validações adicionais
    }
}