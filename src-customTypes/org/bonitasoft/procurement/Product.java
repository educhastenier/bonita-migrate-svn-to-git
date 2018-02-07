package org.bonitasoft.procurement;

import java.io.Serializable;

/**
 * A representation of the model object '<em><b>Product</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Product implements Serializable {
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
	private long vendorId = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String productName = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String partNumber = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String commodityCategory = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private double pricePerUnit = 0.0;

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
	 * Sets the '{@link Product#getId() <em>id</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Product#getId() id}' feature.
	 * @generated
	 */
	public void setId(long newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>vendorId</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>vendorId</b></em>' feature
	 * @generated
	 */
	public long getVendorId() {
		return vendorId;
	}

	/**
	 * Sets the '{@link Product#getVendorId() <em>vendorId</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Product#getVendorId() vendorId}'
	 *            feature.
	 * @generated
	 */
	public void setVendorId(long newVendorId) {
		vendorId = newVendorId;
	}

	/**
	 * Returns the value of '<em><b>productName</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>productName</b></em>' feature
	 * @generated
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Sets the '{@link Product#getProductName() <em>productName</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Product#getProductName() productName}
	 *            ' feature.
	 * @generated
	 */
	public void setProductName(String newProductName) {
		productName = newProductName;
	}

	/**
	 * Returns the value of '<em><b>partNumber</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>partNumber</b></em>' feature
	 * @generated
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * Sets the '{@link Product#getPartNumber() <em>partNumber</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Product#getPartNumber() partNumber}'
	 *            feature.
	 * @generated
	 */
	public void setPartNumber(String newPartNumber) {
		partNumber = newPartNumber;
	}

	/**
	 * Returns the value of '<em><b>commodityCategory</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>commodityCategory</b></em>' feature
	 * @generated
	 */
	public String getCommodityCategory() {
		return commodityCategory;
	}

	/**
	 * Sets the '{@link Product#getCommodityCategory()
	 * <em>commodityCategory</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Product#getCommodityCategory()
	 *            commodityCategory}' feature.
	 * @generated
	 */
	public void setCommodityCategory(String newCommodityCategory) {
		commodityCategory = newCommodityCategory;
	}

	/**
	 * Returns the value of '<em><b>pricePerUnit</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>pricePerUnit</b></em>' feature
	 * @generated
	 */
	public double getPricePerUnit() {
		return pricePerUnit;
	}

	/**
	 * Sets the '{@link Product#getPricePerUnit() <em>pricePerUnit</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Product#getPricePerUnit()
	 *            pricePerUnit}' feature.
	 * @generated
	 */
	public void setPricePerUnit(double newPricePerUnit) {
		pricePerUnit = newPricePerUnit;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Product " + " [id: " + getId() + "]" + " [vendorId: "
				+ getVendorId() + "]" + " [productName: " + getProductName()
				+ "]" + " [partNumber: " + getPartNumber() + "]"
				+ " [commodityCategory: " + getCommodityCategory() + "]"
				+ " [pricePerUnit: " + getPricePerUnit() + "]";
	}
}
