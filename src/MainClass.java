public class MainClass {
    private int class_number = 20;
    private String class_string = "Hello, world";

    public int getLocalNumber() {
        int number = 14;
        return number;
    }

    public int getClassNumber() {
        return this.class_number;
    }

    public String getClass_string() {
        return this.class_string;
    }
}
