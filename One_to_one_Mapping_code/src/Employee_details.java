import javax.persistence.*;

@Entity
@Table(name = "hib_empdetail")
public class Employee_details {
    @Id
    @Column(name = "eid")
    private long employeeId;

    @Column(name = "street", length = 15)
    private String street;

    @Column(name = "city", length = 15)
    private String city;

    @Column(name = "state", length = 15)
    private String state;

    @Column(name = "country", length = 15)
    private String country;

    @OneToOne(mappedBy = "employeeDetails")
    private Employee employee;

    public Employee_details() {}

    public Employee_details(long employeeId, String street, String city, String state, String country) {
        this.employeeId = employeeId;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    // Getters and Setters
    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Employee_details [employeeId=" + employeeId + ", street=" + street + ", city=" + city + ", state="
                + state + ", country=" + country + "]";
    }
}
