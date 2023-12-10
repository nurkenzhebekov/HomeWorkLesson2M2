public class Vegetables extends Food implements Printable{

    private String typeOfVegetables;

    public Vegetables(String name, String typeOfVegetables) {
        super(name);
        this.typeOfVegetables = typeOfVegetables;
    }

    @Override
    public void print() {
        System.out.println("Название: " + super.getName() +
                "\nТип овощей: " + typeOfVegetables);
    }

}
