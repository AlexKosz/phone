public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }

    public abstract void displayInfo();

    public String getVersionNumber() {
    	return versionNumber;
    }

    
    public void setVersionNumber(int versionNumber) {
    	this.versionNumber = versionNumber;
    }

    public int getBatteryPercentage() {
    	return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
    	this.batteryPercentage = batteryPercentage;
    }

    public String getRingTone() {
    	return ringTone;
    }

    public String getCarrier() {
    	return carrier;
    }

    public String setCarrier(String carrier) {
    	this.carrier = carrier;
    }
}
