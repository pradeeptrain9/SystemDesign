package ParkingLotProblem.service;

import ParkingLotProblem.entity.ParkingLot;
import ParkingLotProblem.entity.ParkingSlot;
import ParkingLotProblem.entity.Vehicle;

public class ParkingLotService {

    public final int slots;
    public final ParkingLot parkingLot;

    public Integer earnings = 0;

    public ParkingLotService(int slots) {
        this.slots = slots;
        this.parkingLot = new ParkingLot(slots);
    }

    public void displayParkingStatus() {
        System.out.print("======Parking status========\n");

        for(int i=1; i<= parkingLot.getTotalslots();i++){
            System.out.println("Slot Number " + i +": " + parkingLot.getSlotsIndicator().get(i).isStatus());
        }
    }

    public void parkVehicle(String name, String type) {

        if(type != "CAR" && type != "BIKE" && type != "TRUCK"){
            throw new IllegalArgumentException("entity.Vehicle type is not accepted");
        }

        Vehicle vehicle = new Vehicle(name, type);
        Integer slotNumber = parkingLot.parkVehicle(vehicle);

        System.out.println("Slot Number "+ slotNumber + " is Parked with " + vehicle.getName());

    }

    public void exitVehicle(String name) {
        int bill = parkingLot.exitVehicle(name);
        earnings += bill;

        System.out.println("Vehicle :"+ name + " exited with bil l" + bill);

    }
}
