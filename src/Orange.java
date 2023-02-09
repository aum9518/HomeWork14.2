public class Orange extends Fruits{
   private Vitamins vitamins;

    public Orange() {
    }

    public Orange(String name, String color, String type) {
        super(name, color, type);
    }

    public Orange(Vitamins vitamins) {
        this.vitamins = vitamins;
    }

    public Orange(String name, String color, String type, Vitamins vitamins) {
        super(name, color, type);
        this.vitamins = vitamins;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "" + vitamins +
                ", name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }
}
