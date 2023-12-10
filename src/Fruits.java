public class Fruits extends Food implements Printable{

    private String typeOfFruit;

    public Fruits(String name, String typeOfFruit) {
        super(name);
        this.typeOfFruit = typeOfFruit;
    }

    @Override
    public void print() {
        System.out.println("Название: " + super.getName() +
                "\nТип фруктов: " + typeOfFruit);
    }

}
