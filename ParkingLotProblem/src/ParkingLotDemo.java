package ParkingLotProblem.src;

import ParkingLotProblem.service.ParkingLotService;

public class ParkingLotDemo {
    public static void main(String[] args) {
        System.out.println("🅿️ Welcome to Parking Lot System - Variant 1 (SDE-1 Level)");
        System.out.println("=======================================================\n");

        // Create a parking lot with 10 slots
        ParkingLotService parkingService = new ParkingLotService(10);

        // Display initial status
        parkingService.displayParkingStatus();

         //Test Case 1: Basic parking operations
        System.out.println("📋 Test Case 1: Basic Parking Operations");
        System.out.println("----------------------------------------");

        try {
            // Park different types of vehicles
            parkingService.parkVehicle("ABC123", "CAR");
            parkingService.parkVehicle("XYZ789", "BIKE");
            parkingService.parkVehicle("TRUCK1", "TRUCK");
            parkingService.parkVehicle("CAR456", "CAR");

            // Display status after parking
            parkingService.displayParkingStatus();

        } catch (Exception e) {
            System.err.println("Error in Test Case 1: " + e.getMessage());
        }
//
        // Test Case 2: entity.Vehicle exit and fee calculation
        System.out.println("📋 Test Case 2: entity.Vehicle Exit and Fee Calculation");
        System.out.println("------------------------------------------------");

        try {
            // Wait a moment to simulate time passing (for fee calculation)
            Thread.sleep(1000);

            // Exit vehicles
            parkingService.exitVehicle("ABC123");
            parkingService.exitVehicle("XYZ789");

            // Display status after exits
            parkingService.displayParkingStatus();

        } catch (Exception e) {
            System.err.println("Error in Test Case 2: " + e.getMessage());
        }

        // Test Case 3: Error handling
        System.out.println("📋 Test Case 3: Error Handling");
        System.out.println("------------------------------");

        try {
            // Try to park with invalid vehicle type
            parkingService.parkVehicle("INVALID", "MOTORCYCLE");
        } catch (Exception e) {
            System.out.println("Expected error: " + e.getMessage());
        }

        try {
            // Try to exit non-existent vehicle
            parkingService.exitVehicle("NOTFOUND");
        } catch (Exception e) {
            System.out.println("Expected error: " + e.getMessage());
        }

        try {
            // Try to park duplicate vehicle
            parkingService.parkVehicle("TRUCK1", "TRUCK");
        } catch (Exception e) {
            System.out.println("Expected error: " + e.getMessage());
        }
//
//        // Test Case 4: Fill parking lot to capacity
//        System.out.println("📋 Test Case 4: Fill Parking Lot to Capacity");
//        System.out.println("---------------------------------------------");
//
//        try {
//            // Fill remaining slots
//            for (int i = 1; i <= 8; i++) {
//                parkingService.parkVehicle("CAR" + i, "CAR");
//            }
//
//            parkingService.displayParkingStatus();
//
//            // Try to park when full
//            parkingService.parkVehicle("FULL", "CAR");
//        } catch (Exception e) {
//            System.out.println("Expected error when parking lot is full: " + e.getMessage());
//        }
//
//        // Test Case 5: entity.Vehicle information lookup
//        System.out.println("📋 Test Case 5: entity.Vehicle Information Lookup");
//        System.out.println("-------------------------------------------");
//
//        try {
//            parkingService.getVehicleInfo("TRUCK1");
//            parkingService.getVehicleInfo("CAR456");
//            parkingService.getVehicleInfo("NOTFOUND");
//        } catch (Exception e) {
//            System.err.println("Error in Test Case 5: " + e.getMessage());
//        }
//
//        // Final statistics
//        System.out.println("📊 Final Statistics");
//        System.out.println("===================");
//        parkingService.displayStatistics();
//
//        System.out.println("\n🎯 Key Features Demonstrated:");
//        System.out.println("• Vehicle entry and exit management");
//        System.out.println("• Nearest slot assignment strategy");
//        System.out.println("• Different vehicle types support");
//        System.out.println("• Parking fee calculation");
//        System.out.println("• Error handling and validation");
//        System.out.println("• Real-time parking status display");
    }

}
