package javaknowledge.annotation;

public class ExcelFieldAliasBean {

	private String  excelField;
	
	private String orderNum;
	
	private boolean mandatory;

	
	public ExcelFieldAliasBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public ExcelFieldAliasBean(String excelField, String orderNum, boolean mandatory) {
		super();
		this.excelField = excelField;
		this.orderNum = orderNum;
		this.mandatory = mandatory;
	}



	public String getExcelField() {
		return excelField;
	}

	public void setExcelField(String excelField) {
		this.excelField = excelField;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public boolean isMandatory() {
		return mandatory;
	}

	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}
	
	
}
