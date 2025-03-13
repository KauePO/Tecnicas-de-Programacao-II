package domain;

public class Leao extends Mamifero implements Patrulhavel{
    @Override
    public void patrulhar(){
        System.out.printf("%s patrulhou.", this.getClass().getSimpleName());
    }
}
