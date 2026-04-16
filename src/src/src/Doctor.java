class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public void display() {
        super.display();
        System.out.println("Specialization: " + specialization);
    }
}
