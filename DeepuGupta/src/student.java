class student {
	public static void main(String[] arg) {

		deepu obj = new deepu();
		obj.setdeepu(-111, "   45  ", " rakhi gupta ");

		obj.getdeeepu();

	}

}

class deepu {
	private int student_id;
	private String student_rollno;
	private String student_name;

	public void setdeepu(int student_id, String student_rollno, String student_name) {
		if (student_id >= 0) {

			System.out.println("invailid student id");

		} else {

			this.student_id = student_id;
			this.student_rollno = student_rollno;
			this.student_name = student_name;
		}
	}

	public void getdeeepu() {
		if (student_id >= 0) {

			System.out.println("invailid student id");

		} else
			System.out.println("student_id" + this.student_id);
		System.out.println("student_rollno" + this.student_rollno);
		System.out.println("student_name" + this.student_name);

	}

}