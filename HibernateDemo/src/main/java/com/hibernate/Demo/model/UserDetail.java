package com.hibernate.Demo.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="USER_DETAILS")
public class UserDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "USER_NAME")
	private String name;
	
	@Column(name = "USER_PHONE_NUM")
	private int phone;
	
	/*
	 * Embedded will add all the fields of Address table in USER_DETAILS Table
	 * It will not create a seperate table for Address
	 */
	@Embedded
	private Address homeAddress;
	
	/*
	 * if we are mapping 2 same Objects but with different purpose
	 * then to override Column name in DB we should use @AttributeOverridder annotation
	 * with this we can define custom name for each filed. See example below
	 */
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="city", column=@Column(name="OFFICE_CITY")),
		@AttributeOverride(name="street", column=@Column(name="OFFICE_STREET")),
		@AttributeOverride(name="country", column=@Column(name="OFFICE_COUNTRY")),
		@AttributeOverride(name="pinCode", column=@Column(name="OFFICE_PINCODE"))
	})
	private Address officeAddress;
	/*
	 * @ElementCollection overrides the behavior of Embedded Address table and 
	 * creates a new table to store the collection value. The new table will be created with
	 * this default name - UserDetail_oldAddressList and this new table will be joined with User table
	 * using Id column. The default name given to join column is UserDetail_id
	 * Ex - insert into UserDetail_oldAddressList (UserDetail_id, CITY_NAME, COUNTRY_NAME, PINCODE_NAME, STREET_NAME) values (?, ?, ?, ?, ?)
	 * We can use @JoinTable annotation to correctly name the new table and define join property there
	 * Ex - insert into USER_OLD_ADDRESS (USER_ID, CITY_NAME, COUNTRY_NAME, PINCODE_NAME, STREET_NAME) values (?, ?, ?, ?, ?)
	 * 
	 *  In ElementCollection we can define Fetch strategy as well which will fetch the values from associated tables
	 * Eagerly or Lazily. This is helpful when we want to get data from DB. By default it is Lazzy Initialization
	 */
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name = "USER_OLD_ADDRESS", joinColumns=@JoinColumn(name="USER_ID"))
	private Set<Address> oldAddressList = new HashSet<Address>();
	
	/*
	 * in above old address variable we see that a new table is created with address fields but it
	 * dont have its own unique key(primary). To do so we can use @CollectionId annotation from hibernate 
	 * to generate primary key for collection element table below is how we can create primary key column for the table
	 * Note - support for hilo generator is removed from MySql 5 it uses sequence generator now
	 * 
	 * In ElementCollection we can define Fetch strategy as well which will fetch the values from associated tables
	 * Eagerly or Lazily. This is helpful when we want to get data from DB. By default it is Lazzy Initialization
	 */
	@ElementCollection(fetch=FetchType.LAZY)
	@JoinTable(name = "USER_EMPLOYEER", joinColumns=@JoinColumn(name="USER_ID"))
	@GenericGenerator(name="sequence_gen",strategy="sequence")
	@CollectionId(columns = { @Column(name="EMPLOYEER_ID")}, generator ="sequence_gen", type=@Type(type = "long"))
	private Collection<UserEmployeer> employeer	= new ArrayList<UserEmployeer>();
	
	/*
	 * Added One to one Mapping for User with Vehicle
	 * Note:We will need to use Cascading here else it will throw below error
	 * object references an unsaved transient instance - save the transient instance before flushing:
	 */
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="VEHICLE_ID")
	private Vehicle vehicle;
	
	/*
	 * In One to Many relations, when we create table using Hibernate, it don't add foreign key in table to
	 * Maintain one to many relationship, instead it creates a new table with primary key of participating table
	 * using their primary key column and establishes relationship among them
	 * 
	 * Note: The property which will have @JointTable, will create a column as Foregin key from other table
	 * And OneToMany, without any mappedBy parameter will create a new table and with mappedby Parameter it will not create new table
	 * Also if we are using mappedBy then we cannot use @JoinTable on that so either of them should be used
	 * mappedBy value should be same as the variable name in referencing Entity Table
	 */
	@OneToMany(mappedBy="userDetail")
	//@JoinTable(joinColumns=@JoinColumn(name="USER_ID"),inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))
	private Collection<Vehicle> officeVehicle = new ArrayList<Vehicle>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;     
	}
	
	
	public Set<Address> getOldAddressList() {
		return oldAddressList;
	}
	public void setOldAddressList(Set<Address> oldAddressList) {
		this.oldAddressList = oldAddressList;
	}
	
	
	public Collection<UserEmployeer> getEmployeer() {
		return employeer;
	}
	public void setEmployeer(Collection<UserEmployeer> employeer) {
		this.employeer = employeer;
	}
	
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
	public Collection<Vehicle> getOfficeVehicle() {
		return officeVehicle;
	}
	public void setOfficeVehicle(Collection<Vehicle> officeVehicle) {
		this.officeVehicle = officeVehicle;
	}
	/*********Constructor Declaration***********/
	public UserDetail() {
		super();
		// TODO Auto-generated constructor stub
	                                                                                                                                                                    
	}
	public UserDetail(String name, int phone, Address homeAddress, Address officeAddress) {
		super();
		this.name = name;
		this.phone = phone;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
	}
	public UserDetail(String name, int phone, Address homeAddress, Address officeAddress, Set<Address> oldAddressList) {
		super();
		this.name = name;
		this.phone = phone;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
		this.oldAddressList = oldAddressList;
	}
	/****************End Of Constructor declaration****************/
	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", name=" + name + ", phone=" + phone + ", homeAddress=" + homeAddress
				+ ", officeAddress=" + officeAddress + "\noldAddressList="+ oldAddressList+"]";
	}
	
	
	

}
