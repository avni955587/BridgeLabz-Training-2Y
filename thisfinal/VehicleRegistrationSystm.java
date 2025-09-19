package thisfinal;

class Vehicle {
   
    private static double registrationFee = 5000.0;
    
    private final String registrationNumber;

    private String ownerName;
    private String vehicleType;

   
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;                 // 'this' keyword
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber; // final variable assigned once
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to ₹" + registrationFee + " for all vehicles.");
    }

   
    public void displayVehicleDetails() {
        System.out.println("Owner Name         : " + ownerName);
        System.out.println("Vehicle Type       : " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee   : ₹" + registrationFee);
        System.out.println("------------------------------------------");
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }
}

public class VehicleRegistrationSystm {
    public static void main(String[] args) {
      
        Vehicle v1 = new Vehicle("Avni", "Car", "MH12AB1234");
        Vehicle v2 = new Vehicle("Rahul", "Bike", "MH14XY5678");

        
        if (v1 instanceof Vehicle) {
            v1.displayVehicleDetails();
        }

        if (v2 instanceof Vehicle) {
            v2.displayVehicleDetails();
        }

       
        Vehicle.updateRegistrationFee(6000.0);

        System.out.println("\nAfter updating the registration fee:\n");

        
        if (v1 instanceof Vehicle) {
            v1.displayVehicleDetails();
        }

        if (v2 instanceof Vehicle) {
            v2.displayVehicleDetails();
        }

       
        System.out.println("Unique Registration Number of v1: " + v1.getRegistrationNumber());
    }
}
