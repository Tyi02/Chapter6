package com.CSCI185;

/**
 * Creates a monster object that can fight other pokemon.
 * @author George M Salayka
 * @version 1.0
 * @since 1-27-22
 */
public class Pokemon {
    private String type;
    private String name;
    private int level;
    private int health;
    private int attack;

    //2 constructors, 1 default, 1 with set
    
    public Pokemon(){
        type = "Fire";
        name = "Charmander";
        level = 1;
        health = 20;
        attack = 5;
    }

    public Pokemon(String newType, String newName, int newLevel,
                   int newHealth, int newAttack)
    {
        type = newType;
        name = newName;
        level = newLevel;
        health = newHealth;
        attack = newAttack;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHealth(int health)
    {
        if(health <0)
        {
            System.out.println(".....You dead...");
            System.exit(0);
        }
        else
            this.health = health;
    }
    public int getHealth(){
        return health;
    }
    public String getType(){
        return type;
    }
    /**
     * Precondition: Pokemon must have values for all variables
     * Postcondition: Print all information for a pokemon.
     */
    public void writeOutput()
    {
        System.out.println("Type: "+type);
        System.out.println("Name: "+name);
        System.out.println("Level: "+level);
        System.out.println("Health: "+health);
        System.out.println("Attack: "+attack);
    }
    public void flee()
    {
        System.out.println(name+" tries to run away.");
        System.exit(0);
    }

    /**
     * Deals a random amount of damage related to the attack and
     * type of the pokemon.
     */
    public int inflictDamage()
    {
        return (int)(Math.random()*6)+3+attack;
    }
    public void doAttack(Pokemon other){
        int damage = this.inflictDamage();
        System.out.println(this.name+" attacked "+other.name+
        " for "+damage+" damage");
        other.health-=damage;
        if(other.health <=10)
        {
            other.flee();
        }
        other.printStatus();
    }
    public void printStatus()
    {
        System.out.println(name+" currently has "+health+" hit points.");
    }
    public boolean equals(Pokemon other)
    {
        return this.level == other.level &&
                this.attack == other.attack &&
                this.health == other.health &&
                this.name.equalsIgnoreCase(other.name) &&
                this.type.equalsIgnoreCase(other.type);
    }
}
