package Error;

public class TestCircleWithRadiusException {
    public static void main(String[] args) {
        try {
            CircleWithCustomException c1 = new CircleWithCustomException(5);
            c1.setRadius(-5);
            CircleWithCustomException c3 = new CircleWithCustomException(4);
        }
        catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }

        System.out.println("Number of objects created: " +
                CircleWithCustomException.getNumberOfObjects());
    }
}
