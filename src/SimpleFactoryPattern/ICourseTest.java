package SimpleFactoryPattern;

public class ICourseTest {
    public static void main(String[] args) {
        ICourse course = new JavaCourse();
        course.record();
    }
}
