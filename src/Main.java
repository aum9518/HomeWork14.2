public class Main {
    public static void main(String[] args) {
        Vitamins vitamins = new Vitamins("A","B","C","D");
        Vitamins vitamins1 = new Vitamins("C","F","A","E");
        Vitamins vitamins2 = new Vitamins("B6","C","A","I");
        Orange orange = new Orange("Orange","Orange","Small",vitamins1);
        Apple apple = new Apple("Apple","red","big",vitamins);
        Banana banana = new Banana("Banana","Yellow","big",vitamins2);
        System.out.println(orange);
        System.out.println(apple);
        System.out.println(banana);
    }
}