package info.inetsolv;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="emp_tbl")
public class Employee {
	@Id
	@Column(name="eno")
	private Integer eno;
	@Column(name="ename")
	private String ename;
	@Column(name="salary")
	private Double salary;
	
	public Employee(Integer eno, String ename, Double salary) {
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}	
	
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getName() {
		return ename;
	}
	public void setName(String name) {
		this.ename = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}