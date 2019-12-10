package InterfaceObject;
public class Product {
	private long id;
	private String productName,supplierName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public Product(long id, String productName, String supplierName) {
		super();
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	public Product() {
		super();
	}
	@Override
	public boolean equals(Object obj) {
		Product p=(Product)obj;
		if(id==p.getId() && productName.equals(p.getProductName()) && supplierName.equals(p.getSupplierName()))
			return true;
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return id+":"+productName+":"+supplierName;
	}
}