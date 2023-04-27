public class Rombo implements Cálculos {
	
	private String name;
	private double lado;
	private double dMayor;
	private double dMenor;
	public Rombo(String name, double lado, double dMayor, double dMenor) {
		super();
		this.name = name;
		this.lado = lado;
		this.dMayor = dMayor;
		this.dMenor = dMenor;
	}//constructor
	
	public double calcularArea() {
		return (getdMenor() * getdMayor())/2;	
	}//calcularArea
	public double calcularPerimetro() {
		return (getLado() *4);
	}// calcularPerimetro
	
	public String getName() {
		return name;
	}//getName
	
	public void setName(String name) {
		this.name = name;
	}//setName
	
	public double getLado() {
		return lado;
	}//getLado
	
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado
	
	public double getdMayor() {
		return dMayor;
	}//getdMayor
	
	public void setdMayor(double dMayor) {
		this.dMayor = dMayor;
	}//setdMayor
	
	public double getdMenor() {
		return dMenor;
	}//getdMenor
	
	public void setdMenor(double dMenor) {
		this.dMenor = dMenor;
	}//sedtMenor
	
	@Override
	public String toString() {
		return  "\n name=" + name + 
				"\n lado=" + lado + 
				"\n dMayor=" + dMayor + 
				"\n dMenor=" + dMenor;
	}//to String

}//class Rombo
