package test;

import java.util.*;
public class testSchool
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		originalPerson prici = new  originalPerson("汪X", 45);
		school sc = new school("南京工业大学", 1000, "南京市浦口区浦珠南路XX号");
		originalPerson op1 = new originalPerson("王XX", 34);
		teacher t1 = new teacher(op1, 9, "生物工程");
		headTeacher headt = new headTeacher(t1, 30);
		originalPerson op2 = new originalPerson("钱XX", 24);
		student tester = new student(op2, 9, headt);
		sc.show();
		headt.lead();
		tester.study();
	}
}
