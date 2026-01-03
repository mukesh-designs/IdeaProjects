class Pen {
    String color;
    String type; //ballpoint; gel

    public void write() {
        System.out.println("Writing Something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

public class OOPS1 {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write(); //Writing Something

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor(); //blue
        pen2.printColor(); //black
    }
}
