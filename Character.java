public class Character {
    private int health ;
    private int stamina;
    private int maxHealth;
    private int maxStamina;

    public Character(int maxHealth,int maxStamina){
        this.maxHealth =maxHealth;
        this.maxStamina = maxStamina;
        this.health = maxHealth;
        this.stamina = maxStamina;
        System.out.println("Character created with " + health + "health and " + stamina +"stamina");
    }

    public int getHealth() {
        return health;
    }
    public int getStamina() {
        return stamina;
    }

    public void swingSword(){
        stamina -= 10;
        if (stamina <= 0){
            stamina = 0 ;
            System.out.println("Character swings the sword. Stamina is now " + stamina);
            System.out.println("Your character needs to cool down.");
        }
        else{
            System.out.println("Character swings the sword. Stamina is now " + stamina);
        }
    }
    public void takeDamage(int damageAmount) {
        health -= damageAmount;
        if (health <= 0) {
            health = 0;
            System.out.println("Character takes " + damageAmount + " damage. Health is now " + health );
            System.out.println("Character is dead.");
        } else {
            System.out.println("Character takes " + damageAmount + " damage. Health is now " + health );
        }
    }
    public void rest(){
        health = maxHealth;
        stamina = maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }

}
