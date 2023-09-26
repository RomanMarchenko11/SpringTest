package trip;

public class ClassicalMusic implements Music{
    public void doMyInit() {
        System.out.println("Starts my Song");
    }
    public void doMyDestroy() {
        System.out.println("Finishes my Song");
    }
    @Override
    public String getSong() {
        return "Hungarin Rhapsody";
    }
}
