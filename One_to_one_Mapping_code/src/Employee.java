import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hib_emp")
public class Employee {
    @Id
    @Column(name = "eid")
    private long employeeId;

    @Column(name = "fname", length = 15)
    private String firstname;

    @Column(name = "lastName", length = 15)
    private String lastname;

    @Column(name = "bdate", length = 15)
    private Date birthDate;

    @Column(name = "cellphone", length = 15)
    private String cellphone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "eid", referencedColumnName = "eid")
    private Employee_details employeeDetails;

    public Employee() {}

    public Employee(long employeeId, String firstname, String lastname, Date birthDate, String cellphone,
                    Employee_details employeeDetails) {
        this.employeeId = employeeId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.cellphone = cellphone;
        this.employeeDetails = employeeDetails;
    }

    // Getters and Setters
    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public Employee_details getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(Employee_details employeeDetails) {
        this.employeeDetails = employeeDetails;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", firstname=" + firstname + ", lastname=" + lastname
                + ", birthDate=" + birthDate + ", cellphone=" + cellphone + ", employeeDetails=" + employeeDetails + "]";
    }
}
