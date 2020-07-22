package SimpleFactoryPattern;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        factory.create("java");
    }
}
