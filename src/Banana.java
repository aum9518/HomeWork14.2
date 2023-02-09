public class Banana extends Fruits {
   private Vitamins vitamins;

    public Banana() {

    }

    public Banana(Vitamins vitamins) {
        this.vitamins = vitamins;
    }

    public Banana(String name, String color, String type, Vitamins vitamins) {
        super(name, color, type);
        this.vitamins = vitamins;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "" + vitamins +
                ", name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }
}
