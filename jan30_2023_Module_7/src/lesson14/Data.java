package lesson14;

public class Data {
	
	private Integer integer;
	private Double decimal;
	private Boolean equal;
	
	public Data (Double d) {
		setDbl(d);
	}
	public Data (Integer i) {
		setInt(i);
	}
	public Data () {
		this(0);
	}

	public void setInt(int i) {
		integer = i;
		decimal = integer.doubleValue();
		setEqual();
	}
	public void setDbl(double d) {
		decimal = d;
		integer = decimal.intValue();
		setEqual();
	}
	
	private void setEqual() {
		if (decimal.doubleValue()==integer.doubleValue()) {
			equal = true;
		}
		else {
			equal = false;
		}
	}

	public Integer getInteger() {
		return integer;
	}
	public Double getDecimal() {
		return decimal;
	}
	public Boolean isEqual() {
		return equal;
	}
	
	public Integer round() {
		return (int) (decimal.doubleValue()+.5);
	}
	
	public String toString() {
		return new String("Int: " + integer + "\nDbl: " + decimal + "\nRnd: " + round() + "\nEql: " + equal);
	}
	
	public void print() {
		System.out.println(this);
	}
}
