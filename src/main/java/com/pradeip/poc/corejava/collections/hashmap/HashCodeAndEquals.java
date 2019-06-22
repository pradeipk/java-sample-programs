package com.p2.collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Demonstrates how to override Hascode() and equals() 
// what happens when storing equal objects in HashMap
class Students {

	private Integer rollNumber;
	private String schoolName;
	private Integer standard;

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Integer getStandard() {
		return standard;
	}

	public void setStandard(Integer standard) {
		this.standard = standard;
	}

	public Students(Integer rollNumber, String schoolName, Integer standard) {
		super();
		this.rollNumber = rollNumber;
		this.schoolName = schoolName;
		this.standard = standard;
	}

	@Override
	public int hashCode() {
		return 31 * this.rollNumber + 7;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) { // checking references
			return true;
		} else if (obj == null) { // checking null
			return false;
		} else if (obj instanceof Students) {
			Students stu = (Students) obj;
			if ((stu.getRollNumber() == null && this.getRollNumber() == null)
					|| (stu.getRollNumber().equals(this.getRollNumber()) && ((stu
							.getSchoolName() == null && this.schoolName == null) || stu
							.getSchoolName().equals(this.schoolName)))) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {

		return this.getSchoolName();
	}

}

public class HashCodeAndEquals {

	public static void main(String[] args) {

		Students stu0 = new Students(123, "Saint Xaviour", 1);
		Students stu1 = new Students(123, "XLRI", 2);
		// this will override the the value for previous key since the objects
		// are equal based on roll number and and school name
		Students stu2 = new Students(123, "XLRI", 3);

		Map<Students, Integer> map = new HashMap<Students, Integer>();
		map.put(stu0, 1);
		map.put(stu1, 2);
		map.put(stu2, 3);
		map.put(null, 4);

		// Map.Entry<Students , Integer> e = (Entry<Students, Integer>)
		// map.entrySet();

		Set<Students> stus = (Set<Students>) map.keySet();

		for (Students students : stus) {
			// System.out.println(students.hashCode());
			System.out.println(map.get(students));
		}

		System.out.println("\nUsing Entry set");
		for (Map.Entry<Students, Integer> e : map.entrySet()) {
			System.out.print(e.getKey() + " : " + e.getValue());
			System.out.println(" ");			
		}

		
		System.out.println("\nUsing Iterator ");
		Iterator<Entry<Students, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {	
			// it.next returns entry 
			Map.Entry<Students, Integer> entry = it.next();			
			System.out.print(entry.getKey() + " : " + entry.getValue());
			System.out.println(" ");
		}
	}
}
