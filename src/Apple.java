public class Apple extends Fruits{
    private Vitamins vitamins;
    public Apple(){

    }

    public Apple(Vitamins vitamins) {
        this.vitamins = vitamins;
    }

    public Apple(String name, String color, String type, Vitamins vitamins) {
        super(name, color, type);
        this.vitamins = vitamins;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "" + vitamins +
                ", '" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }
}
