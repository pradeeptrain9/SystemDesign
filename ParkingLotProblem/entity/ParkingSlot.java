package ParkingLotProblem.entity;

public class ParkingSlot {

    public int slotNumber;
    public boolean status; // true if occupied, false if free

    public Vehicle vehicle; // Vehicle parked in the slot, null if free

    public ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
        this.status = false;
        this.vehicle = null;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
