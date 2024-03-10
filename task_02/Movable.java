package seminar_02.task_02;

// Интерфейс для представления движения животных
public interface Movable {
    void move();
    // Константа
    String MOVEMENT_TYPE = "Движение";
    
    // Дефолтный метод
    default void defaultMove() {
        System.out.println("Это дефолтный метод в интерфейсе Movable.");
    }
    // Статический метод
    static void staticMethodMovable () {
        System.out.println("Это статический метод в интерфейсе Movable.");
    }
}
