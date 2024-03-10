package seminar_02.task_02;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getClass().getName());
        System.out.println(dog);
        
        // Вызов дефолтного метода из интерфейса Soundable
        dog.defaultSound();

         // Вызов статического метода из интерфейса Movable
        Movable.staticMethodMovable();

        // Доступ к константе из интерфейса Eatable
        System.out.println("Тип пищи: " + Eatable.FOOD_TYPE);
    }
}
