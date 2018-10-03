package org.bonitasoft.procurement;

import java.io.Serializable;
import java.util.Date;

/**
 * A representation of the model object '<em><b>Order</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Order implements Serializable {
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
	private String poNumber = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private long requestorBonitaId = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private double totalPrice = 0.0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String status = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Date deliveryDate = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Vendor vendor = null;

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
	 * Sets the '{@link Order#getId() <em>id</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Order#getId() id}' feature.
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
	 * Sets the '{@link Order#getVendorId() <em>vendorId</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Order#getVendorId() vendorId}'
	 *            feature.
	 * @generated
	 */
	public void setVendorId(long newVendorId) {
		vendorId = newVendorId;
	}

	/**
	 * Returns the value of '<em><b>poNumber</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>poNumber</b></em>' feature
	 * @generated
	 */
	public String getPoNumber() {
		return poNumber;
	}

	/**
	 * Sets the '{@link Order#getPoNumber() <em>poNumber</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Order#getPoNumber() poNumber}'
	 *            feature.
	 * @generated
	 */
	public void setPoNumber(String newPoNumber) {
		poNumber = newPoNumber;
	}

	/**
	 * Returns the value of '<em><b>requestorBonitaId</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>requestorBonitaId</b></em>' feature
	 * @generated
	 */
	public long getRequestorBonitaId() {
		return requestorBonitaId;
	}

	/**
	 * Sets the '{@link Order#getRequestorBonitaId() <em>requestorBonitaId</em>}
	 * ' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Order#getRequestorBonitaId()
	 *            requestorBonitaId}' feature.
	 * @generated
	 */
	public void setRequestorBonitaId(long newRequestorBonitaId) {
		requestorBonitaId = newRequestorBonitaId;
	}

	/**
	 * Returns the value of '<em><b>totalPrice</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>totalPrice</b></em>' feature
	 * @generated
	 */
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * Sets the '{@link Order#getTotalPrice() <em>totalPrice</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Order#getTotalPrice() totalPrice}'
	 *            feature.
	 * @generated
	 */
	public void setTotalPrice(double newTotalPrice) {
		totalPrice = newTotalPrice;
	}

	/**
	 * Returns the value of '<em><b>status</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>status</b></em>' feature
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the '{@link Order#getStatus() <em>status</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Order#getStatus() status}' feature.
	 * @generated
	 */
	public void setStatus(String newStatus) {
		status = newStatus;
	}

	/**
	 * Returns the value of '<em><b>deliveryDate</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>deliveryDate</b></em>' feature
	 * @generated
	 */
	public Date getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * Sets the '{@link Order#getDeliveryDate() <em>deliveryDate</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Order#getDeliveryDate() deliveryDate}
	 *            ' feature.
	 * @generated
	 */
	public void setDeliveryDate(Date newDeliveryDate) {
		deliveryDate = newDeliveryDate;
	}

	/**
	 * Returns the value of '<em><b>vendor</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>vendor</b></em>' feature
	 * @generated
	 */
	public Vendor getVendor() {
		return vendor;
	}

	/**
	 * Sets the '{@link Order#getVendor() <em>vendor</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Order#getVendor() vendor}' feature.
	 * @generated
	 */
	public void setVendor(Vendor newVendor) {
		vendor = newVendor;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Order " + " [id: " + getId() + "]" + " [vendorId: "
				+ getVendorId() + "]" + " [poNumber: " + getPoNumber() + "]"
				+ " [requestorBonitaId: " + getRequestorBonitaId() + "]"
				+ " [totalPrice: " + getTotalPrice() + "]" + " [status: "
				+ getStatus() + "]" + " [deliveryDate: " + getDeliveryDate()
				+ "]";
	}
}
