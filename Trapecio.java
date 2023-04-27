public class Trapecio implements Cálculos{

	private String name;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	private double bMenor;
	private double bMayor;
	private double altura;
	public Trapecio(String name, double lado1, double lado2, double lado3, double lado4, double bMenor, double bMayor,
			double altura) {
		super();
		this.name = name;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.bMenor = bMenor;
		this.bMayor = bMayor;
		this.altura = altura;
	}
	public double calcularArea() {
		return lado1+lado2+lado3+lado4;	
	}//calcularArea
	public double calcularPerimetro() {
		return ((bMenor+bMayor)*altura)/2;
	}// calcularPerimetro
	
	public String getName() {
		return name;
	}//getName
	
	public void setName(String name) {
		this.name = name;
	}//setName
	
	public double getLado1() {
		return lado1;
	}//getLado1
	
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}//setLado1
	
	public double getLado2() {
		return lado2;
	}//getLado2
	
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}//setLado2
	
	public double getLado3() {
		return lado3;
	}//getLado3
	
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}//setLado3
	
	public double getLado4() {
		return lado4;
	}//getLado4
	
	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}//setLado4
	
	public double getbMenor() {
		return bMenor;
	}//getbMenor
	
	public void setbMenor(double bMenor) {
		this.bMenor = bMenor;
	}//setbMenor
	
	public double getbMayor() {
		return bMayor;
	}//getbMayor
	
	public void setbMayor(double bMayor) {
		this.bMayor = bMayor;
	}//setbMayor
	
	public double getAltura() {
		return altura;
	}//getAltura
	
	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura
	
	@Override
	public String toString() {
		return  "\n Trapecio name=" + name +
				"\n lado1=" + lado1 +
				"\n lado2=" + lado2 +
				"\n lado3=" + lado3 + 
				"\n lado4=" + lado4 + 
				"\n bMenor=" + bMenor + 
				"\n bMayor=" + bMayor +
				"\n altura=" + altura;
	}//to String
	
}//class Trapecio
