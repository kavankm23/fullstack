package service;
import dao.ProductDao;
import java.util.*;
import java.util.stream.*;
import bean.Product;
public class ProductService {
	
	public void addProduct(Product pro){
		ProductDao pd1= new ProductDao();
		pd1.addProduct(pro);
	}
    public void updateProduct() {
    	ProductDao pd2= new ProductDao();
    	pd2.updateProduct();
    }
    public void deleteProduct(){
    	ProductDao pd3= new ProductDao();
    	pd3.deleteProduct();
    }
    public List<Product> getAllProduct() {
		ProductDao pd4 = new ProductDao();
		//return pd.getAllProduct();
		
		return pd4.getAllProduct();
	}
    public List<Product> productNameAss(){
    	ProductDao pd5 = new ProductDao();
    	return pd5.productNameAss();
    }
    public List<Product> productNameDes(){
    	ProductDao pd6 = new ProductDao();
    	return pd6.productNameDes();
    }
    public List<Product> productPriceAss(){
    	ProductDao pd7 = new ProductDao();
    	return pd7.productPriceAss();
    }
    public List<Product> productPriceDes(){
    	ProductDao pd8 = new ProductDao();
    	return pd8.productPriceAss();
    }
}
