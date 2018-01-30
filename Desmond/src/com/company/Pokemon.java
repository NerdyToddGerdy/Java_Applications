package com.company;

public class Pokemon {
    private String name;
    private String attack1;
    private int attack1Damage;
    private int attack2Damage;
    private int attack3Damage;
    private int attack4Damage;
    private String attack2;
    private String attack3;
    private String attack4;
    private int hp;

    public Pokemon(String name, int hp, String attack1,int attack1Damage, String attack2, int attack2Damage, String attack3, int attack3Damage, String attack4, int attack4Damage) {
        this.name = name;
        this.hp = hp;
        this.attack1 = attack1;
        this.attack2 = attack2;
        this.attack3 = attack3;
        this.attack4 = attack4;
        this.attack1Damage = attack1Damage;
        this.attack2Damage = attack2Damage;
        this.attack3Damage = attack3Damage;
        this.attack4Damage = attack4Damage;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack1Damage() {
        return attack1Damage;
    }

    public void setAttack1Damage(int attack1Damage) {
        this.attack1Damage = attack1Damage;
    }

    public int getAttack2Damage() {
        return attack2Damage;
    }

    public void setAttack2Damage(int attack2Damage) {
        this.attack2Damage = attack2Damage;
    }

    public int getAttack3Damage() {
        return attack3Damage;
    }

    public void setAttack3Damage(int attack3Damage) {
        this.attack3Damage = attack3Damage;
    }

    public int getAttack4Damage() {
        return attack4Damage;
    }

    public void setAttack4Damage(int attack4Damage) {
        this.attack4Damage = attack4Damage;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttack1() {
        return attack1;
    }

    public void setAttack1(String attack1) {
        this.attack1 = attack1;
    }

    public String getAttack2() {
        return attack2;
    }

    public void setAttack2(String attack2) {
        this.attack2 = attack2;
    }

    public String getAttack3() {
        return attack3;
    }

    public void setAttack3(String attack3) {
        this.attack3 = attack3;
    }

    public String getAttack4() {
        return attack4;
    }

    public void setAttack4(String attack4) {
        this.attack4 = attack4;
    }
    private int currentAttackDamage;
    public int attack(int num) {
        System.out.println("We are attacking with attack #: " + num);
         switch(num) {
             case 1:
                 System.out.println(this.getName() + " is using " + this.getAttack1() + " for " +
                         this.getAttack1Damage());
                 currentAttackDamage = this.getAttack1Damage();
                 System.out.println(currentAttackDamage);
                 return currentAttackDamage;

             case 2:
                 System.out.println(this.getName() + " is using " + this.getAttack2() + " for " +
                         this.getAttack2Damage());
                 currentAttackDamage = this.getAttack2Damage();
                 System.out.println(currentAttackDamage);
                 return currentAttackDamage;

             case 3:
                 System.out.println(this.getName() + " is using " + this.getAttack3() + " for " +
                         this.getAttack3Damage());
                 currentAttackDamage = this.getAttack3Damage();
                 System.out.println(currentAttackDamage);
                 return currentAttackDamage;

             case 4:
                 System.out.println(this.getName() + " is using " + this.getAttack4() + " for " +
                         this.getAttack4Damage());
                 currentAttackDamage = this.getAttack4Damage();
                 System.out.println(currentAttackDamage);
                 return currentAttackDamage;

             default:
                System.out.println(this.getName() + "doesn't know that move.");
                currentAttackDamage = 0;
                return currentAttackDamage;
        }
    }
}
