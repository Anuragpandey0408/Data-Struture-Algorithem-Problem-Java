// Getter & Setter Example
public class javaGetterAndSetter {
    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.setColor("Blue"); // color
        System.out.println(p1.getColor());

        p1.setColor("Yellow"); // set color 2nd time
        System.out.println(p1.getColor());

        p1.setTip(8);
        System.out.println("tip size is : " + p1.getTip()); // tip
    }
}

// Pen Class
class Pen {
    private String color;
    private int tip;

    String getColor() { // getter -> get the colour
        return this.color;
    }

    int getTip() { // getter -> get the tip
        return this.tip;
    }

    void setColor(String newColor) { // setters -> set the colour
        this.color = newColor;
    }

    void setTip(int tip) { // setters -> set the tip
        this.tip = tip;
    }
}
