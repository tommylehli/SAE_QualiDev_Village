package charac;

public class Creature implements Character{
    private String name;
    private Sex sex;
    private int age;
    private int hunger;
    private int fatigue;
    private int magic;

    public Creature(String name, Sex sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.hunger = 100;
        this.fatigue = 100;
        this.magic = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        if (hunger < this.hunger)
            this.hunger = Math.max(hunger, 0);
        else
            this.hunger = Math.min(hunger, 100);
    }

    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        if (fatigue < this.fatigue)
            this.fatigue = Math.max(fatigue, 0);
        else
            this.fatigue = Math.min(fatigue, 100);
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        if (magic < this.magic)
            this.magic = Math.max(magic, 0);
        else
            this.magic = Math.min(magic, 100);
    }

    @Override
    public void emitSound(){} //propre a chaque type de humanoïde

    @Override
    public void moveChar(){}

    @Override
    public void restoreChar(){}

    @Override
    public void restChar(int time) {
        //time -> en minute, multiple de 10
        setFatigue(this.fatigue+(time/5));
    }

    @Override
    public void doActivity() {}

    @Override
    public void increaseMagic(int amount){
        setMagic(getMagic()+amount);
    }

    @Override
    public void decreaseMagic(int amount){
        setMagic(getMagic()-amount);
    }

    @Override
    public void eatFood(){}
}
