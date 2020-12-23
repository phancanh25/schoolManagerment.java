package school.managerment.system;

public class Student {
    private int id;
    private String Name;
    private int grade;
    private int feesPaid;
    private int feesTotal;



    /**
     * To create a new Student by Initializing
     * @param id
     * @param Name
     * @param grade
     */

    public Student (int id, String Name, int grade){
        this.id = id;
        this.Name = Name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return Name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }

    public void payFee(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }
    public int getRemainingFees() {
    	return feesTotal - feesPaid;
    }
    
    @Override
    public String toString() {
        return "Student's name :"+Name+
                " Total fees paid so far $"+ feesPaid;
    }
    
}
