package biz.infocare.model.payroll;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class TaxSettings {

	@JsonProperty("periodUnits")
	private Integer periodUnits;
		
	public enum PeriodTypeEnum {
		WEEKS("weeks"), 
		MONTHS("months");

		private String value;

		PeriodTypeEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static PeriodTypeEnum fromValue(String text) {
			for (PeriodTypeEnum b : PeriodTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + text + "'");
		}
	}

	@JsonProperty("periodType")
	private PeriodTypeEnum periodType;	
	
	public enum TaxCodeEnum {
		ND("ND"), 
		M("M"), 
		ME("ME"), 
		MSL("MSL"),
		MESL("MESL"),
		SB("SB"),
		S("S"),
		SH(""),
		ST("ST"),
		SBSL("SBSL"),
		SSL("SSL"),
		SHSL("SHSL"),
		STSL("STSL"),
		WT("WT"),
		CAE("CAE"),
		EDW("EDW"),
		NSW("NSW"),
		STC("STC"),
		STCSL("STCSL");

		private String value;

		TaxCodeEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TaxCodeEnum fromValue(String text) {
			for (TaxCodeEnum b : TaxCodeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + text + "'");
		}
	}

	@JsonProperty("taxCode")
	private TaxCodeEnum taxCode;
		
	@JsonProperty("lumpSumTaxCode")
	private TaxCodeEnum lumpSumTaxCode;
	
	@JsonProperty("specialTaxRate")
	private String specialTaxRate;

	@JsonProperty("lumpSumAmount")
	private Double lumpSumAmount;

	public Integer getPeriodUnits() {
		return periodUnits;
	}

	public void setPeriodUnits(Integer periodUnits) {
		this.periodUnits = periodUnits;
	}

	public PeriodTypeEnum getPeriodType() {
		return periodType;
	}

	public void setPeriodType(PeriodTypeEnum periodType) {
		this.periodType = periodType;
	}

	public TaxCodeEnum getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(TaxCodeEnum taxCode) {
		this.taxCode = taxCode;
	}

	public TaxCodeEnum getLumpSumTaxCode() {
		return lumpSumTaxCode;
	}

	public void setLumpSumTaxCode(TaxCodeEnum lumpSumTaxCode) {
		this.lumpSumTaxCode = lumpSumTaxCode;
	}

	public String getSpecialTaxRate() {
		return specialTaxRate;
	}

	public void setSpecialTaxRate(String specialTaxRate) {
		this.specialTaxRate = specialTaxRate;
	}

	public Double getLumpSumAmount() {
		return lumpSumAmount;
	}

	public void setLumpSumAmount(Double lumpSumAmount) {
		this.lumpSumAmount = lumpSumAmount;
	}
	
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TaxSettings taxSettings = (TaxSettings) o;
		return Objects.equals(this.periodUnits, taxSettings.periodUnits)
				&& Objects.equals(this.periodType, taxSettings.periodType)
				&& Objects.equals(this.taxCode, taxSettings.taxCode)
				&& Objects.equals(this.lumpSumTaxCode, taxSettings.lumpSumTaxCode)
				&& Objects.equals(this.specialTaxRate, taxSettings.specialTaxRate)
				&& Objects.equals(this.lumpSumAmount, taxSettings.lumpSumAmount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(periodUnits, periodType, taxCode,lumpSumTaxCode,specialTaxRate,lumpSumAmount);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TaxSettings {\n");
		sb.append("    periodUnits: ").append(toIndentedString(periodUnits)).append("\n");
		sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
		sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
		sb.append("    lumpSumTaxCode: ").append(toIndentedString(lumpSumTaxCode)).append("\n");
		sb.append("    specialTaxRate: ").append(toIndentedString(specialTaxRate)).append("\n");
		sb.append("    lumpSumAmount: ").append(toIndentedString(lumpSumAmount)).append("\n");		
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
	 
}
