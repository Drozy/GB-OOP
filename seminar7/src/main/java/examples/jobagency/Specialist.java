package examples.jobagency;

public class Specialist implements Observer {

    String name;

    public Specialist(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (salary < 60 || !nameCompany.equals("GeekBrains")){
            System.out.println(String.format("Specialist %s: I am waiting for the better job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
        else{
            System.out.println(String.format("Specialist %s: Ok. I am ready for this job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
