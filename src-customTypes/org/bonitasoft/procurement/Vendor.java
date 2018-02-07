package org.bonitasoft.procurement;

import java.io.Serializable;

/**
 * A representation of the model object '<em><b>Vendor</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Vendor implements Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = 1L;// TODO change that

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private long id = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String orgName = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String contactName = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String contactEmail = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String contactPhone = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String fax = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String address = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String country = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String vatNumber = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isApproved = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isActive = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String commodities = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String code = null;

	/**
	 * Returns the value of '<em><b>id</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>id</b></em>' feature
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the '{@link Vendor#getId() <em>id</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Vendor#getId() id}' feature.
	 * @generated
	 */
	public void setId(long newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>orgName</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>orgName</b></em>' feature
	 * @generated
	 */
	public String getOrgName() {
		return orgName;
	}

	/**
	 * Sets the '{@link Vendor#getOrgName() <em>orgName</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Vendor#getOrgName() orgName}'
	 *            feature.
	 * @generated
	 */
	public void setOrgName(String newOrgName) {
		orgName = newOrgName;
	}

	/**
	 * Returns the value of '<em><b>contactName</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>contactName</b></em>' feature
	 * @generated
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * Sets the '{@link Vendor#getContactName() <em>contactName</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Vendor#getContactName() contactName}'
	 *            feature.
	 * @generated
	 */
	public void setContactName(String newContactName) {
		contactName = newContactName;
	}

	/**
	 * Returns the value of '<em><b>contactEmail</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>contactEmail</b></em>' feature
	 * @generated
	 */
	public String getContactEmail() {
		return contactEmail;
	}

	/**
	 * Sets the '{@link Vendor#getContactEmail() <em>contactEmail</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Vendor#getContactEmail()
	 *            contactEmail}' feature.
	 * @generated
	 */
	public void setContactEmail(String newContactEmail) {
		contactEmail = newContactEmail;
	}

	/**
	 * Returns the value of '<em><b>contactPhone</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>contactPhone</b></em>' feature
	 * @generated
	 */
	public String getContactPhone() {
		return contactPhone;
	}

	/**
	 * Sets the '{@link Vendor#getContactPhone() <em>contactPhone</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Vendor#getContactPhone()
	 *            contactPhone}' feature.
	 * @generated
	 */
	public void setContactPhone(String newContactPhone) {
		contactPhone = newContactPhone;
	}

	/**
	 * Returns the value of '<em><b>fax</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>fax</b></em>' feature
	 * @generated
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * Sets the '{@link Vendor#getFax() <em>fax</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Vendor#getFax() fax}' feature.
	 * @generated
	 */
	public void setFax(String newFax) {
		fax = newFax;
	}

	/**
	 * Returns the value of '<em><b>address</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>address</b></em>' feature
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the '{@link Vendor#getAddress() <em>address</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Vendor#getAddress() address}'
	 *            feature.
	 * @generated
	 */
	public void setAddress(String newAddress) {
		address = newAddress;
	}

	/**
	 * Returns the value of '<em><b>country</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>country</b></em>' feature
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the '{@link Vendor#getCountry() <em>country</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Vendor#getCountry() country}'
	 *            feature.
	 * @generated
	 */
	public void setCountry(String newCountry) {
		country = newCountry;
	}

	/**
	 * Returns the value of '<em><b>vatNumber</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>vatNumber</b></em>' feature
	 * @generated
	 */
	public String getVatNumber() {
		return vatNumber;
	}

	/**
	 * Sets the '{@link Vendor#getVatNumber() <em>vatNumber</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Vendor#getVatNumber() vatNumber}'
	 *            feature.
	 * @generated
	 */
	public void setVatNumber(String newVatNumber) {
		vatNumber = newVatNumber;
	}

	/**
	 * Returns the value of '<em><b>isApproved</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>isApproved</b></em>' feature
	 * @generated
	 */
	public boolean isIsApproved() {
		return isApproved;
	}

	/**
	 * Sets the '{@link Vendor#isIsApproved() <em>isApproved</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Vendor#isIsApproved() isApproved}'
	 *            feature.
	 * @generated
	 */
	public void setIsApproved(boolean newIsApproved) {
		isApproved = newIsApproved;
	}

	/**
	 * Returns the value of '<em><b>isActive</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>isActive</b></em>' feature
	 * @generated
	 */
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * Sets the '{@link Vendor#isIsActive() <em>isActive</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Vendor#isIsActive() isActive}'
	 *            feature.
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		isActive = newIsActive;
	}

	/**
	 * Returns the value of '<em><b>commodities</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>commodities</b></em>' feature
	 * @generated
	 */
	public String getCommodities() {
		return commodities;
	}

	/**
	 * Sets the '{@link Vendor#getCommodities() <em>commodities</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Vendor#getCommodities() commodities}'
	 *            feature.
	 * @generated
	 */
	public void setCommodities(String newCommodities) {
		commodities = newCommodities;
	}

	/**
	 * Returns the value of '<em><b>code</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>code</b></em>' feature
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the '{@link Vendor#getCode() <em>code</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Vendor#getCode() code}' feature.
	 * @generated
	 */
	public void setCode(String newCode) {
		code = newCode;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Vendor " + " [id: " + getId() + "]" + " [orgName: "
				+ getOrgName() + "]" + " [contactName: " + getContactName()
				+ "]" + " [contactEmail: " + getContactEmail() + "]"
				+ " [contactPhone: " + getContactPhone() + "]" + " [fax: "
				+ getFax() + "]" + " [address: " + getAddress() + "]"
				+ " [country: " + getCountry() + "]" + " [vatNumber: "
				+ getVatNumber() + "]" + " [isApproved: " + isIsApproved()
				+ "]" + " [isActive: " + isIsActive() + "]" + " [commodities: "
				+ getCommodities() + "]" + " [code: " + getCode() + "]";
	}
}
