package school.managerment.system;
import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		Teacher canh = new Teacher(1,"Canh", 5000);
		Teacher nam = new Teacher(2,"Nam",4000);
		Teacher trieu = new Teacher(3,"Trieu",3000);
		List<Teacher>  teacherList = new ArrayList<>();
		teacherList.add(canh);
		teacherList.add(nam);
		teacherList.add(trieu);
		
		Student nhat = new Student(1, "Nhat", 10);
		Student thuc = new Student(2, "Thuc", 11);
		Student sang = new Student(3, "Sang", 12);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(nhat);
		studentList.add(thuc);
		studentList.add(sang);
		
		
		School ghs = new School(teacherList, studentList);
		
		Teacher Thua = new Teacher(4, "Thua", 10000);
		ghs.addteacher(Thua);
		
		thuc.payFee(5000);
		nhat.payFee(6000);
		System.out.println("GHS has eared $" + ghs.getTotalMoneyEarned());
		System.out.println("------Making SCHOOL PAY SALARY----");
		canh.receiveSalary(canh.getSalary());
		System.out.println("GHS has spent for salary to " + canh.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());
		nam.receiveSalary(nam.getSalary());
	    System.out.println("GHS has spent for salary to " + nam.getName()
	    +" and now has $" + ghs.getTotalMoneyEarned());
	    
	    
	    System.out.println(thuc);

        trieu.receiveSalary(trieu.getSalary());

        System.out.println(trieu);
	}
}
