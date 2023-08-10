package com.example.demo.exception;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SkillNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String message;
	private int statusCode;
	private long errorReportringTime;
	public SkillNotFoundException(String message) {
		super();
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public long getErrorReportringTime() {
		return errorReportringTime;
	}
	public void setErrorReportringTime(long errorReportringTime) {
		this.errorReportringTime = errorReportringTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
