public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Nata", 10000000, "Cardiology");
        doctor.printDoctorInfo();

        Patient patient = new Patient("Natania", 101, doctor, "Flu");
        patient.printPatientInfo();

        doctor.applyBonus();
        doctor.updateSpecialization("Neurology");
        patient.updateDisease("Migraine");
    }
}
