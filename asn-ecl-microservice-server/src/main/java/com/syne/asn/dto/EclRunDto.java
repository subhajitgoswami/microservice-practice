package com.syne.asn.dto;

import java.io.Serializable;
import java.util.Date;

public class EclRunDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer runId;
	private String description;
	private Integer quantModelID;
	private Integer regulationId;
	private Integer id;
	private String idType;
	private Double ecl;
	private Double ecl12Month;
	private Double eclLongTerm;
	private Date fromDate;
	private Date toDate;

	public Integer getRunId() {
		return runId;
	}

	public void setRunId(Integer runId) {
		this.runId = runId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantModelID() {
		return quantModelID;
	}

	public void setQuantModelID(Integer quantModelID) {
		this.quantModelID = quantModelID;
	}

	public Integer getRegulationId() {
		return regulationId;
	}

	public void setRegulationId(Integer regulationId) {
		this.regulationId = regulationId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public Double getEcl() {
		return ecl;
	}

	public void setEcl(Double ecl) {
		this.ecl = ecl;
	}

	public Double getEcl12Month() {
		return ecl12Month;
	}

	public void setEcl12Month(Double ecl12Month) {
		this.ecl12Month = ecl12Month;
	}

	public Double getEclLongTerm() {
		return eclLongTerm;
	}

	public void setEclLongTerm(Double eclLongTerm) {
		this.eclLongTerm = eclLongTerm;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
}