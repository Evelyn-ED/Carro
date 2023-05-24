import java.util.Scanner;

public class Carro{

    //Atributos
    String placa;
    String cor;
    Dono Dono;
    float valor;
    float aumento;
    double acrescimo;
    float reajuste;

    Scanner sc = new Scanner (System . in);

    Dono dono = new Dono ();

    void consultar (){
        System.out.println("A placa do carro é:" +placa);
        System.out.println("A cor do carro é:"+cor);
        System.out.println("O nome do dono do carro é:" +dono.nome);
        System.out.println("O valor do carro é de:" +valor);
        System.out.println("O seu endereço é:" +dono.endereco);
        System.out.println("A quantidade de carros que custam mais de 40000 é de:"+acrescimo);
    }

    void reajustar (){
        reajuste = valor + 500;
        System.out.println("O valor reajustado do carro é de:" +reajuste);
    }

    void lerCarro (){
        System.out.println("Digite a placa do seu carro:");
        placa = sc.nextLine();

        System.out.println("Digite a cor do seu carro:");
        cor = sc.next();

        System.out.println("Digite o valor do carro:");
        valor = sc.nextFloat();
    }

    void valorCaro (){

        if (valor > 4000){
            acrescimo++;
        }
    }

    void lerDono (){

        System.out.println("Digite o seu nome:");
        dono.nome = sc.nextLine();

        System.out.println("Digite o seu CPF:");
        dono.cpf = sc.nextLine();

        System.out.println("Digite o seu endereço:");
        dono.endereco = sc.nextLine();
        }


}
