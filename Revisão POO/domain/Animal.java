package domain;

public class Animal {
    public void comer(){
        System.out.printf("%s comeu.", this.getClass().getSimpleName());
    };
    public void dormir(){
        System.out.printf("%s dormiu.", this.getClass().getSimpleName());
    };
    public void emitirSom(){
        System.out.printf("%s fez barulho.", this.getClass().getSimpleName());
    };
}
