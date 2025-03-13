package domain;

public class Aguia extends Ave implements Voavel, BotarOvos{

    @Override
    public void voar(){
        System.out.printf("%s voou.", this.getClass().getSimpleName());
    }

    @Override
    public void botar(){
        System.out.printf("%s botou um ovo.", this.getClass().getSimpleName());
    }
}
