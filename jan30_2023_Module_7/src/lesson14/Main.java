package lesson14;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		
		Data d1 = new Data();
		
		d1.print();

		d1.setDbl(5.7);
		d1.print();
		
		d1.setInt(10);
		d1.print();
		
	}
	
	public static void print(String s){
		System.out.println(s);
	}
	
	public static void print(){
		print("Hello World!");
	}

}
