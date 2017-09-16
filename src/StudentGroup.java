import java.util.Date;
import java.io.*; 
import java.text.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {
                Scanner sc=new Scanner(System.in);
	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() throws IleegalArgumentException{
		for(i=0;i<students.length;i++)
		{
                                         if(students[i]!=NULL)
                                                     return students[i];
                                           else 
                                              return NULL;
		}
		return null;
	}

	@Override
	public void setStudents(Student[] students) throws IllegalArgumentException {
		for(i=0;i<students.length;i++)
		{
		   SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		   students[i].id=sc.nextInt();
                                   students[i].fullName=sc.next();
		   Strintg str=sc.next();
                                   students[i].birthDate=sdf.parse(str);
		   students[i].avgMark=sc.nextDouble();
 		}
                 
		
	}

	@Override
	public Student getStudent(int index) throws IllegalArgumentException{
		if(index>=0 && index<students.length)
                                             return students[index];
                               else
		return null;
	}

	@Override
	public void setStudent(Student student, int index) throws IllegalArgumentException{
                               if(student!=NULL)
                                 students[index]=student;
                            else 
                                return NULL;
		
	}

	@Override
	public void addFirst(Student student) {
		LinkedList ll=LinkedList(Student students);
		ll.addFirst(student);
	}

	@Override
	public void addLast(Student student) {
		LinkedList ll=LinkedList(Student students);
		ll.addLast(student);
	}

	@Override
	public void add(Student student, int index) {
		LinkedList ll=LinkedList(Student students);
		ll.add(index,student);
	}

	@Override
	public void remove(int index) {
		LinkedList ll=LinkedList(Student students);
		ll.remove(student[index]);
	}

	@Override
	public void remove(Student student) {
		LinkedList ll=LinkedList(Student students);
		ll.remove(student);
	}

	@Override
	public void removeFromIndex(int index) {
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
