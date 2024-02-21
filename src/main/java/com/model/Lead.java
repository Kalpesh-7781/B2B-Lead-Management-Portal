package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leads")
public class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "department")
    private String department;

    @Column(name = "campaign")
    private String campaign;

    @Column(name = "asset_name")
    private String assetName;

    @Column(name = "salutation")
    private String salutation;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "address1")
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "industry")
    private String industry;

    @Column(name = "standard_industry")
    private String standardIndustry;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "job_title_level")
    private String jobTitleLevel;

    @Column(name = "job_title_dept")
    private String jobTitleDept;

    @Column(name = "emp_size")
    private String empSize;

    @Column(name = "revenue")
    private String revenue;

    @Column(name = "country")
    private String country;

    @Column(name = "state")
    private String state;

    @Column(name = "city")
    private String city;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "phone")
    private String phone;

    @Column(name = "direct_dial_extension")
    private String directDialExtension;

    @Column(name = "siccode")
    private String sicCode;

    @Column(name = "naicscode")
    private String naicsCode;

    @Column(name = "job_title_link")
    private String jobTitleLink;

    @Column(name = "employee_size_link")
    private String employeeSizeLink;

    @Column(name = "revenue_size_link")
    private String revenueSizeLink;

    @Column(name = "industry_type_link")
    private String industryTypeLink;

    @Column(name = "sic_nic_link")
    private String sicNicLink;

    @Column(name = "ra_comment")
    private String raComment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCampaign() {
		return campaign;
	}

	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getStandardIndustry() {
		return standardIndustry;
	}

	public void setStandardIndustry(String standardIndustry) {
		this.standardIndustry = standardIndustry;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobTitleLevel() {
		return jobTitleLevel;
	}

	public void setJobTitleLevel(String jobTitleLevel) {
		this.jobTitleLevel = jobTitleLevel;
	}

	public String getJobTitleDept() {
		return jobTitleDept;
	}

	public void setJobTitleDept(String jobTitleDept) {
		this.jobTitleDept = jobTitleDept;
	}

	public String getEmpSize() {
		return empSize;
	}

	public void setEmpSize(String empSize) {
		this.empSize = empSize;
	}

	public String getRevenue() {
		return revenue;
	}

	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDirectDialExtension() {
		return directDialExtension;
	}

	public void setDirectDialExtension(String directDialExtension) {
		this.directDialExtension = directDialExtension;
	}

	public String getSicCode() {
		return sicCode;
	}

	public void setSicCode(String sicCode) {
		this.sicCode = sicCode;
	}

	public String getNaicsCode() {
		return naicsCode;
	}

	public void setNaicsCode(String naicsCode) {
		this.naicsCode = naicsCode;
	}

	public String getJobTitleLink() {
		return jobTitleLink;
	}

	public void setJobTitleLink(String jobTitleLink) {
		this.jobTitleLink = jobTitleLink;
	}

	public String getEmployeeSizeLink() {
		return employeeSizeLink;
	}

	public void setEmployeeSizeLink(String employeeSizeLink) {
		this.employeeSizeLink = employeeSizeLink;
	}

	public String getRevenueSizeLink() {
		return revenueSizeLink;
	}

	public void setRevenueSizeLink(String revenueSizeLink) {
		this.revenueSizeLink = revenueSizeLink;
	}

	public String getIndustryTypeLink() {
		return industryTypeLink;
	}

	public void setIndustryTypeLink(String industryTypeLink) {
		this.industryTypeLink = industryTypeLink;
	}

	public String getSicNicLink() {
		return sicNicLink;
	}

	public void setSicNicLink(String sicNicLink) {
		this.sicNicLink = sicNicLink;
	}

	public String getRaComment() {
		return raComment;
	}

	public void setRaComment(String raComment) {
		this.raComment = raComment;
	}
	
	public Lead() {
		super();
	}

	public Lead(Long id, String department, String campaign, String assetName, String salutation, String firstName,
			String lastName, String email, String companyName, String address1, String address2, String industry,
			String standardIndustry, String jobTitle, String jobTitleLevel, String jobTitleDept, String empSize,
			String revenue, String country, String state, String city, String zipCode, String phone,
			String directDialExtension, String sicCode, String naicsCode, String jobTitleLink, String employeeSizeLink,
			String revenueSizeLink, String industryTypeLink, String sicNicLink, String raComment) {
		super();
		this.id = id;
		this.department = department;
		this.campaign = campaign;
		this.assetName = assetName;
		this.salutation = salutation;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.companyName = companyName;
		this.address1 = address1;
		this.address2 = address2;
		this.industry = industry;
		this.standardIndustry = standardIndustry;
		this.jobTitle = jobTitle;
		this.jobTitleLevel = jobTitleLevel;
		this.jobTitleDept = jobTitleDept;
		this.empSize = empSize;
		this.revenue = revenue;
		this.country = country;
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
		this.phone = phone;
		this.directDialExtension = directDialExtension;
		this.sicCode = sicCode;
		this.naicsCode = naicsCode;
		this.jobTitleLink = jobTitleLink;
		this.employeeSizeLink = employeeSizeLink;
		this.revenueSizeLink = revenueSizeLink;
		this.industryTypeLink = industryTypeLink;
		this.sicNicLink = sicNicLink;
		this.raComment = raComment;
	}

	@Override
	public String toString() {
		return "Lead [id=" + id + ", department=" + department + ", campaign=" + campaign + ", assetName=" + assetName
				+ ", salutation=" + salutation + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", companyName=" + companyName + ", address1=" + address1 + ", address2=" + address2
				+ ", industry=" + industry + ", standardIndustry=" + standardIndustry + ", jobTitle=" + jobTitle
				+ ", jobTitleLevel=" + jobTitleLevel + ", jobTitleDept=" + jobTitleDept + ", empSize=" + empSize
				+ ", revenue=" + revenue + ", country=" + country + ", state=" + state + ", city=" + city + ", zipCode="
				+ zipCode + ", phone=" + phone + ", directDialExtension=" + directDialExtension + ", sicCode=" + sicCode
				+ ", naicsCode=" + naicsCode + ", jobTitleLink=" + jobTitleLink + ", employeeSizeLink="
				+ employeeSizeLink + ", revenueSizeLink=" + revenueSizeLink + ", industryTypeLink=" + industryTypeLink
				+ ", sicNicLink=" + sicNicLink + ", raComment=" + raComment + "]";
	}   
}
