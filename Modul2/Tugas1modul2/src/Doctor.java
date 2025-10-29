class Doctor {
    private static final double BONUS_RATE = 0.05;
    private String name;
    private double salary;
    private String specialization;

    public Doctor(String name, double salary, String specialization) {
        this.setName(name);
        this.setSalary(salary);
        this.setSpecialization(specialization);
    }

    public static double getBonusRate() {
        return BONUS_RATE;
    }

    public void applyBonus() {
        setSalary(getSalary() + calculateBonus());
        System.out.println("Bonus applied! New Salary: " + getSalary());
    }

    private double calculateBonus() {
        return getSalary() * getBonusRate();
    }

    public void printDoctorInfo() {
        System.out.println("=== Doctor Info ===");
        System.out.println("Name: " + getName());
        System.out.println("Specialization: " + getSpecialization());
        System.out.println("Salary: " + getSalary());
    }

    public void updateSpecialization(String newSpecialization) {
        this.setSpecialization(newSpecialization);
        System.out.println("Specialization updated to: " + getSpecialization());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

class Patient {
    private String name;
    private int roomNumber;
    private Doctor doctor;
    private String disease;

    public Patient(String name, int roomNumber, Doctor doctor, String disease) {
        this.name = name;
        this.roomNumber = roomNumber;
        this.doctor = doctor;
        this.disease = disease;
    }

    public void printPatientInfo() {
        System.out.println("=== Patient Info ===");
        System.out.println("Name: " + name);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Doctor: " + doctor);
        System.out.println("Disease: " + disease);
    }

    public void updateDisease(String newDisease) {
        this.disease = newDisease;
        System.out.println("Disease updated to: " + disease);
    }
}

