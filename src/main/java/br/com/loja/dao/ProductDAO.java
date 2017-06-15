package br.com.loja.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.loja.models.Product;

@Repository
public class ProductDAO {

	@PersistenceContext
	private EntityManager manager;

	public void save(Product product) {
		manager.persist(product);
	}

}
