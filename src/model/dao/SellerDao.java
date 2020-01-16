/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.entities.Seller;


/**
 *
 * @author Christian
 */
public interface SellerDao {
    
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id); // responsavel por pegar o id como parâmetro e conferir no banco de dados um obj com esse Id, se não existir retorna nulo.
    List<Seller> findAll();
}