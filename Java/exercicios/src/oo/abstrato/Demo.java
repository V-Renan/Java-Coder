package oo.abstrato;

/**
 * @author Victor$
 * @date 10/19/2023$
 * Description:
 */
public class Demo {

    public static void main(String[] args) {

        Mamifero dog1 = new Cachorro();
        System.out.println(dog1.mamar());
        System.out.println(dog1.mover());
        System.out.println(dog1.respirar());
    }
}
