package org.bonitasoft.procurement;

import java.io.Serializable;

/**
 * A representation of the model object '<em><b>OrderItem</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class OrderItem implements Serializable {
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
	private long poId = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private long quantity = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private double price = 0.0;

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
	 * Sets the '{@link OrderItem#getId() <em>id</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link OrderItem#getId() id}' feature.
	 * @generated
	 */
	public void setId(long newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>poId</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>poId</b></em>' feature
	 * @generated
	 */
	public long getPoId() {
		return poId;
	}

	/**
	 * Sets the '{@link OrderItem#getPoId() <em>poId</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link OrderItem#getPoId() poId}' feature.
	 * @generated
	 */
	public void setPoId(long newPoId) {
		poId = newPoId;
	}

	/**
	 * Returns the value of '<em><b>quantity</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>quantity</b></em>' feature
	 * @generated
	 */
	public long getQuantity() {
		return quantity;
	}

	/**
	 * Sets the '{@link OrderItem#getQuantity() <em>quantity</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link OrderItem#getQuantity() quantity}'
	 *            feature.
	 * @generated
	 */
	public void setQuantity(long newQuantity) {
		quantity = newQuantity;
	}

	/**
	 * Returns the value of '<em><b>price</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>price</b></em>' feature
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the '{@link OrderItem#getPrice() <em>price</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link OrderItem#getPrice() price}' feature.
	 * @generated
	 */
	public void setPrice(double newPrice) {
		price = newPrice;
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
	 * Sets the '{@link OrderItem#getVendorId() <em>vendorId</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link OrderItem#getVendorId() vendorId}'
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
	 * Sets the '{@link OrderItem#getProductName() <em>productName</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link OrderItem#getProductName()
	 *            productName}' feature.
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
	 * Sets the '{@link OrderItem#getPartNumber() <em>partNumber</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link OrderItem#getPartNumber() partNumber}
	 *            ' feature.
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
	 * Sets the '{@link OrderItem#getCommodityCategory()
	 * <em>commodityCategory</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link OrderItem#getCommodityCategory()
	 *            commodityCategory}' feature.
	 * @generated
	 */
	public void setCommodityCategory(String newCommodityCategory) {
		commodityCategory = newCommodityCategory;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "OrderItem " + " [id: " + getId() + "]" + " [poId: " + getPoId()
				+ "]" + " [quantity: " + getQuantity() + "]" + " [price: "
				+ getPrice() + "]" + " [vendorId: " + getVendorId() + "]"
				+ " [productName: " + getProductName() + "]" + " [partNumber: "
				+ getPartNumber() + "]" + " [commodityCategory: "
				+ getCommodityCategory() + "]";
	}
}
