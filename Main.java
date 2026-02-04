public class Main {
    public static void main(String[] args) {
        // 1. สร้างตัวละคร
        Character hero = new Character(100, 50);

        // 2. ฟันดาบจนเหนื่อย
        hero.swingSword();
        hero.swingSword();
        hero.swingSword();
        hero.swingSword();
        hero.swingSword();

        hero.takeDamage(30);
        hero.takeDamage(50);
        hero.takeDamage(20);

        // 4. พักผ่อน
        hero.rest();
        System.out.println("Character's health: " + hero.getHealth() + ", stamina: " + hero.getStamina() + ".");
    }
}