package in.anand.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product")
public class Product {

	@Override
	public String toString() {
		return "Product [prod_Id=" + prod_Id + ", Prod_Name=" + prodName + ", Prod_cost=" + prodCost + "]";
	}



	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Product(Integer prod_Id, String prod_Name, Double prod_cost) {
		super();
		this.prod_Id = prod_Id;
		prodName = prod_Name;
		prodCost = prod_cost;
	}
	@Id
	@Column(name="prd_Id")
	private Integer prod_Id;
	@Column(name="prd_name")
	private String prodName;
	@Column(name="prd_cost")
	private Double prodCost;
	public Integer getProd_Id() {
		return prod_Id;
	}
	public void setProd_Id(Integer prod_Id) {
		this.prod_Id = prod_Id;
	}
	public String getProd_Name() {
		return prodName;
	}
	public void setProd_Name(String prod_Name) {
		prodName = prod_Name;
	}
	public Double getProd_cost() {
		return prodCost;
	}
	public void setProd_cost(Double prod_cost) {
		prodCost = prod_cost;
	}
	
	
}
