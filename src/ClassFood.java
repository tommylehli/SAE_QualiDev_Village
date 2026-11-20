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

    public int getNutritionalValue(){
        return nutritionalValue;
    }

    public void setNutritionalValue(int nutritionalValue){
        this.nutritionalValue = nutritionalValue;
    }

    @Override 
    public String toString() {
        return "La valeur nutritive : " + nutritionalValue;
    }
}
