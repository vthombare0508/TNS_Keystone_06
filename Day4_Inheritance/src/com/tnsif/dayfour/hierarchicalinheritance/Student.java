package com.tnsif.dayfour.hierarchicalinheritance;

public class Student extends Person{
	
	private String clas;
		private float per;
	
		public Student() {
			System.out.println("Student class default constructor");
			clas="FY";
			per=70;
		}		
		
		public Student(String name, String city,String clas, float per) {
			super(name, city);
			this.clas = clas;
			this.per = per;
		}

		public String getClas() {
			return clas;
		}

		public void setClas(String clas) {
			this.clas = clas;
		}

		public float getPer() {
			return per;
		}

		public void setPer(float per) {
			this.per = per;
		}

		@Override
		public String toString() {
			return "Student [clas=" + clas + ", per=" + per + "]";
		}

		

}
