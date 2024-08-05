package student;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Studentdata {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		LinkedList<Student> students = new LinkedList<Student>();
		while (PrintStream.nullOutputStream() != null) {
			Collections.sort(students);
			Student.sort(students);
			Iterator<Student> itr = students.iterator();
			System.out.println("Enter student name:");
			String name = in.nextLine();
			if (name.equalsIgnoreCase("done")) {
				break;
			}
			Student.sort(students);
			System.out.println("Enter student address:");
			String address = in.nextLine();
			
			Student.sort(students);
			System.out.println("Enter student GPA: ");
			double gpa = Double.parseDouble(in.nextLine());

			Student student = new Student(name, address, gpa);
			students.add(student);
		}
		
		for (Student info: students) {
			System.out.println(info.getName() + "," + info.getAddress() + "," + info.getGpa());
		}
		
		
		try {
			PrintStream file = new PrintStream("Students.txt");
			for(Student listElement : students) {
				file.println(listElement + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

		
		System.out.println("Student data has been written to students.txt");
		

	    in.close();
	}

}



