package java_collection.set_practice.question1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student_SetTest {

	public static void main(String[] args) {

//		Student s1 = new Student(101, "Deepak Baij","Mahendranagar", "9813485412");
//		Student s2 = new Student(102, "Bhawani Bist", "D.C", "9848484848");
//		Student s3 = new Student(103, "Ravi Shah", "UK", "9848586878");
//		Student s4 = new Student(101, "Deepak Baij","Mahendranagar", "9813485412");
//		Student s5 = new Student(105, "Ramesh Bhatt", "Dhangadi", "9848384757");
//		Student s6 = new Student(106, "Bhuban Sharma", "Dhangadi", "9857674767");
//		
//		
//		Set<Student> set = new HashSet<>();
//		
//		//add
//		set.add(s1);
//		set.add(s2);
//		set.add(s3);
//		set.add(s4);
//		set.add(s5);
//		set.add(s6);

		Set<Student> set = Set.of(new Student(101, "Deepak Baij", "Mahendranagar", "9813485412"),
				new Student(102, "Bhawani Bist", "D.C", "9848484848"),
				new Student(103, "Ravi Shah", "UK", "9848586878"),
				new Student(101, "Deepak Baij", "Mahendranagar", "9813485412"),
				new Student(105, "Ramesh Bhatt", "Dhangadi", "9848384757"),
				new Student(106, "Bhuban Sharma", "Dhangadi", "9857674767"),
				new Student(102, "Bhawani Bist", "D.C", "9848484848"));
		// forEach loop [to print details]
		for (Student s : set) {
			System.out.println(s);
		}

	}

}
