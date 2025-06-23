class Computer {

    public void playMusic(){
        System.out.println("put music");
    }

    public String getMeAPen(){
        return "Pen";
    }


}

public class Demo{
    public static void main(String[] args) {
        
        Computer comp = new Computer();
        comp.playMusic();
        System.out.println(comp.getMeAPen());
    }
}