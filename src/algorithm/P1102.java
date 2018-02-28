package algorithm;

import java.util.*;

class Student {
	
	String name;
	String sex;
	int age;
	int grade;

	public Student(String name, String sex, int age, int grade) {
		
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.grade = grade;
	}
}

public class P1102 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Student[] arr = new Student[n];
		Student zj;
		
		for (int i = 0; i < n; i++) {
			
			String name = sc.next();
			String sex = sc.next();
			int age = sc.nextInt();
			int grade = sc.nextInt();
			
			arr[i] = new Student(name, sex, age, grade);
		}

//		for (int i = 0; i < n; i++) {
//			
//			for (int j = 1; j < n - i; j++) {
//				if (arr[j - 1].grade > arr[j].grade) {
//					zj = arr[j - 1];
//					arr[j - 1] = arr[j];
//					arr[j] = zj;
//				}
//			}
//		}
		
		
		Arrays.sort(arr, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.grade > o2.grade ? 1 : o1.grade == o2.grade ? 0 : -1;
				
			}
			
			
		});
		
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i].name + " " + arr[i].sex + " " + arr[i].age + " " + arr[i].grade);

		}
	}
}
