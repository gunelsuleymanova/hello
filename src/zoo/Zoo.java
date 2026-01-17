//package zoo;
//
//public class Zoo {
//
//    private Animals[] animal;
//    private int count;
//    public Zoo(int size) {
//        animal = new Animals[][size];
//        count = 0;
//    }
//
//    public void addAnimal(Animals animal) {
//        if (count < animal.length) {
//            animal[count] = animal;
//            count++;
//        }
//    }
//
//    public void showAnimals() {
//        for (int i = 0; i < count; i++) {
//            animal[i].info();
//        }
//    }
//
//    public void makeAllSounds() {
//        for (int i = 0; i < count; i++) {
//            animal[i].makeSound();
//            // Flyable check hələ keçmədiyimiz üçün yazmırıq
//        }
//    }
//}
//}
