package com.hibernate.Demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="RATE_PLAN_DETAIL")
public class RatePlanVo {
	
	@Id
	@Column(name="RP_ID")
	private String ratePlanId;
	
	@Column(name="RP_NAME")
	private String ratePlanName;
	
	@Column(name="PROP_ID")
	private int propId;
	
	@NotFound(action=NotFoundAction.IGNORE)
	@ManyToMany(mappedBy="ratePlanVos", cascade=CascadeType.REFRESH)
	private List<GroupBlockVo> groupBlkVo = new ArrayList<GroupBlockVo>();

	public RatePlanVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getRatePlanId() {
		return ratePlanId;
	}

	public void setRatePlanId(String ratePlanId) {
		this.ratePlanId = ratePlanId;
	}

	public String getRatePlanName() {
		return ratePlanName;
	}

	public void setRatePlanName(String ratePlanName) {
		this.ratePlanName = ratePlanName;
	}

	public int getPropId() {
		return propId;
	}

	public void setPropId(int propId) {
		this.propId = propId;
	}

	public List<GroupBlockVo> getGroupBlkVo() {
		return groupBlkVo;
	}

	public void setGroupBlkVo(List<GroupBlockVo> groupBlkVo) {
		this.groupBlkVo = groupBlkVo;
	}

	@Override       
	public String toString() {
		return "RatePlanVo [ratePlanId=" + ratePlanId + ", ratePlanName=" + ratePlanName + ", propId=" + propId
				+ ", groupBlkVo=" + groupBlkVo + "]";
	}

	public RatePlanVo(String ratePlanId, String ratePlanName, int propId) {
		super();
		this.ratePlanId = ratePlanId;
		this.ratePlanName = ratePlanName;
		this.propId = propId;
	}
	
	
	
	

}
