package Oop_pkg;
interface Animal {
    int eys = 2;
    void walk();

}
interface Herbivore {

}
class Horse implements Animal,Herbivore{
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}
public class OOP_basic {
    public static void main(String[] args) {
    Horse horse = new Horse();
    horse.walk();
    }


}
