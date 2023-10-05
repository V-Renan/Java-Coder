package revisandoOO;

/**
 * @author Victor$
 * @date 10/5/2023$
 * Description:
 */
public class CarroTeste {

    public static void main(String[] args) {

        Carro c1 = new Carro();
        System.out.println(c1.estaLigado());
        c1.ligar();
        System.out.println(c1.estaLigado());

        System.out.println(c1.motor.giros());
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        // Faltou Encapsulamento!!
        //c1.motor.fatorInjecao = -30;

        // Relação bidirecional
        System.out.println(c1.motor.carro.motor.carro.motor.giros());

        System.out.println(c1.motor.giros());
    }
}
