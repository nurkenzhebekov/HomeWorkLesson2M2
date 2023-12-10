public class Main {

    public static void main(String[] args) {

        Printable fruits = createObject("Fruits");
        Printable vegetables = createObject("Vegetables");
        Printable meat = createObject("Meat");

        Printable[] printables = {fruits, vegetables, meat};

        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }

    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Fruits":
                return new Fruits("Мандарин", "Цитрусовые");
            case "Vegetables":
                return new Vegetables("Морьков", "Корнеплодные");
            case "Meat":
                return new Meat("Курица", "Домашняя птица");
            default:
                throw new IllegalArgumentException("Неподдерживаемое имя класса" + className);
        }
    }

}