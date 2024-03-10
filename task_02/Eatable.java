package seminar_02.task_02;

// Интерфейс для представления питания животных
public interface Eatable {
    void eat();
    // Константа
    String FOOD_TYPE = "Пища";
    
    // Дефолтный метод
    default void defaultEat() {
        System.out.println("Это дефолтный метод в интерфейсе Eatable.");
    }
    // Статический метод
    static void staticMethodEatable() {
        System.out.println("Это статический метод в интерфейсе Eatable.");
    }
}
