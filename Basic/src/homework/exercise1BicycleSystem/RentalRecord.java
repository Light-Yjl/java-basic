package homework.exercise1BicycleSystem;

public class RentalRecord {
    private String bikeId;
    private int time;
    private int cost;

    public RentalRecord(String bikeId, int time, int cost) {
        this.bikeId = bikeId;
        this.time = time;
        this.cost = cost;
    }

    public String getBikeId() {
        return bikeId;
    }
    public int getTime() {
        return time;
    }
    public int getCost() {
        return cost;
    }
}
