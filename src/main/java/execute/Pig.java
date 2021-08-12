package execute;

/*public class Pig extends Animal{
    @Override
    void animalSound() {
        System.out.println("The pig says: wee wee");
   }

 */

public class Pig implements Animal {
    @Override
    public void animalSound() {
        System.out.println("The pig says: Wee Wee");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}
