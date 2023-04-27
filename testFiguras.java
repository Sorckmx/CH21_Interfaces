public class testFiguras {
	public static void main(String[] args) {
		Triangulo 	trian1 	= new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo 	trian2 	= new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado 	cuad1	= new  Cuadrado ("Cuadrado Bob-Esponja", 15);
		Rectángulo 	rect1 	= new  Rectángulo("Rectángulo Puertas", 10, 15);
		Rombo    	rombo1 	= new  Rombo("Rombos Diamantes", 15, 25, 30);
		Romboide 	romboi1 = new  Romboide("Romboide", 12, 8);
		Trapecio 	trap1	= new  Trapecio("Trapecio Columpios", 4, 5, 5, 6, 4, 3, 9 );
		
		// TODO: Aquí se deben instanciar las otras figuras geométricas

		imprimirCalculo(trian1); imprimirCalculo(trian2); imprimirCalculo(cuad1);
		imprimirCalculo(rect1); imprimirCalculo(rombo1); imprimirCalculo(romboi1);
		imprimirCalculo(trap1);
		
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		
	}//main

	public static void imprimirCalculo(Cálculos t) {
		System.out.println(t);
		System.out.println("+========================================");
		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea() + 
				"\n" + "|El perímetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
}//class testFiguras