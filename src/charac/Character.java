package charac;

public interface Character {
    public void emitSound();
    public void moveChar();
    public void restoreChar();
    public void restChar(int time); //en minute
    public void doActivity();
    public void increaseMagic(int amount);
    public void decreaseMagic(int amount);
    public void eatFood();
}
