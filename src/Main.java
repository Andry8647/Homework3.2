public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 4");
        int age1 = 24;
        if (age1 >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        } else {
            System.out.println("Придется еще подождать(");
        }
        System.out.println("Задача 5");
        if (age1<=7){
            System.out.println("Ты ходишь в школу");
        }else {
            if (age1>=18&&age1<24){
                System.out.println("Ты учишься в вузе");
            }else {
                System.out.println("Иди на свою первую работу(");
            }
        }
        System.out.println("Задача 6");
        int places1 = 100;
        if (places1>=102){
            System.out.println("Вагон забит, жди следующий поезд");
        }else {
            if(places1<60){
                System.out.println("Есть сидячие места!");
            }else {
                System.out.println("Остались только стоячие места(");
            }
        }
    }
}