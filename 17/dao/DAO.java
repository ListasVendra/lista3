/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex17.dao;

import java.util.List;

/**
 *
 * @author diego
 */
public interface DAO<T> {
    public void salvar(T obj);
    public void excluir(T obj);
    public void atualizar(T obj);
    public List listar(); 
    
}
