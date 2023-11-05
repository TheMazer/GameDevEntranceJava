public class Main {

    public static void main(String[] args) {

        class Item {
            private String name;
            private double weight;

            public Item(String name, double weight) {
                this.name = name;
                this.weight = weight;
            }

            public String getName() {
                return name;
            }

            public double getWeight() {
                return weight;
            }

            public static Item findHeaviestItem(Item[] items) {
                Item heaviestItem = items[0];
                for (int i = 1; i < items.length; i++) {
                    if (items[i].getWeight() > heaviestItem.getWeight()) {
                        heaviestItem = items[i];
                    }
                }
                return heaviestItem;
            }
        }

        Item[] items = {
                new Item("Меч", 2.5),
                new Item("Топор", 3.2),
                new Item("Книга Заклинаний", 0.8),
                new Item("Самоцвет", 1.0)
        };

        Item heaviestItem = Item.findHeaviestItem(items);
        System.out.println("Самый тяжёлый предмет: " + heaviestItem.getName() + " (" + heaviestItem.getWeight() + " кг)");

    }

}