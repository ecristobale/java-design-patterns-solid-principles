package com.ecristobale.solid.openClosePrinciple;

import java.util.Date;

public class Animal {

		// Animal properties
		private String name;
		private Date birth;

		public Animal(String name, Date birth) {
			this.name = name;
			this.birth = birth;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getBirth() {
			return birth;
		}

		public void setBirth(Date birth) {
			this.birth = birth;
		}
}
