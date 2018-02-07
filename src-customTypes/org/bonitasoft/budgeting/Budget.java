package org.bonitasoft.budgeting;

import java.io.Serializable;
import java.util.Date;

/**
 * A representation of the model object '<em><b>Budget</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Budget implements Serializable {
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
	private double plannedBudget = 0.0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private double actualBudget = 0.0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String department = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String objective = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private long bonitaGroupId = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private long departmentHeadId = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private long parentBudgetId = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String comment = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String attachmentName = null;

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
	private String budgetYear = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Date createdDate = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String departmentName = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String departmentHeadName = null;

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
	 * Sets the '{@link Budget#getId() <em>id</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Budget#getId() id}' feature.
	 * @generated
	 */
	public void setId(long newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>plannedBudget</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>plannedBudget</b></em>' feature
	 * @generated
	 */
	public double getPlannedBudget() {
		return plannedBudget;
	}

	/**
	 * Sets the '{@link Budget#getPlannedBudget() <em>plannedBudget</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Budget#getPlannedBudget()
	 *            plannedBudget}' feature.
	 * @generated
	 */
	public void setPlannedBudget(double newPlannedBudget) {
		plannedBudget = newPlannedBudget;
	}

	/**
	 * Returns the value of '<em><b>actualBudget</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>actualBudget</b></em>' feature
	 * @generated
	 */
	public double getActualBudget() {
		return actualBudget;
	}

	/**
	 * Sets the '{@link Budget#getActualBudget() <em>actualBudget</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Budget#getActualBudget()
	 *            actualBudget}' feature.
	 * @generated
	 */
	public void setActualBudget(double newActualBudget) {
		actualBudget = newActualBudget;
	}

	/**
	 * Returns the value of '<em><b>department</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>department</b></em>' feature
	 * @generated
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the '{@link Budget#getDepartment() <em>department</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Budget#getDepartment() department}'
	 *            feature.
	 * @generated
	 */
	public void setDepartment(String newDepartment) {
		department = newDepartment;
	}

	/**
	 * Returns the value of '<em><b>objective</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>objective</b></em>' feature
	 * @generated
	 */
	public String getObjective() {
		return objective;
	}

	/**
	 * Sets the '{@link Budget#getObjective() <em>objective</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Budget#getObjective() objective}'
	 *            feature.
	 * @generated
	 */
	public void setObjective(String newObjective) {
		objective = newObjective;
	}

	/**
	 * Returns the value of '<em><b>bonitaGroupId</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>bonitaGroupId</b></em>' feature
	 * @generated
	 */
	public long getBonitaGroupId() {
		return bonitaGroupId;
	}

	/**
	 * Sets the '{@link Budget#getBonitaGroupId() <em>bonitaGroupId</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Budget#getBonitaGroupId()
	 *            bonitaGroupId}' feature.
	 * @generated
	 */
	public void setBonitaGroupId(long newBonitaGroupId) {
		bonitaGroupId = newBonitaGroupId;
	}

	/**
	 * Returns the value of '<em><b>departmentHeadId</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>departmentHeadId</b></em>' feature
	 * @generated
	 */
	public long getDepartmentHeadId() {
		return departmentHeadId;
	}

	/**
	 * Sets the '{@link Budget#getDepartmentHeadId() <em>departmentHeadId</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Budget#getDepartmentHeadId()
	 *            departmentHeadId}' feature.
	 * @generated
	 */
	public void setDepartmentHeadId(long newDepartmentHeadId) {
		departmentHeadId = newDepartmentHeadId;
	}

	/**
	 * Returns the value of '<em><b>parentBudgetId</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>parentBudgetId</b></em>' feature
	 * @generated
	 */
	public long getParentBudgetId() {
		return parentBudgetId;
	}

	/**
	 * Sets the '{@link Budget#getParentBudgetId() <em>parentBudgetId</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Budget#getParentBudgetId()
	 *            parentBudgetId}' feature.
	 * @generated
	 */
	public void setParentBudgetId(long newParentBudgetId) {
		parentBudgetId = newParentBudgetId;
	}

	/**
	 * Returns the value of '<em><b>comment</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>comment</b></em>' feature
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * Sets the '{@link Budget#getComment() <em>comment</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Budget#getComment() comment}'
	 *            feature.
	 * @generated
	 */
	public void setComment(String newComment) {
		comment = newComment;
	}

	/**
	 * Returns the value of '<em><b>attachmentName</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>attachmentName</b></em>' feature
	 * @generated
	 */
	public String getAttachmentName() {
		return attachmentName;
	}

	/**
	 * Sets the '{@link Budget#getAttachmentName() <em>attachmentName</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Budget#getAttachmentName()
	 *            attachmentName}' feature.
	 * @generated
	 */
	public void setAttachmentName(String newAttachmentName) {
		attachmentName = newAttachmentName;
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
	 * Sets the '{@link Budget#getStatus() <em>status</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Budget#getStatus() status}' feature.
	 * @generated
	 */
	public void setStatus(String newStatus) {
		status = newStatus;
	}

	/**
	 * Returns the value of '<em><b>budgetYear</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>budgetYear</b></em>' feature
	 * @generated
	 */
	public String getBudgetYear() {
		return budgetYear;
	}

	/**
	 * Sets the '{@link Budget#getBudgetYear() <em>budgetYear</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Budget#getBudgetYear() budgetYear}'
	 *            feature.
	 * @generated
	 */
	public void setBudgetYear(String newBudgetYear) {
		budgetYear = newBudgetYear;
	}

	/**
	 * Returns the value of '<em><b>createdDate</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>createdDate</b></em>' feature
	 * @generated
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets the '{@link Budget#getCreatedDate() <em>createdDate</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Budget#getCreatedDate() createdDate}'
	 *            feature.
	 * @generated
	 */
	public void setCreatedDate(Date newCreatedDate) {
		createdDate = newCreatedDate;
	}

	/**
	 * Returns the value of '<em><b>departmentName</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>departmentName</b></em>' feature
	 * @generated
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * Sets the '{@link Budget#getDepartmentName() <em>departmentName</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Budget#getDepartmentName()
	 *            departmentName}' feature.
	 * @generated
	 */
	public void setDepartmentName(String newDepartmentName) {
		departmentName = newDepartmentName;
	}

	/**
	 * Returns the value of '<em><b>departmentHeadName</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>departmentHeadName</b></em>' feature
	 * @generated
	 */
	public String getDepartmentHeadName() {
		return departmentHeadName;
	}

	/**
	 * Sets the '{@link Budget#getDepartmentHeadName()
	 * <em>departmentHeadName</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Budget#getDepartmentHeadName()
	 *            departmentHeadName}' feature.
	 * @generated
	 */
	public void setDepartmentHeadName(String newDepartmentHeadName) {
		departmentHeadName = newDepartmentHeadName;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Budget " + " [id: " + getId() + "]" + " [plannedBudget: "
				+ getPlannedBudget() + "]" + " [actualBudget: "
				+ getActualBudget() + "]" + " [department: " + getDepartment()
				+ "]" + " [objective: " + getObjective() + "]"
				+ " [bonitaGroupId: " + getBonitaGroupId() + "]"
				+ " [departmentHeadId: " + getDepartmentHeadId() + "]"
				+ " [parentBudgetId: " + getParentBudgetId() + "]"
				+ " [comment: " + getComment() + "]" + " [attachmentName: "
				+ getAttachmentName() + "]" + " [status: " + getStatus() + "]"
				+ " [budgetYear: " + getBudgetYear() + "]" + " [createdDate: "
				+ getCreatedDate() + "]" + " [departmentName: "
				+ getDepartmentName() + "]" + " [departmentHeadName: "
				+ getDepartmentHeadName() + "]";
	}
}
