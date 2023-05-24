public class Principal {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro ();
        carro1.lerDono();
        carro1.lerCarro();

        Carro carro2 = new Carro ();
        carro2.lerDono();
        carro2.lerCarro();

        Carro carro3 = new Carro ();
        carro3.lerDono();
        carro3.lerCarro();

        carro1.consultar();
        carro2.consultar();
        carro3.reajustar();
    }
