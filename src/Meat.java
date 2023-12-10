public class Meat extends Food implements Printable{

    private String typeOfMeat;

    public Meat(String name, String typeOfMeat) {
        super(name);
        this.typeOfMeat = typeOfMeat;
    }

    @Override
    public void print() {
        System.out.println("Название: " + super.getName() +
                "\nТип мяса: " + typeOfMeat);
    }

}
