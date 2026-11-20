public class ClassFood {
    int quantityFood = 0;
    String name = "";
    int nutritionalValue = 0;

    public ClassFood (int quantityFood, String name, int nutritionalValue){
        this.quantityFood = quantityFood;
        this.name = name;
        this.nutritionalValue = nutritionalValue;
    }

    public int getQuantityFood(){
        return quantityFood;
    }

    public void setQuantityFood(int quantityFood){
        this.quantityFood = quantityFood;
    }

    public String getName(){
        return name;
    }

    public int getnutritionalValue(){
        return nutritionalValue;
    }

    public void setnutritionalValue(int nutritionalValue){
        this.nutritionalValue = nutritionalValue;
    }

    @Override 
    public String toString() {
        return "la valeur nutritive : " + nutritionalValue;
    }

    public static void main(String[] args) {
        ClassFood biscuit = new ClassFood(55, "Biscuit", 10);
        ClassFood chocolatChaud = new ClassFood(10, "Chocolat chaud", 15);
        ClassFood guimauve = new ClassFood(2, "Guimauve", 8);
        ClassFood gruauAvoine = new ClassFood(5, "Gruau d'avoine", 20);
        ClassFood friandise = new ClassFood(35, "Friandise", 12);

        System.out.println(biscuit);
        System.out.println(chocolatChaud);
        System.out.println(guimauve);
        System.out.println(gruauAvoine);
        System.out.println(friandise);
    }
}
