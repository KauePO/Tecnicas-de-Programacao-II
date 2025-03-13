package domain;

public class Ornitorrinco extends Mamifero implements BotarOvos{
    @Override
    public void botar(){
        System.out.printf("%s botou um ovo.", this.getClass().getSimpleName());
    }
}
