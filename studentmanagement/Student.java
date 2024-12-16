package com.zhuyishag.javase.studentmanagement;

/**
 * @author Arczys
 * 学生类
 * 
 * 1.程序启动时，读取一个预设的学生数组，其中已经保存了学生信息（包括学生姓名、学号、出生日期、性别、联系方式
等）。
2.程序提供以下操作选项：
-显示所有学生的信息
-通过学号查找学生的信息
-添加新的学生信息
- 修改学生信息
- 删除学生信息
-退出程序
3.添加新的学生信息时，要求输入学生所有信息，并自动添加到学生数组中，学号自动生成，不能与已有学生的学号重复。
4.修改学生信息时，提示用户输入要修改的学生的学号，然后允许用户修改该学生的信息（包括姓名、出生日期、性别、
联系方式等)。
5.删除学生信息时，提示用户输入要删除的学生的学号，并将该学生从学生数组中删除。
6.修改、添加和删除学生信息后，重新显示所有学生的信息。
 */

public class Student {
	
	private String name;
	
	private int studentNo;
	
	private String birth;
	
	private boolean sex;
	
	private long telegram;


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int studentNo, String birth, boolean sex, long telegram) {
		super();
		this.name = name;
		this.studentNo = studentNo;
		this.birth = birth;
		this.sex = sex;
		this.telegram = telegram;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the studentNo
	 */
	public int getStudentNo() {
		return studentNo;
	}

	/**
	 * @param studentNo the studentNo to set
	 */
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	/**
	 * @return the birth
	 */
	public String getBirth() {
		return birth;
	}

	/**
	 * @param birth the birth to set
	 */
	public void setBirth(String birth) {
		this.birth = birth;
	}

	/**
	 * @return the sex
	 */
	public boolean isSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(boolean sex) {
		this.sex = sex;
	}

	/**
	 * @return the telegram
	 */
	public long getTelegram() {
		return telegram;
	}

	/**
	 * @param telegram the telegram to set
	 */
	public void setTelegram(long telegram) {
		this.telegram = telegram;
	}

	//姓名、学号、出生日期、性别、联系方式
	@Override
	public String toString() {
		return this.getName() + ":" + "[" + "学号：" + this.getStudentNo()+	" 出生日期" + this.getBirth() +
				" 性别：" + (this.isSex() ? "男" : "女") + " 联系方式：" + this.getTelegram() + "]";
	}
}





























































