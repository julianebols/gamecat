package no.julianebols.rest.game.cat.domain;

public class Cat {
    private String id;
    private String name;
    private int damage;
    private int health;


    public Cat() {
    }

    public Cat(String id, String name, int damage, int health) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
