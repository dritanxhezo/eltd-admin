package com.vintek.database.model.user;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VintekGroup")
public class Group implements Serializable {
	private static final long serialVersionUID = -1409915853423762455L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="BOS", columnDefinition="bit")
	private boolean bos;

	@Column(name="ChallengeQuestions", columnDefinition="bit")
	private boolean challengeQuestions;

	@Column(name="CreatedBy")
	private String createdBy;

	@Column(name="CreatedOn")
	private Timestamp createdOn;

	@Column(name="Description")
	private String description;

	@Column(name="DisableForInactivity", columnDefinition="bit")
	private boolean disableForInactivity;

	@Column(name="Enabled", columnDefinition="bit")
	private boolean enabled;

	@Column(name="EncKey")
	private String encKey;

	@Column(name="Import", columnDefinition="bit")
	private boolean import_;

	@Column(name="Internal", columnDefinition="bit")
	private boolean internal;

	@Column(name="Name")
	private String name;

	@Column(name="SSOEnabled", columnDefinition="bit")
	private boolean SSOEnabled;

	@Column(name="TrackPasswords", columnDefinition="bit")
	private boolean trackPasswords;

	@Column(name="VINtek", columnDefinition="bit")
	private boolean VINtek;

	public Group() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getBos() {
		return this.bos;
	}

	public void setBos(boolean bos) {
		this.bos = bos;
	}

	public boolean getChallengeQuestions() {
		return this.challengeQuestions;
	}

	public void setChallengeQuestions(boolean challengeQuestions) {
		this.challengeQuestions = challengeQuestions;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getDisableForInactivity() {
		return this.disableForInactivity;
	}

	public void setDisableForInactivity(boolean disableForInactivity) {
		this.disableForInactivity = disableForInactivity;
	}

	public boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getEncKey() {
		return this.encKey;
	}

	public void setEncKey(String encKey) {
		this.encKey = encKey;
	}

	public boolean getImport_() {
		return this.import_;
	}

	public void setImport_(boolean import_) {
		this.import_ = import_;
	}

	public boolean getInternal() {
		return this.internal;
	}

	public void setInternal(boolean internal) {
		this.internal = internal;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getSSOEnabled() {
		return this.SSOEnabled;
	}

	public void setSSOEnabled(boolean SSOEnabled) {
		this.SSOEnabled = SSOEnabled;
	}

	public boolean getTrackPasswords() {
		return this.trackPasswords;
	}

	public void setTrackPasswords(boolean trackPasswords) {
		this.trackPasswords = trackPasswords;
	}

	public boolean getVINtek() {
		return this.VINtek;
	}

	public void setVINtek(boolean VINtek) {
		this.VINtek = VINtek;
	}

}