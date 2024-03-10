package seminar_02.task_02;

public class Dog implements Soundable, Movable, Eatable {
    @Override
    public String makeSound() {
        return "Гав-гав";
    }

    @Override
    public void move() {
        System.out.println("Собака бежит.");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест кость.");
    }
}
