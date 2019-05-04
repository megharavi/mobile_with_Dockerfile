package com.MobileAPI.MobileAPI.mobile;

import javax.persistence.*;

	@Entity
	public class secondTable {
		@Id
		@GeneratedValue
		private Integer SerialNum;
		
		private String name;
			
		public secondTable() {
			
		}
		
		public secondTable(Integer serialNum,String name) {
			super();
			SerialNum = serialNum;
			this.name = name;
		}

		public Integer getSerialNum() {
			return SerialNum;
		}

		public void setSerialNum(Integer serialNum) {
			SerialNum = serialNum;
		}


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
}
