package in.anand;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.anand.dao.ProductRepo;
import in.anand.entity.Product;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ProductRepo productRepo = context.getBean(ProductRepo.class);
		
		/*
		 * Product prd=new Product(); prd.setProd_Id(1); prd.setProd_Name("Laptop1");
		 * prd.setProd_cost(55000.45);
		 */
		/*
		 * Product saveprod = productRepo.save(prd); System.out.println(saveprod);
		 */
		
		/*
		 * Product product1 = new Product(2,"Televison",5000.89); Product product2 = new
		 * Product(3,"chair",500.89); Product product3 = new
		 * Product(4,"oximeter",500.89);
		 * 
		 * List<Product> li=new ArrayList<>(); li.add(product1); li.add(product2);
		 * li.add(product3);
		 * 
		 * productRepo.saveAll(li);
		 */
		/*
		 * Optional<Product> findById = productRepo.findById(1);
		 * if(findById.isPresent()) { System.out.println("the product is present");
		 * }else { System.out.println("product is not present"); }
		 */
		/*
		 * List<Serializable> prod_ids=new ArrayList(); prod_ids.add(1);
		 * prod_ids.add(3); Iterable<Product> findAllById =
		 * productRepo.findAllById(prod_ids); findAllById.forEach(prod->{
		 * System.out.println(prod); });
		 */
		/*
		 * Iterable<Product> findAll = productRepo.findAll(); findAll.forEach(pd->{
		 * System.out.println(pd); });
		 */
		
		
		/*
		 * long count = productRepo.count(); System.out.println(count);
		 */
		/*
		 * boolean existsById = productRepo.existsById(4);
		 * System.out.println(existsById);
		 */
		
		/*
		 * List<Product> findByProdName = productRepo.findByProdName("chair");
		 * 
		 * findByProdName.forEach(prod->{ System.out.println(findByProdName); });
		 */
		/*
		 * List<Product> findbyProdNameIn =
		 * productRepo.findByProdNameIn(Arrays.asList("chair","Laptop1"));
		 * findbyProdNameIn.forEach(prod->{ System.out.println(prod); });
		 * 
		 * List<Double> findByprodCostByProdName =
		 * productRepo.findByprodCostByProdName("Laptop1");
		 * System.out.println(findByprodCostByProdName);
		 */
		
		int insertData = productRepo.insertData(5, "pillow", 56.30);
		if(insertData==1)
			System.out.println("Data successfully inserted");
		else
			System.out.println("not inserted");
		
		
	}

}
