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
        System.out.println("Вместимость одного вагона поезда составляет 102 человека. Вагон рассчитан на 60 сидячих мест, все остальные – стоячие.");
        int varCapacity = 150;
        System.out.println("Если в вагон будут идти на посадку " + varCapacity + " человек, то ");
        if (varCapacity <= 60){
            System.out.println("В вагоне останутся сидячие места");
        }
        else if (varCapacity <= 102){
            System.out.println("В вагоне не будет сидячих мест, но останутся стоячие места");
        }
        else {
            System.out.println("В вагоне не будет мест!");
            }
        if (varCapacity > 102) {
            int varCapacityCouldntFit = varCapacity - 102;
            System.out.println("из которых " + varCapacityCouldntFit + " человек не поместится");
        }
    }
}