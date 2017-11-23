package ex17.dao;
import java.util.List;
public interface DAO<T> {
    public void salvar(T obj);
    public void excluir(T obj);
    public void atualizar(T obj);
    public List listar(); 
    
}
//-------------------------//
package ex17.dao;
import ex17.dao.biblioteca.Acervo;
import java.util.List;
public class AcervoDAO implements DAO<Acervo> {

    @Override
    public void salvar(Acervo obj) {
    }

    @Override
    public void excluir(Acervo obj) {
    }

    @Override
    public void atualizar(Acervo obj) {
    }

    @Override
    public List listar() {
    }
}
//-------------------------//
package ex17.dao;
import ex17.responsaveis.Atendente;
import java.util.List;
public class AtendenteDAO implements DAO<Atendente> {

    @Override
    public void salvar(Atendente obj) {
    }

    @Override
    public void excluir(Atendente obj) {
    }

    @Override
    public void atualizar(Atendente obj) {
    }

    @Override
    public List listar() {
    }
}
//-------------------------//
package ex17.dao;
import ex17.comercio.CartaoMagnetico;
import java.util.List;
public class CartaoMagneticoDAO implements DAO<CartaoMagnetico>{

    @Override
    public void salvar(CartaoMagnetico obj) {
    }
    @Override
    public void excluir(CartaoMagnetico obj) {
    }
    @Override
    public void atualizar(CartaoMagnetico obj) {
    }
    @Override
    public List listar() {
    }  
}
//-------------------------//
package ex17.dao;
import ex17.dao.biblioteca.DocumentoHistorico;
import java.util.List;
public class DocumentoHistoricoDAO implements DAO<DocumentoHistorico>{
    @Override
    public void salvar(DocumentoHistorico obj) {
    }
    @Override
    public void excluir(DocumentoHistorico obj) {
    }
    @Override
    public void atualizar(DocumentoHistorico obj) {
    }
    @Override
    public List listar() {
    }
}
//-------------------------//
package ex17.dao;
import ex17.dao.biblioteca.Escultura;
import java.util.List;
public class EsculturaDAO implements DAO<Escultura> {
    @Override
    public void salvar(Escultura obj) {
    }
    @Override
    public void excluir(Escultura obj) {
    }
    @Override
    public void atualizar(Escultura obj) {
    }
    @Override
    public List listar() {
    }    
}
//-------------------------//
package ex17.dao;

import ex17.insumo.Estoque;
import java.util.List;
public class EstoqueDAO implements DAO<Estoque> {
    @Override
    public void salvar(Estoque obj) {
    }
    @Override
    public void excluir(Estoque obj) {
    }
    @Override
    public void atualizar(Estoque obj) {
    }
    @Override
    public List listar() {
    }    
}
//-------------------------//
package ex17.dao;
import java.util.List;
public class EventoDAO implements DAO<Evento> {
    @Override
    public void salvar(Evento obj) {
    }
    @Override
    public void excluir(Evento obj) {
    }
    @Override
    public void atualizar(Evento obj) {
    }
    @Override
    public List listar() {
    }    
}
//-------------------------//
package ex17.dao;
import ex17.publico.Exposicao;
import java.util.List;
public class ExposicaoDAO implements DAO<Exposicao> {
    @Override
    public void salvar(Exposicao obj) {
    }
    @Override
    public void excluir(Exposicao obj) {
    }
    @Override
    public void atualizar(Exposicao obj) {
    }
    @Override
    public List listar() {
    }    
}
//-------------------------//
package ex17.dao;
import ex17.responsaveis.Gerente;
import java.util.List;
public class GerenteDAO implements DAO<Gerente> {
    @Override
    public void salvar(Gerente obj) {
    }
    @Override
    public void excluir(Gerente obj) {
    }
    @Override
    public void atualizar(Gerente obj) {
    }
    @Override
    public List listar() {
    }
}
//-------------------------//
package ex17.dao;
import ex17.comercio.PagamentoVisita;
import java.util.List;
public class PagamentoVisitaDAO implements DAO<PagamentoVisita> {
    @Override
    public void salvar(PagamentoVisita obj) {
    }
    @Override
    public void excluir(PagamentoVisita obj) {
    }
    @Override
    public void atualizar(PagamentoVisita obj) {
    }
    @Override
    public List listar() {
    }
}
//-------------------------//
package ex17.dao;
import ex17.dao.biblioteca.Quadro;
import java.util.List;
public class QuadroDAO implements DAO<Quadro> {
    @Override
    public void salvar(Quadro obj) {
    }
    @Override
    public void excluir(Quadro obj) {
    }
    @Override
    public void atualizar(Quadro obj) {
    }
    @Override
    public List listar() {
    }
}
//-------------------------//
package ex17.dao;
import ex17.dao.biblioteca.Restauracao;
import java.util.List;
public class RestauracaoDAO implements DAO<Restauracao> {
    @Override
    public void salvar(Restauracao obj) {
    }
    @Override
    public void excluir(Restauracao obj) {
    }
    @Override
    public void atualizar(Restauracao obj) {
    }
    @Override
    public List listar() {
    }
}
//-------------------------//
package ex17.dao;
import ex17.publico.Sala;
import java.util.List;
public class SalaDAO implements DAO<Sala> {
    @Override
    public void salvar(Sala obj) {
    }
    @Override
    public void excluir(Sala obj) {
    }
    @Override
    public void atualizar(Sala obj) {
    }
    @Override
    public List listar() {
    }
}
//-------------------------//
package ex17.dao;
import ex17.insumo.Souvinier;
import java.util.List;
public class SouvinierDAO implements DAO<Souvinier> {
    @Override
    public void salvar(Souvinier obj) {
    }
    @Override
    public void excluir(Souvinier obj) {
    }
    @Override
    public void atualizar(Souvinier obj) {
    }
    @Override
    public List listar() {
    }
}
//-------------------------//
package ex17.dao;
import ex17.comercio.Visitante;
import java.util.List;
public class VisitanteDAO implements DAO<Visitante>{
    @Override
    public void salvar(Visitante obj) {
    }
    @Override
    public void excluir(Visitante obj) {
    }
    @Override
    public void atualizar(Visitante obj) {
    }
    @Override
    public List listar() {
    }
}





