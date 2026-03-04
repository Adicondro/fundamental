class Display{

    static String type = "display";
    public String name;

    Display(String name){
        this.name = name;
    }

    void setType(String type){
        //type = type; alternatif 1
        //this.type = type; alternatif 2
        Display.type = type;
    }

    void show(){
        System.out.println("Display name: " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Display display1 = new Display("Monitor");
        display1.show();

        Display display2 = new Display("Smartphone");
        display2.show();

        display1.setType("Hacked");

        //display1.name;
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);
    }
}