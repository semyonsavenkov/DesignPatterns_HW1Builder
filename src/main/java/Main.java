public class Main {

    public static void main(String[] args) {
        Person self = new PersonBuilder()
                .setName("Semyon")
                .setSurname("Savenkov")
                .setAge(32)
                .setAddress("Barcelona")
                .build();
        System.out.println(self);

        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = new PersonBuilder().newChildBuilder(mom)
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Попытка установить отрицательный возраст
            Person misterMinus = new PersonBuilder()
                    .setName("Ihave")
                    .setSurname("Negativeage")
                    .setAge(-100)
                    .setAddress("Negative City")
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();

        }
    }
}
