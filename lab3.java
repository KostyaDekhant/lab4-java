import java.util.Scanner;


public class lab3{
	public static void main(String args[])
	{
		int count_stud = 0, count_prof = 0;
		Student stud = new Student();
		FIO fio = new FIO("Сергей");
		Human human = new Human(fio);
		Professor prof = new Professor(human);
		count_stud++; count_prof++;
		stud.print(count_stud);
		prof.print(count_prof);
		Student stud1 = new Student();
		Professor prof1 = new Professor();
		count_stud++; count_prof++;
		stud1.read_student();
		stud1.print(count_stud);
		prof1.read_professor();
		prof1.print(count_prof);
		stud.ChangeInfo();
		stud.print(count_stud-1);
		prof.ChangeInfo();
		prof.print(count_prof-1);
	}
}