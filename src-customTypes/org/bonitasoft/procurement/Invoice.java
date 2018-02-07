package org.bonitasoft.procurement;

import java.io.Serializable;
import java.util.Date;

/**
 * A representation of the model object '<em><b>Invoice</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Invoice implements Serializable {
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
	private String invoiceNumber = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private double priceBeforeTax = 0.0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private double tax = 0.0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Date invoiceDueDate = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Date invoiceDate = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private double priceAfterTax = 0.0;

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
	 * Sets the '{@link Invoice#getId() <em>id</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Invoice#getId() id}' feature.
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
	 * Sets the '{@link Invoice#getPoId() <em>poId</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Invoice#getPoId() poId}' feature.
	 * @generated
	 */
	public void setPoId(long newPoId) {
		poId = newPoId;
	}

	/**
	 * Returns the value of '<em><b>invoiceNumber</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>invoiceNumber</b></em>' feature
	 * @generated
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * Sets the '{@link Invoice#getInvoiceNumber() <em>invoiceNumber</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Invoice#getInvoiceNumber()
	 *            invoiceNumber}' feature.
	 * @generated
	 */
	public void setInvoiceNumber(String newInvoiceNumber) {
		invoiceNumber = newInvoiceNumber;
	}

	/**
	 * Returns the value of '<em><b>priceBeforeTax</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>priceBeforeTax</b></em>' feature
	 * @generated
	 */
	public double getPriceBeforeTax() {
		return priceBeforeTax;
	}

	/**
	 * Sets the '{@link Invoice#getPriceBeforeTax() <em>priceBeforeTax</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Invoice#getPriceBeforeTax()
	 *            priceBeforeTax}' feature.
	 * @generated
	 */
	public void setPriceBeforeTax(double newPriceBeforeTax) {
		priceBeforeTax = newPriceBeforeTax;
	}

	/**
	 * Returns the value of '<em><b>tax</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>tax</b></em>' feature
	 * @generated
	 */
	public double getTax() {
		return tax;
	}

	/**
	 * Sets the '{@link Invoice#getTax() <em>tax</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Invoice#getTax() tax}' feature.
	 * @generated
	 */
	public void setTax(double newTax) {
		tax = newTax;
	}

	/**
	 * Returns the value of '<em><b>invoiceDueDate</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>invoiceDueDate</b></em>' feature
	 * @generated
	 */
	public Date getInvoiceDueDate() {
		return invoiceDueDate;
	}

	/**
	 * Sets the '{@link Invoice#getInvoiceDueDate() <em>invoiceDueDate</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Invoice#getInvoiceDueDate()
	 *            invoiceDueDate}' feature.
	 * @generated
	 */
	public void setInvoiceDueDate(Date newInvoiceDueDate) {
		invoiceDueDate = newInvoiceDueDate;
	}

	/**
	 * Returns the value of '<em><b>invoiceDate</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>invoiceDate</b></em>' feature
	 * @generated
	 */
	public Date getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * Sets the '{@link Invoice#getInvoiceDate() <em>invoiceDate</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Invoice#getInvoiceDate() invoiceDate}
	 *            ' feature.
	 * @generated
	 */
	public void setInvoiceDate(Date newInvoiceDate) {
		invoiceDate = newInvoiceDate;
	}

	/**
	 * Returns the value of '<em><b>priceAfterTax</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>priceAfterTax</b></em>' feature
	 * @generated
	 */
	public double getPriceAfterTax() {
		return priceAfterTax;
	}

	/**
	 * Sets the '{@link Invoice#getPriceAfterTax() <em>priceAfterTax</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Invoice#getPriceAfterTax()
	 *            priceAfterTax}' feature.
	 * @generated
	 */
	public void setPriceAfterTax(double newPriceAfterTax) {
		priceAfterTax = newPriceAfterTax;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Invoice " + " [id: " + getId() + "]" + " [poId: " + getPoId()
				+ "]" + " [invoiceNumber: " + getInvoiceNumber() + "]"
				+ " [priceBeforeTax: " + getPriceBeforeTax() + "]" + " [tax: "
				+ getTax() + "]" + " [invoiceDueDate: " + getInvoiceDueDate()
				+ "]" + " [invoiceDate: " + getInvoiceDate() + "]"
				+ " [priceAfterTax: " + getPriceAfterTax() + "]";
	}
}
