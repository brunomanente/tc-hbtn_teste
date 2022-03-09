import java.time.LocalDate;


public class Person {
    private String name;
    private String surname;
    private int birthint;
    private boolean anotherCompanyOwner;
    private boolean Pensioner;
    private boolean PublicServer;
    private float salary;

    public Person() {

    }

    public Person(String name, String surname, int birthint, boolean anotherCompanyOwner, boolean pensioner,
                  boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthint = birthint;
        this.anotherCompanyOwner = anotherCompanyOwner;
        Pensioner = pensioner;
        PublicServer = publicServer;
    }

    public String fullName() {
        return getName() + " " + getSurname();
    }

    public float calculateYearlySalary() {
        return salary * 12;
    }


    public boolean isMEI() {
        LocalDate data = LocalDate.now();
        return (calculateYearlySalary() < 130000) && (data.getYear() - getBirthint() > 18) && isAnotherCompanyOwner() == false
                && isPensioner() == false && isPublicServer() == false;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public float getSalary() {
        return salary;
    }


    public void setSalary(float salary) {
        this.salary = salary;
    }


    public int getBirthint() {
        return birthint;
    }


    public void setBirthint(int birthint) {
        this.birthint = birthint;
    }


    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }


    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }


    public boolean isPensioner() {
        return Pensioner;
    }


    public void setPensioner(boolean pensioner) {
        Pensioner = pensioner;
    }


    public boolean isPublicServer() {
        return PublicServer;
    }


    public void setPublicServer(boolean publicServer) {
        PublicServer = publicServer;
    }




}
