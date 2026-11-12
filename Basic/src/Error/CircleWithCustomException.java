package Error;

public class CircleWithCustomException {
    private double radius;
    private static int numberOfObjects = 0;


    public CircleWithCustomException(double newRadius)throws InvalidRadiusException{
        setRadius(newRadius);
        numberOfObjects++;
    }

    public void setRadius(double newRadius) throws InvalidRadiusException {
        if(newRadius > 0){
            this.radius = newRadius;
        }
        else{
            throw new InvalidRadiusException(newRadius);
        }
    }
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

}
