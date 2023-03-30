public class PrincipalPonto {

	public static void main (String[] parametros) {
	
		Ponto pa, pb;
		double xa, xb, ya, yb;
		
		InterfacePonto umaInterface = new InterfacePonto();
		
		xa = umaInterface.pegaValor("Abscissa de A");
		ya = umaInterface.pegaValor("Ordenada de A");
		xb = umaInterface.pegaValor("Abscissa de B");
		yb = umaInterface.pegaValor("Abscissa de B");
		
		pa = new Ponto (xa, ya);
		pb = new Ponto (xb, yb);
		
		double distancia = pa.fornecaDistancia(pb);
		umaInterface.mostreDistancia(distancia);
	}
}


