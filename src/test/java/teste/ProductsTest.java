package teste;

import br.com.loja.dao.ProductDAO;
import br.com.loja.models.Product;

public class ProductsTest {

	public static void main(String[] args) {

		try {
			Product p = new Product();
			ProductDAO dao = new ProductDAO();

			p.setId(2);
			p.setDescription("teste");
			p.setTitle("titulo");
			p.setPages(3);

			dao.save(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
