package biz.infocare.model.payroll;

import java.util.Objects;
import java.util.UUID;

import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.annotations.ApiModelProperty;

public class PayRun {

	@JsonProperty("payRunID")
	private UUID payRunID;

	@JsonProperty("payrollCalendarID")
	private UUID payRollCalendarID;

	@JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
	@JsonProperty("periodStartDate")
	private OffsetDateTime periodStartDate;

	@JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
	@JsonProperty("periodEndDate")
	private OffsetDateTime periodEndDate;

	@JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
	@JsonProperty("paymentDate")
	private OffsetDateTime paymentDate;

	@JsonProperty("totalCost")
	private Double totalCost;

	@JsonProperty("totalPay")
	private Double totalPay;

	public enum PayRunStatusEnum {
		DRAFT("Draft"),

		POSTED("Posted");

		private String value;

		PayRunStatusEnum(String value) {
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
		public static PayRunStatusEnum fromValue(String text) {
			for (PayRunStatusEnum b : PayRunStatusEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + text + "'");
		}
	}

	@JsonProperty("PayRunStatus")
	private PayRunStatusEnum payRunStatus;

	public enum PayRunTypeEnum {
		SCHEDULED("Scheduled"),

		UNSCHEDULED("Unscheduled"),

		EARLY_YEAR_UPDATE("EarlierYearUpdate");

		private String value;

		PayRunTypeEnum(String value) {
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
		public static PayRunTypeEnum fromValue(String text) {
			for (PayRunTypeEnum b : PayRunTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + text + "'");
		}
	}

	@JsonProperty("PayRunType")
	private PayRunTypeEnum payRunType;

	public enum CalendarTypeEnum {
		WEEKLY("Weekly"), FORTNIGHTLY("Fortnightly"), TWICE_MONTHLY("Twice Monthly"), MONTHLY("Monthly"),
		FOUR_WEEKLY("FourWeekly");

		private String value;

		CalendarTypeEnum(String value) {
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
		public static CalendarTypeEnum fromValue(String text) {
			for (CalendarTypeEnum b : CalendarTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + text + "'");
		}
	}

	@JsonProperty("CalendarType")
	private CalendarTypeEnum calendarType;

	@JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
	@JsonProperty("PostedDateTime")
	private OffsetDateTime postedDateTime;

	@ApiModelProperty(value = "The Xero identifier for an pay run calendar e.g. 297c2dc5-cc47-4afd-8ec8-74990b8761e9")
	public UUID getPayRunID() {
		return payRunID;
	}

	public void setPayRunID(UUID payRunID) {
		this.payRunID = payRunID;
	}

	@ApiModelProperty(value = "The Xero identifier for an payroll calendar e.g. 297c2dc5-cc47-4afd-8ec8-74990b8761e9")
	public UUID getPayRollCalendarID() {
		return payRollCalendarID;
	}

	public void setPayRollCalendarID(UUID payRollCalendarID) {
		this.payRollCalendarID = payRollCalendarID;
	}

	@ApiModelProperty(value = "")
	public OffsetDateTime getPeriodStartDate() {
		return periodStartDate;
	}

	public void setPeriodStartDate(OffsetDateTime periodStartDate) {
		this.periodStartDate = periodStartDate;
	}

	@ApiModelProperty(value = "")
	public OffsetDateTime getPeriodEndDate() {
		return periodEndDate;
	}

	public void setPeriodEndDate(OffsetDateTime periodEndDate) {
		this.periodEndDate = periodEndDate;
	}

	@ApiModelProperty(value = "")
	public OffsetDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(OffsetDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	@ApiModelProperty(value = "")
	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	@ApiModelProperty(value = "")
	public Double getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(Double totalPay) {
		this.totalPay = totalPay;
	}

	@ApiModelProperty(value = "")
	public PayRunStatusEnum getPayRunStatus() {
		return payRunStatus;
	}

	public void setPayRunStatus(PayRunStatusEnum payRunStatus) {
		this.payRunStatus = payRunStatus;
	}

	@ApiModelProperty(value = "")
	public PayRunTypeEnum getPayRunType() {
		return payRunType;
	}

	public void setPayRunType(PayRunTypeEnum payRunType) {
		this.payRunType = payRunType;
	}

	@ApiModelProperty(value = "")
	public CalendarTypeEnum getCalendarType() {
		return calendarType;
	}

	public void setCalendarType(CalendarTypeEnum calendarType) {
		this.calendarType = calendarType;
	}

	@ApiModelProperty(value = "")
	public OffsetDateTime getPostedDateTime() {
		return postedDateTime;
	}

	public void setPostedDateTime(OffsetDateTime postedDateTime) {
		this.postedDateTime = postedDateTime;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PayRun payRun = (PayRun) o;
		return Objects.equals(this.payRunID, payRun.payRunID)
				&& Objects.equals(this.payRollCalendarID, payRun.payRollCalendarID)
				&& Objects.equals(this.periodStartDate, payRun.periodStartDate)
				&& Objects.equals(this.periodEndDate, payRun.periodEndDate)
				&& Objects.equals(this.paymentDate, payRun.paymentDate)
				&& Objects.equals(this.totalCost, payRun.totalCost)
				&& Objects.equals(this.totalPay, payRun.totalPay)
				&& Objects.equals(this.payRunStatus, payRun.payRunStatus)
				&& Objects.equals(this.payRunType, payRun.payRunType)
				&& Objects.equals(this.calendarType, payRun.calendarType)
				&& Objects.equals(this.postedDateTime, payRun.postedDateTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(payRunID, payRollCalendarID, periodStartDate,periodEndDate,paymentDate,totalCost,
				totalPay,payRunStatus,payRunType,calendarType,postedDateTime);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Employment {\n");
		sb.append("    payRunID: ").append(toIndentedString(payRunID)).append("\n");
		sb.append("    payRollCalendarID: ").append(toIndentedString(payRollCalendarID)).append("\n");
		sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
		sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
		sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
		sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
		sb.append("    totalPay: ").append(toIndentedString(totalPay)).append("\n");
		sb.append("    payRunStatus: ").append(toIndentedString(payRunStatus)).append("\n");
		sb.append("    payRunType: ").append(toIndentedString(payRunType)).append("\n");
		sb.append("    calendarType: ").append(toIndentedString(calendarType)).append("\n");
		sb.append("    postedDateTime: ").append(toIndentedString(postedDateTime)).append("\n");
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
