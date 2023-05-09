package ressource;

public class animal {
    
    private int size;
    private String sound;
    private String color;


    public animal(int size, String sound,String color){
        this.size=size;
        this.sound=sound;
        this.color=color;

    }

    public void toStringAnimal(){
        System.out.println("Animal"+this.size+" "+ this.sound);
    }

}
