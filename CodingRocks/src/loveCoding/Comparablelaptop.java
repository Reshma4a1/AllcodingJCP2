package loveCoding;

public class Comparablelaptop {
	
	private int ramsize;
	private String brand;
	private int price;
	
	
	
	public Comparablelaptop(int ramsize, String brand, int price) {
		//super();
		this.ramsize = ramsize;
		this.brand = brand;
		this.price = price;
	}
	
	
	
	public int getRamsize() {
		return ramsize;
	}
	public void setRamsize(int ramsize) {
		this.ramsize = ramsize;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}



	
	@Override
	public String toString() {
		return "Comparablelaptop [ramsize=" + ramsize + ", brand=" + brand
				+ ", price=" + price + "]";
	}



	


/*
 * use when implementing comparable class
	@Override
	public int compareTo(Comparablelaptop lap) {
		
		if(this.getRamsize() > lap.getRamsize())
			
			return 1;
		else 
		return -1;		
	}
	*/
	
	

}
