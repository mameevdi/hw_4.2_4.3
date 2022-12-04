public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 4.2");
        int peopleAge = 19;
        if (peopleAge >= 7 && peopleAge < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (peopleAge >= 18 && peopleAge < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (peopleAge >= 24) {
            System.out.println("Человек закончил университет и ему пора искать первую работу");
        }
        System.out.println(" ");
        System.out.println("Задание 4.3");
        int carCapacity = 100;
        if (carCapacity <= 60){
            System.out.println("В вагоне есть сидячие места");
        }
        else if (carCapacity <= 102){
            System.out.println("В вагоне нет сидячих мест, есть стоячие места");
        }
        else {
            System.out.println("В вагоне нет мест!");
        }
    }
}