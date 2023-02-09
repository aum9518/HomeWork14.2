public class Vitamins {
   private String vitamin1;
   private String vitamin2;
   private String vitamin3;
   private String vitamin4;

    public Vitamins() {
    }

    public Vitamins(String vitamin1, String vitamin2, String vitamin3, String vitamin4) {
        this.vitamin1 = vitamin1;
        this.vitamin2 = vitamin2;
        this.vitamin3 = vitamin3;
        this.vitamin4 = vitamin4;
    }

    public String getvitamin1() {
        return vitamin1;
    }

    public void setvitamin1(String vitamin2) {
        this.vitamin1 = vitamin2;
    }

    public String getvitamin2() {
        return vitamin2;
    }

    public void setvitamin2(String vitamin2) {
        this.vitamin2 = vitamin2;
    }

    public String getVitamin3() {
        return vitamin3;
    }

    public void setVitamin3(String vitamin3) {
        this.vitamin3 = vitamin3;
    }

    public String getvitamin4() {
        return vitamin4;
    }

    public void setvitamin4(String vitamin4) {
        this.vitamin4 = vitamin4;
    }

    @Override
    public String toString() {
        return "Vitamins{" +
                "'" + vitamin1 + '\'' +
                ", '" + vitamin2 + '\'' +
                ",'" + vitamin3 + '\'' +
                ",'" + vitamin4 + '\'' +
                '}';
    }
}
