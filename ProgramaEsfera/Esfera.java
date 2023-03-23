public class Esfera 
{   
    protected double raio;

    public Esfera(){
        raio = 0.0;
    }

    public void recebeValorRaio(double vRaio){
        raio = vRaio;
    }

    public double informeValorRaio(){
        return raio;
    }

    public double forneceVolume(){
        return(4*3.14*Math.pow(raio,3))/3;
    }

}
