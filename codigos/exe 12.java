class FormEvento {
    //Extends e implements dependendo da onde essa view está implementada (desktop, web, mobile) 
    //Atributos e Métodos do formulário
}

class Manipulador {
    //Geralmente chamada Handler
    public void doPost(String controllerName, String... parameters) {
        //Aqui chamaria o controlador específico dependendo do nome requisitado
    }
    public void doGet(String controllerName, String... parameters) {
        //O mesmo do Post com exceção das características de Get
    }
}

interface Comandavel {
    Boolean processarComando(String... parameters);
}

class ControleEvento implements Comandavel {
    public Boolean processarComando(String... parameters) {
        //Aqui executaria o comando requisitado
    }
}