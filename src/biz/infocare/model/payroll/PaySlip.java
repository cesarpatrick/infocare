package biz.infocare.model.payroll;

import java.util.List;
import java.util.UUID;

public class PaySlip {
		
	private UUID paySlipID;

	private List<EarningsLine> earningsLines;
	
	private List<DeductionLine> deductionLines;
		
	private List<ReimbursementLine> reimbursementLines;
		
	private List<LeaveAccrualLine> leaveAccrualLines;
		
	private List<SuperannuationLine> sperannuationLines;
		
	private List<EmployeeTaxLine> employeeTaxLines;
		
	private List<EmployerTaxLine> employerTaxLines;
	
	private List<StatutoryDeductionLine> statutoryDeductionLines;
		
	private TaxSettings taxSettings;
		
	private GrossEarningsHistory grossEarningsHistory;

	public UUID getPaySlipID() {
		return paySlipID;
	}

	public void setPaySlipID(UUID paySlipID) {
		this.paySlipID = paySlipID;
	}

	public List<EarningsLine> getEarningsLines() {
		return earningsLines;
	}

	public void setEarningsLines(List<EarningsLine> earningsLines) {
		this.earningsLines = earningsLines;
	}

	public List<DeductionLine> getDeductionLines() {
		return deductionLines;
	}

	public void setDeductionLines(List<DeductionLine> deductionLines) {
		this.deductionLines = deductionLines;
	}

	public List<ReimbursementLine> getReimbursementLines() {
		return reimbursementLines;
	}

	public void setReimbursementLines(List<ReimbursementLine> reimbursementLines) {
		this.reimbursementLines = reimbursementLines;
	}

	public List<LeaveAccrualLine> getLeaveAccrualLines() {
		return leaveAccrualLines;
	}

	public void setLeaveAccrualLines(List<LeaveAccrualLine> leaveAccrualLines) {
		this.leaveAccrualLines = leaveAccrualLines;
	}

	public List<SuperannuationLine> getSperannuationLines() {
		return sperannuationLines;
	}

	public void setSperannuationLines(List<SuperannuationLine> sperannuationLines) {
		this.sperannuationLines = sperannuationLines;
	}

	public List<EmployeeTaxLine> getEmployeeTaxLines() {
		return employeeTaxLines;
	}

	public void setEmployeeTaxLines(List<EmployeeTaxLine> employeeTaxLines) {
		this.employeeTaxLines = employeeTaxLines;
	}

	public List<EmployerTaxLine> getEmployerTaxLines() {
		return employerTaxLines;
	}

	public void setEmployerTaxLines(List<EmployerTaxLine> employerTaxLines) {
		this.employerTaxLines = employerTaxLines;
	}

	public List<StatutoryDeductionLine> getStatutoryDeductionLines() {
		return statutoryDeductionLines;
	}

	public void setStatutoryDeductionLines(List<StatutoryDeductionLine> statutoryDeductionLines) {
		this.statutoryDeductionLines = statutoryDeductionLines;
	}

	public TaxSettings getTaxSettings() {
		return taxSettings;
	}

	public void setTaxSettings(TaxSettings taxSettings) {
		this.taxSettings = taxSettings;
	}

	public GrossEarningsHistory getGrossEarningsHistory() {
		return grossEarningsHistory;
	}

	public void setGrossEarningsHistory(GrossEarningsHistory grossEarningsHistory) {
		this.grossEarningsHistory = grossEarningsHistory;
	}	
}
