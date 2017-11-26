interface DAO<T> {
    void inserir(T entity);
    void atualizar(T entity);
    void remover(T entity);
    List<T> listarTodos();
}

class ObraDAO implements DAO<Obra> {
    public void inserir(Obra entity) {
        //Faria conexão com banco e enviaria os dados
    }
    public void atualizar(Obra entity) {
        //Faria conexão com banco e enviaria os dados
    }
    public void remover(Obra entity) {
        //Faria conexão com banco e enviaria os dados
    }
    public List<Obra> listarTodos() {
        //Faria conexão com banco e receberia os dados
    }
}