package javaMethods;

public class Addition {
	public double add(int num1 ,double num2 ) {
		System.out.println("1st method calling..");
		return num1+num2;
	}
	
	public double add(double num1 ,int n2 ) {
		System.out.println("2nd method calling..");
		return num1+n2;
	}
	public double add(double n1 ,double n2 ) {
		System.out.println("3rd method calling..");
		return n1+n2;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition a1=new Addition();
a1.add(10d, 12d);
a1.add(23d,3);
a1.add(3, 6d);
a1.add(6, 12.79);
	}

}
