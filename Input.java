import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
	Scanner scan = new Scanner(System.in);
	
	 private List<String> vName = new ArrayList<String>();
	 private List<String> vGender = new ArrayList<String>();
	 private List<Integer> vAge = new ArrayList<Integer>();
	 private List<String> vAddress = new ArrayList<String>();
	 private List<String> vInitial = new ArrayList<String>();
	 
	 private String name;
	 private Integer age;
	 private String gender;
	 private String address;
	 private String initial;
	 
	public Input(){

	}
	//add array
	public void addName(String name) {
		vName.add(name);
	}
	
	public void addAge(Integer age) {
		vAge.add(age);
	}
	
	public void addGender(String gender) {
		vGender.add(gender);
	}
	
	public void addAddress(String address) {
		vAddress.add(address);
	}
	
	public void addInitial(String initial) {
		vInitial.add(initial);
	}
	
	//set array
	public void setName(Integer temp, String temp1) {
		for(int j = 0 ; j<vName.size();j++) {
			vName.set(j, temp1);
		}
	}
	
	public void setGender(Integer temp, String temp1) {
		for(int j = 0 ; j<vName.size();j++) {
			vGender.set(j, temp1);
		}
	}
	
	public void setAddress(Integer temp, String temp1) {
		for(int j = 0 ; j<vName.size();j++) {
			vAddress.set(j, temp1);
		}
	}
	
	public void setAge(Integer temp, Integer temp1) {
		for(int j = 0 ; j<vName.size();j++) {
			vAge.set(j, temp1);
		}
	}
	
	public void setInitial(Integer temp, String temp1) {
		for(int j = 0 ; j<vName.size();j++) {
			vInitial.set(j, temp1);
		}
	}
	//remove array
	
	public void removeName(String name) {
		vName.remove(name);
	}
	
	public void removeGender(String gender) {
		vGender.remove(gender);
	}
	
	public void removeAddress(String address) {
		vAddress.remove(address);
	}
	
	public void removeAge(Integer age) {
		vAge.remove(age);
	}
	
	public void removeInitial(String initial) {
		vInitial.remove(initial);
	}
	
	//take array
	public List<String> getNames(){
		return new ArrayList<String>(vName);
	}
	
	public List<String> getGenders(){
		return new ArrayList<String>(vGender);
	}
	
	public List<Integer> getAges(){
		return new ArrayList<Integer>(vAge);
	}
	
	public List<String> getAddresses(){
		return new ArrayList<String>(vAddress);
	}
	
	public List<String> getInitials(){
		return new ArrayList<String>(vInitial);
	}
	
	//ArrayList
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void setInitial(String initial) {
		this.initial = initial;
	}
	//Getter
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getAddress() {
		return address;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public String getInitial() {
		return initial;
	}
	
	//end
	
	
	
	public static void main(String[] args) {
		
	}
}
