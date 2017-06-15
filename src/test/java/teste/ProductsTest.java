package teste;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import br.com.loja.dao.ProductDAO;
import br.com.loja.models.Product;

@Transactional
public class ProductsTest {

	@Autowired
	private ProductDAO productDAO;

	@Test
	public void salvar() {

		try {
			Product p = new Product();

			p.setId(202);
			p.setDescription("teste");
			p.setTitle("titulo");
			p.setPages(3);

			productDAO.save(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
