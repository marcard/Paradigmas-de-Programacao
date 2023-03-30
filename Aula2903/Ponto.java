public class Ponto {

	protected double x;
	protected double y;
	
	public Ponto () {
		x = 0.0;
		y = 0.0;
	}
	
	public Ponto (double vx, double vy) {
		x = vx;
		y = vy;
	}
	
	public double informeAbscissa () {
		return x;
	}
	
	public double informeOrdenada () {
		return y;
	}
	
	public void reposicionar (double vx, double vy) {
		x = vx;
		y = vy;
	}
	
	public double fornecaDistancia (Ponto outroPonto) {
		double outrox, outroy, distancia;
		
		outrox = outroPonto.informeAbscissa ();
		outroy = outroPonto.informeOrdenada ();
		
		distancia = Math.sqrt ((x-outrox)*(x-outrox) +
							   (y-outroy)*(y-outroy));
		
		return distancia;
	}
}








