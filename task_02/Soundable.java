package seminar_02.task_02;

// Интерфейс для представления звуков, издаваемых животными
public interface Soundable {
    String makeSound();
    // Константа
    String SOUND_TYPE = "Звук";
    
    // Дефолтный метод
    default void defaultSound() {
        System.out.println("Это дефолтный метод в интерфейсе Soundable.");
    }
    // Статический метод
    static void staticMethodSoundable() {
        System.out.println("Это статический метод в интерфейсе Soundable.");
    }
}
