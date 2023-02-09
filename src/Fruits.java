public class Fruits {
   private String name;
   private String color;
   private String type;

    public Fruits() {
    }

    public Fruits(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + getName()+ '\'' +
                ", color='" + getColor() + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }
}
