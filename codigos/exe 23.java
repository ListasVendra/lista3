class GerencidorPagamento implements Pagavel {
    public static Boolean confirmarPagamentoPOST(String num, String senha);
}

class ControleVisita {
    public Boolean confirmarPagamento(String num, String senha) {
        String json = GerencidorPagamento.confirmarPagamentoPOST(num, senha);
        /* exemplo de json esperado :
        {
            "numero-cartao": "6666 6666 6666 6666",
            "cpf": "111.111.111-11",
            "status": "confirmado"
        }
        */
        if(JSON.parse(json)["status"] == "confirmado")
            return true;
        else
            return false;
    }
}

class GerencidorDadosPessoais implements Validavel {
    public static Boolean confirmarCPFGET(String cpf);
}

class DadosPessoaisUtil {
    public static Boolean configmarCPFGET(String cpf) {
        String json = GerencidorDadosPessoais.confirmarCPFGET(cpf);
        /* exemplo de json retornado :
        {
            "cpf": "111.111.111-11",
            "status": "valido"
        }
        */
        if(JSON.parse(json)["status"] == "valido")
            return true;
        else
            return false;
    }
}