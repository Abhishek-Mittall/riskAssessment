package com.myspace.risk;

import java.lang.reflect.Field;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Applicant implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Age")
	private java.lang.Integer age;
	@org.kie.api.definition.type.Label("Existing Customer")
	private java.lang.Boolean existingCustomer;
	@org.kie.api.definition.type.Label("Annual Income")
	private java.lang.Integer annualIncome;
	@org.kie.api.definition.type.Label("Mortgage Amount")
	private java.lang.Integer mortgageAmount;
	@org.kie.api.definition.type.Label("Account Balance")
	private java.lang.Integer accountBalance;
	@org.kie.api.definition.type.Label("Bankruptcy")
	private java.lang.Boolean bankruptcy;
	@org.kie.api.definition.type.Label("Number Of Default Payments Last 12 Months")
	private java.lang.Integer numberOfDefaultPaymentsLast12Months;
	@org.kie.api.definition.type.Label("Years With Bank")
	private java.lang.Integer yearsWithBank;
	@org.kie.api.definition.type.Label("Demographic Assessment")
	private java.lang.String demographicAssessment;

	@org.kie.api.definition.type.Label("Credit CardD emographic Assessment")
	private java.lang.String creditCardDemographicAssessment;

	@org.kie.api.definition.type.Label("Credit Score")
	private java.lang.Integer creditScore;

	@org.kie.api.definition.type.Label("TotalCreditScore")
	private java.lang.Integer totalCreditScore;

	@org.kie.api.definition.type.Label("Explanation")
	private java.lang.String explanation;

	@org.kie.api.definition.type.Label("Approved??")
	private java.lang.Boolean approved;

	public Applicant() {
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.Boolean getExistingCustomer() {
		return this.existingCustomer;
	}

	public void setExistingCustomer(java.lang.Boolean existingCustomer) {
		this.existingCustomer = existingCustomer;
	}

	public java.lang.Integer getAnnualIncome() {
		return this.annualIncome;
	}

	public void setAnnualIncome(java.lang.Integer annualIncome) {
		this.annualIncome = annualIncome;
	}

	public java.lang.Integer getMortgageAmount() {
		return this.mortgageAmount;
	}

	public void setMortgageAmount(java.lang.Integer mortgageAmount) {
		this.mortgageAmount = mortgageAmount;
	}

	public java.lang.Integer getAccountBalance() {
		return this.accountBalance;
	}

	public void setAccountBalance(java.lang.Integer accountBalance) {
		this.accountBalance = accountBalance;
	}

	public java.lang.Boolean getBankruptcy() {
		return this.bankruptcy;
	}

	public void setBankruptcy(java.lang.Boolean bankruptcy) {
		this.bankruptcy = bankruptcy;
	}

	public java.lang.Integer getNumberOfDefaultPaymentsLast12Months() {
		return this.numberOfDefaultPaymentsLast12Months;
	}

	public void setNumberOfDefaultPaymentsLast12Months(
			java.lang.Integer numberOfDefaultPaymentsLast12Months) {
		this.numberOfDefaultPaymentsLast12Months = numberOfDefaultPaymentsLast12Months;
	}

	public java.lang.Integer getYearsWithBank() {
		return this.yearsWithBank;
	}

	public void setYearsWithBank(java.lang.Integer yearsWithBank) {
		this.yearsWithBank = yearsWithBank;
	}

	public java.lang.String getDemographicAssessment() {
		return this.demographicAssessment;
	}

	public void setDemographicAssessment(java.lang.String demographicAssessment) {
		this.demographicAssessment = demographicAssessment;
	}

	public java.lang.String getCreditCardDemographicAssessment() {

		if (this.demographicAssessment.compareTo("Unsuitable") == 0) {
			this.creditCardDemographicAssessment = "Unsuitable";
		}
		return this.creditCardDemographicAssessment;
	}

	public void setCreditCardDemographicAssessment(
			java.lang.String creditCardDemographicAssessment) {
		this.creditCardDemographicAssessment = creditCardDemographicAssessment;
	}

	public java.lang.Integer getCreditScore() {

		if (this.existingCustomer == false) {
			this.creditScore = 350;
			return this.creditScore;
		}

		if (this.age < 18) {
			this.creditScore = 350;
			return this.creditScore;
		}

		if (this.demographicAssessment.compareTo("Unsuitable") == 0) {
			this.creditScore = 0;
			return this.creditScore;
		}

		if (this.creditCardDemographicAssessment.compareTo("Unsuitable") == 0) {
			this.creditScore = 0;
			return this.creditScore;
		}
		return this.creditScore;
	}

	public void setCreditScore(java.lang.Integer creditScore) {
		this.creditScore = creditScore;
	}

	public java.lang.Integer getTotalCreditScore() {

		if (this.existingCustomer == false) {
			this.totalCreditScore = 350;
			return this.totalCreditScore;
		}

		if (this.age < 18) {
			this.totalCreditScore = 350;
			return this.totalCreditScore;
		}

		if (this.demographicAssessment.compareTo("Unsuitable") == 0) {
			this.totalCreditScore = 350;
			return this.totalCreditScore;
		}

		if (this.creditCardDemographicAssessment.compareTo("Unsuitable") == 0) {
			this.totalCreditScore = 350;
			return this.totalCreditScore;
		}

		return this.totalCreditScore;
	}

	public void setTotalCreditScore(java.lang.Integer totalCreditScore) {
		this.totalCreditScore = totalCreditScore;
	}

	public java.lang.Boolean getApproved() {

		this.approved = true;

		if (this.existingCustomer == false) {
			this.approved = false;
			return this.approved;
		}

		if (this.age < 18) {
			this.approved = false;
			return this.approved;
		}

		if (this.bankruptcy == true) {
			this.approved = false;
			return this.approved;
		}

		if (this.demographicAssessment.compareTo("Unsuitable") == 0) {
			this.approved = false;
			return this.approved;
		}

		if (this.creditCardDemographicAssessment.compareTo("Unsuitable") == 0) {
			this.approved = false;
			return this.approved;
		}

		if (this.totalCreditScore < 500) {
			this.approved = false;
			return this.approved;
		}

		return this.approved;

	}

	public void setApproved(java.lang.Boolean approved) {
		this.approved = approved;
	}

	public java.lang.String getExplanation() {

		this.explanation = "Approved because all the conditions are suitable and total credit score is more than 500";

		if (this.existingCustomer == false) {
			this.explanation = "Customer is not an existing customer";
			return this.explanation;
		}

		if (this.age < 18) {
			this.explanation = "Customer is underage";
			return this.explanation;
		}

		if (this.bankruptcy == true) {
			this.explanation = "Customer is bankrupt";
			return this.explanation;
		}

		if (this.demographicAssessment.compareTo("Unsuitable") == 0) {
			this.explanation = "Customer fails demographicAssessment";
			return this.explanation;
		}

		if (this.creditCardDemographicAssessment.compareTo("Unsuitable") == 0) {
			this.explanation = "Customer fails creditCardDemographicAssessment";
			return this.explanation;
		}

		if (this.totalCreditScore < 500) {
			this.explanation = "Rejected because all the conditions are suitable but total credit score is less than 500";
			return this.explanation;
		}

		return this.explanation;

	}

	public void setExplanation(java.lang.String explanation) {
		this.explanation = explanation;
	}

	public Applicant(java.lang.Integer age, java.lang.Boolean existingCustomer,
			java.lang.Integer annualIncome, java.lang.Integer mortgageAmount,
			java.lang.Integer accountBalance, java.lang.String cardType,
			java.lang.Boolean bankruptcy,
			java.lang.Integer numberOfDefaultPaymentsLast12Months,
			java.lang.Integer yearsWithBank, java.lang.Boolean approved,
			java.lang.String explanation,
			java.lang.String demographicAssessment,
			java.lang.String creditCardDemographicAssessment,
			java.lang.Integer creditScore, java.lang.Integer totalCreditScore) {
		this.age = age;
		this.existingCustomer = existingCustomer;
		this.annualIncome = annualIncome;
		this.mortgageAmount = mortgageAmount;
		this.accountBalance = accountBalance;
		this.bankruptcy = bankruptcy;
		this.numberOfDefaultPaymentsLast12Months = numberOfDefaultPaymentsLast12Months;
		this.yearsWithBank = yearsWithBank;
		this.demographicAssessment = demographicAssessment;
		this.creditCardDemographicAssessment = creditCardDemographicAssessment;
		this.creditScore = creditScore;
		this.totalCreditScore = totalCreditScore;
		this.approved = approved;
		this.explanation = explanation;
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		String newLine = System.getProperty("line.separator");

		result.append(this.getClass().getName());
		result.append(" Object {");
		result.append(newLine);

		// determine fields declared in this class only (no fields of
		// superclass)
		Field[] fields = this.getClass().getDeclaredFields();

		// print field names paired with their values
		for (Field field : fields) {
			result.append("  ");
			try {
				if ((field.getName().compareTo("totalCreditScore") == 0)
						|| (field.getName().compareTo("approved") == 0)
						|| (field.getName().compareTo("explanation") == 0)) {
					result.append(field.getName());
					result.append(": ");
					// requires access to private field:
					result.append(field.get(this));
				}
			} catch (IllegalAccessException ex) {
				System.out.println(ex);
			}
			result.append(newLine);
		}
		result.append("}");

		return result.toString();
	}

	public Applicant(java.lang.Integer age, java.lang.Boolean existingCustomer,
			java.lang.Integer annualIncome, java.lang.Integer mortgageAmount,
			java.lang.Integer accountBalance, java.lang.Boolean bankruptcy,
			java.lang.Integer numberOfDefaultPaymentsLast12Months,
			java.lang.String demographicAssessment,
			java.lang.String creditCardDemographicAssessment,
			java.lang.Integer creditScore, java.lang.Integer totalCreditScore,
			java.lang.Integer yearsWithBank, java.lang.Boolean approved,
			java.lang.String explanation) {
		this.age = age;
		this.existingCustomer = existingCustomer;
		this.annualIncome = annualIncome;
		this.mortgageAmount = mortgageAmount;
		this.accountBalance = accountBalance;
		this.bankruptcy = bankruptcy;
		this.numberOfDefaultPaymentsLast12Months = numberOfDefaultPaymentsLast12Months;
		this.yearsWithBank = yearsWithBank;
		this.demographicAssessment = demographicAssessment;
		this.creditCardDemographicAssessment = creditCardDemographicAssessment;
		this.creditScore = creditScore;
		this.totalCreditScore = totalCreditScore;
		this.explanation = explanation;
		this.approved = approved;
	}

	public Applicant(java.lang.Integer age, java.lang.Boolean existingCustomer,
			java.lang.Integer annualIncome, java.lang.Integer mortgageAmount,
			java.lang.Integer accountBalance, java.lang.Boolean bankruptcy,
			java.lang.Integer numberOfDefaultPaymentsLast12Months,
			java.lang.Integer yearsWithBank,
			java.lang.String demographicAssessment,
			java.lang.String creditCardDemographicAssessment,
			java.lang.Integer creditScore, java.lang.Integer totalCreditScore,
			java.lang.String explanation, java.lang.Boolean approved) {
		this.age = age;
		this.existingCustomer = existingCustomer;
		this.annualIncome = annualIncome;
		this.mortgageAmount = mortgageAmount;
		this.accountBalance = accountBalance;
		this.bankruptcy = bankruptcy;
		this.numberOfDefaultPaymentsLast12Months = numberOfDefaultPaymentsLast12Months;
		this.yearsWithBank = yearsWithBank;
		this.demographicAssessment = demographicAssessment;
		this.creditCardDemographicAssessment = creditCardDemographicAssessment;
		this.creditScore = creditScore;
		this.totalCreditScore = totalCreditScore;
		this.explanation = explanation;
		this.approved = approved;
	}

}