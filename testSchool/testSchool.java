package test;

import java.util.*;
public class testSchool
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		originalPerson prici = new  originalPerson("����", 45);
		school sc = new school("�Ͼ���ҵ��ѧ", 1000, "�Ͼ����ֿ���������·XX��");
		originalPerson op1 = new originalPerson("������", 34);
		teacher t1 = new teacher(op1, 9, "���﹤��");
		headTeacher headt = new headTeacher(t1, 30);
		originalPerson op2 = new originalPerson("Ǯԣ��", 24);
		student tester = new student(op2, 9, headt);
		sc.show();
		headt.lead();
		tester.study();
	}
}