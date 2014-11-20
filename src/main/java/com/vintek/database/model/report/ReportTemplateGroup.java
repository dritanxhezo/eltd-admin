package com.vintek.database.model.report;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ReportTemplateGroup database table.
 * 
 */
@Entity
public class ReportTemplateGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="Description")
	private String description;

	@Column(name="Name")
	private String name;

	public ReportTemplateGroup() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}