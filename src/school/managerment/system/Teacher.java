package school.managerment.system;

public class Teacher {
    private int id;
    private String Name;
    private int salary;
    private int salaryEarned;

    /**
     * 
     * @param id
     * @param name
     * @param salary
     */

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.Name = name;
        this.salary = salary;
        this.salaryEarned=0;
    }

    public int getId() {
        return id;
    }

    /**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.Name = name;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
        return Name;
    }

    public int getSalary() {
        return salary;
    }
    
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }
    
    @Override
    public String toString() {
        return "Name of the Teacher: " + Name
                +" Total salary earned so far $"
                + salaryEarned;
    }
}
