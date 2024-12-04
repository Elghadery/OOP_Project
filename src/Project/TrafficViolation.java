package Project;

public class TrafficViolation extends vehicle{
    private int violationId;
    private String vehicleId;
    private String violationType;
    private String date;
    private double fineAmount;

    public TrafficViolation(int violationId,String vehicleId,String violationType,String date,double fineAmount){
        this.violationId = violationId;
        this.vehicleId = vehicleId;
        this.violationType = violationType;
        this.date = date;
        this.fineAmount = fineAmount;
    }

    public int getViolationId() {
        return violationId;
    }

    public void setViolationId(int violationId) {
        this.violationId = violationId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getViolationType() {
        return violationType;
    }

    public void setViolationType(String violationType) {
        this.violationType = violationType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public void displayViolationInfo(){
        System.out.println("Violation ID: "+violationId);
        System.out.println("Vehicle ID: "+vehicleId);
        System.out.println("Violation Type: "+violationType);
        System.out.println("Date: "+date);
        System.out.println("Fine Amount: $"+fineAmount);

    }

}

