class Character1 {
    String name;
    Character1(String name){
        this.name=name;
    }
    void displayAttack(){
        System.out.println("Character name: "+name);
    }
}
class Warrior extends Character1 {
    Warrior(String name){
        super(name);
    }
    @Override
    void displayAttack() {
        super.displayAttack();
        System.out.println("Attack with Sword");
    }
}
class Archer extends Character1 {
    Archer(String name){
        super(name);
    }
    @Override
    void displayAttack() {
        super.displayAttack();
        System.out.println("Attack with Arrow");
    }
}
class Mage extends Character1 {
    Mage(String name){
        super(name);
    }
    @Override
    void displayAttack() {
        super.displayAttack();
        System.out.println("Attack with Magic");
    }
}
class MiniGame{
    public static void main(String[] args) {
        Character1[] c={new Warrior("Arjun"), new Archer("Robin"), new Mage("Merlin")};
        for(Character1 i:c){
            i.displayAttack();
        }
    }
}