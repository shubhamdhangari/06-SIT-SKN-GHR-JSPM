package com.tnsif.dayfive.associationdemohasA;

public class Address {

	
	//data members
		private String street;
		private String city;
		private int flatno;
		private String State;
		private String postalCode;
		
		
		//default 
		public Address() {
			super();
		}
		
		//para
		public Address(String street, String city, int flatno, String state, String postalCode) {
			super();
			this.street = street;
			this.city = city;
			this.flatno = flatno;
			State = state;
			this.postalCode = postalCode;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getFlatno() {
			return flatno;
		}
		public void setFlatno(int flatno) {
			this.flatno = flatno;
		}
		public String getState() {
			return State;
		}
		public void setState(String state) {
			State = state;
		}
		public String getPostalCode() {
			return postalCode;
		}
		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}
		@Override
		public String toString() {
			return "Address [street=" + street + ", city=" + city + ", flatno=" + flatno + ", State=" + State
					+ ", postalCode=" + postalCode + "]";
		}
		
		
		
		
}
