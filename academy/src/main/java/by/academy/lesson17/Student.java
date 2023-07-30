package by.academy.lesson17;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private String name;
	private String group;
	private int course;
	private Double mark;

	public Student() {
		super();
	}

	public Student(String name, String group, int course, Double marks) {
		super();
		this.name = name;
		this.group = group;
		this.course = course;
		this.mark = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public Double getMarks() {
		return mark;
	}

	public void setMarks(Double marks) {
		this.mark = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(course, group, mark, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return course == other.course && Objects.equals(group, other.group) && Objects.equals(mark, other.mark)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", group=" + group + ", course=" + course + ", marks=" + mark + "]";
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.getName());

	}
}
