package OOPs;

public class Class_object {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Creted the pen object
        p1.setColor("red");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }

}

class Pen{
    String color;
    int tip;

     void setColor(String newColor){
         color = newColor;
     }

     void setTip(int newTip){
         tip = newTip;
     }
}

