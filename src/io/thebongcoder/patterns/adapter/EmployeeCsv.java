package io.thebongcoder.patterns.adapter;

public class EmployeeCsv {

    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;

    private static final int INDEX_NOT_FOUND = -1;

    public EmployeeCsv(String values){
        if(values.indexOf(",") == INDEX_NOT_FOUND){
            throw new IllegalArgumentException("Values must be comma separated");
        }

        String[] tokens = values.split(",");
        if(tokens.length != 4){
            throw new IllegalArgumentException("All values are not present. Format ID,FIRSTNAME,LASTNAME,EMAIL");
        }

        this.id = Integer.parseInt(tokens[0]);
        this.firstName = tokens[1];
        this.lastName = tokens[2];
        this.emailAddress = tokens[3];
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "EmployeeCsv{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
