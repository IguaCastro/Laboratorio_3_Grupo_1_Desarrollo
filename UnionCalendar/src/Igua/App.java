package Igua;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Hero hero = new Hero(20, 100,"SuperMan", "Militar");
        System.out.println(hero.getLevel() + hero.getName() + hero.getPower() + hero.getRange());

    }
}
