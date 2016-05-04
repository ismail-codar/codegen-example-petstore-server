package petstore.server.model;

public class Order {
	private Integer petId = null;
	private Integer quantity = null;
	private Integer id = null;
	private String shipDate = null;
	private Boolean complete = null;
	private String status = null;
	
	public Integer getPetId() {
		return petId;
	}
	public void setPetId(Integer value) {
		petId = value;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer value) {
		quantity = value;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer value) {
		id = value;
	}
	
	public String getShipDate() {
		return shipDate;
	}
	public void setShipDate(String value) {
		shipDate = value;
	}
	
	public Boolean getComplete() {
		return complete;
	}
	public void setComplete(Boolean value) {
		complete = value;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String value) {
		status = value;
	}
	
}

