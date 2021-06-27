package in.anand.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.anand.entity.Product;

public interface ProductRepo extends CrudRepository<Product,Serializable> {
	
	public List<Product> findByProdName(String name);
	
	public List<Product> findByProdNameIn(List<String> ss);
	
	@Query("select prodCost from Product where prodName=:name")
	public List<Double> findByprodCostByProdName(String name);
	
	@Query("insert into product values(prodid,name,coast)")
	public int insertData(int prodid,String name,double coast);
	
}
