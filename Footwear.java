
public class Footwear{

	private String fName;
	private Long fPrice, fWheel;
	private String fType;
	private Double fHeight;
	
	public Footwear(String fName, Long fPrice, String fType, Double fHeight) {
		// TODO Auto-generated constructor stub
		super();
		this.fName=fName;
		this.fPrice=fPrice;
		this.fType=fType;
		this.fHeight=fHeight;
	}
	
	public Footwear(String fName, Long fPrice, String fType, Long fWheel) {
		// TODO Auto-generated constructor stub
		super();
		this.fName=fName;
		this.fPrice=fPrice;
		this.fType=fType;
		this.fWheel=fWheel;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public Long getfPrice() {
		return fPrice;
	}

	public void setfPrice(Long fPrice) {
		this.fPrice = fPrice;
	}

	public Long getfWheel() {
		return fWheel;
	}

	public void setfWheel(Long fWheel) {
		this.fWheel = fWheel;
	}

	public String getfType() {
		return fType;
	}

	public void setfType(String fType) {
		this.fType = fType;
	}

	public Double getfHeight() {
		return fHeight;
	}

	public void setfHeight(Double fHeight) {
		this.fHeight = fHeight;
	}

}
