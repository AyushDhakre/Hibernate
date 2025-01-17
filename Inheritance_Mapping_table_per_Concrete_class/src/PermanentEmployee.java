

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="perEmp108")
public class PermanentEmployee extends Employee {

	 @Column(name = "Designation", length = 7)
	 String designation;
	 
	 @Column(name = "DName", length = 5)
		String department;

	public PermanentEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee(int empid, String empName,String empsalary ,String designation, String department) {
		super();
		this.designation = designation;
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [designation=" + designation + ", department=" + department + "]";
	}

	 
	 
}
