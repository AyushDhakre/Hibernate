

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="child1_pemp")
@PrimaryKeyJoinColumn(name="p_id")
public class PerEmp extends Employee
{
	@Column(length = 10)
	private String department ;
	@Column(length = 10)
	private String designation;
	public PerEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PerEmp(int id, String name, double salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}
	public PerEmp(int id, String name, double salary, String department, String designation) {
		super(id, name, salary);
		this.department = department;
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "PerEmp [department=" + department + ", designation=" + designation + "]";
	}

	
}
