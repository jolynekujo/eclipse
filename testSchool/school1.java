package test;

class originalPerson
{
	private String name;
	private int age;

	public originalPerson(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
}

class teacher
{
	private int grade;
	private String project;
	private originalPerson op;

	public teacher(originalPerson op, int grade, String project)
	{
		this.grade = grade;
		this.project = project;
		this.op = op;
	}
	public void teach()
	{
		System.out.println(op.getName()+" is teaching "+this.project+"in grade "+this.grade+".");
	}
	public String getName()
	{
		return op.getName();
	}
}

class headTeacher
{
	private int studentNum;
	private teacher t;

	public headTeacher(teacher t, int studentNum)
	{
		this.t = t;
		this.studentNum = studentNum;
	}
	public void lead()
	{
		System.out.println(t.getName()+" leads "+this.studentNum+" students.");
	}
	public String getName()
	{
		return t.getName();
	}
}

class student
{
	private int grade;
	private headTeacher ht;
	private originalPerson op;

	public student(originalPerson op, int grade, headTeacher ht)
	{
		this.op = op;
		this.grade = grade;
		this.ht = ht;
	}
	public void study()
	{
		System.out.println(op.getName()+" is studying in grade "+this.grade+" and under headTeacher "+ht.getName()+"'s lead.");
	}
}

class school
{
	private String name;
	private int studentNum;
	//pravite originalPerson principal;
	private String address;
	public school(String na, int sn, String ad)
	{
		name = na;
		studentNum = sn;
		//principal = pp;
		address = ad;
	}
	public void show()
	{
		System.out.println(this.name+" addresses in "+this.address+", its "+this.studentNum+" students.");
	}
}