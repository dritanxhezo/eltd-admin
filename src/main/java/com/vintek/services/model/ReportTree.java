package com.vintek.services.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ReportTree implements Serializable {
	private static final long serialVersionUID = -7974875065774593015L;
	
	private int id;
	private String label;
	
	private List<ReportTree> children;

	public ReportTree(int id, String label) {
		super();
		this.id = id;
		this.label = label;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<ReportTree> getChildren() {
		if (children==null) children = new ArrayList<ReportTree>();
		return children;
	}

	public void setChildren(List<ReportTree> children) {
		this.children = children;
	}

}
