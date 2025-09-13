package ParkingLotProblem.entity;

import java.util.HashMap;

public class ParkingLot {
    public  int totalslots;
    public  int availableslots;
    public final HashMap<Integer, ParkingSlot> slotsIndicator;

    public final HashMap<String, Integer> vehicleToSlot;


    public ParkingLot(int slots) {
        this.totalslots = slots;
        this.availableslots = slots;
        this.vehicleToSlot = new HashMap<>();
        this.slotsIndicator = new HashMap<>();

        for(int i=1;i<=totalslots; i++){
            slotsIndicator.put(i, new ParkingSlot(i));
        }
    }

    public int getTotalslots() {
        return totalslots;
    }

    public int getAvailableslots() {
        return availableslots;
    }

    public HashMap<Integer, ParkingSlot> getSlotsIndicator() {
        return slotsIndicator;
    }

    public int parkVehicle(Vehicle vehicle) {
        if(vehicle == null){
            throw new IllegalArgumentException("entity.Vehicle cannot be null");
        }
        if(isParkingFull()){
            throw new IllegalStateException("Parking lot is full");
        }

        if(vehicleToSlot.containsKey(vehicle.getName())){
            throw new IllegalStateException("entity.Vehicle " + vehicle.getName() + " is already parked");
        }

        int nearestSlot = findNearestSlot();

        if(nearestSlot == -1)
        {
            throw new IllegalStateException("Parking Lot is occupied!");
        }

        ParkingSlot slot = slotsIndicator.get(nearestSlot);
        slot.setVehicle(vehicle);
        slot.setStatus(true);
        vehicleToSlot.put(vehicle.getName(), nearestSlot);

        availableslots--;

        return nearestSlot;
    }

    private boolean isParkingFull() {

        return availableslots == 0;
    }

    private int findNearestSlot() {
        for(int i=1;i<=totalslots;i++){
            if(!slotsIndicator.get(i).isStatus()){
                return i;
            }
        }

        return -1;
    }
}
