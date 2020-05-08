package ua.lviv.ura.domain;

public class Product {
	
	private int id;
	private int categoriId;
	private String name;
	private String description;
	private int price;
	
	public Product(int id, int categoriId, String name, String description, int price) {
		
		this.id = id;
		this.categoriId = categoriId;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public Product(int categoriId, String name, String description, int price) {
		
		this.categoriId = categoriId;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoriId() {
		return categoriId;
	}

	public void setCategoriId(int categoriId) {
		this.categoriId = categoriId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + categoriId;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (categoriId != other.categoriId)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", categoriId=" + categoriId + ", name=" + name + ", description=" + description
				+ ", price=" + price + "]";
	}
	
}
