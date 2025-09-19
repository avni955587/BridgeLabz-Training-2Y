package thisfinal;

class Patient {
  
    private static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;

    private final int patientID;

    private String name;
    private int age;
    private String ailment;

   
    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;  
        this.name = name;            
        this.age = age;
        this.ailment = ailment;
        totalPatients++;            
    }

  
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

   
    public void displayPatientDetails() {
        System.out.println("Hospital Name : " + hospitalName);
        System.out.println("Patient ID    : " + patientID);
        System.out.println("Name          : " + name);
        System.out.println("Age           : " + age);
        System.out.println("Ailment       : " + ailment);
        System.out.println("----------------------------------");
    }


    public int getPatientID() {
        return patientID;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
       
        Patient p1 = new Patient(101, "Nidhi", 22, "Flu");
        Patient p2 = new Patient(102, "Rajiv", 30, "Fracture");

       
        if (p1 instanceof Patient) {
            p1.displayPatientDetails();
        }

        if (p2 instanceof Patient) {
            p2.displayPatientDetails();
        }

      
        Patient.getTotalPatients();


        System.out.println("Unique Patient ID of p1: " + p1.getPatientID());
    }
}

