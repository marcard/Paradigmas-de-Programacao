 public class Principal5A3{
    public static void main(String[] parametros){

        Esfera umaEsfera = new Esfera();
        Interface5A3 umaInterface = new Interface5A3();

        double raio = umaInterface.leRaio();
        umaEsfera.recebeValorRaio(raio);
        double volume = umaEsfera.forneceVolume();
        umaInterface.imprimeVolume(volume);
    }

 }