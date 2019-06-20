package com.hibernate.Demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="GROUP_BLK_INV")
public class GroupBlkInvVo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="PRODCT_ID")
	private int prdctId;
	
	@ManyToOne
	@JoinColumn(name="BLK_ID")
	private GroupBlockVo blockVo;
	
	@Column(name="BASE_QTY")
	private int baseQty;
	
	@Column(name="SOLD_QTY")
	private int soldQty;

	public int getPrdctId() {
		return prdctId;
	}

	public void setPrdctId(int prdctId) {
		this.prdctId = prdctId;
	}

	public GroupBlockVo getBlockVo() {
		return blockVo;
	}

	public void setBlockVo(GroupBlockVo blockVo) {
		this.blockVo = blockVo;
	}

	public int getBaseQty() {
		return baseQty;
	}

	public void setBaseQty(int baseQty) {
		this.baseQty = baseQty;
	}

	public int getSoldQty() {
		return soldQty;
	}

	public void setSoldQty(int soldQty) {
		this.soldQty = soldQty;
	}

	public GroupBlkInvVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GroupBlkInvVo [prdctId=" + prdctId + ", baseQty=" + baseQty + ", soldQty=" + soldQty + "]";
	}

	public GroupBlkInvVo(int baseQty, int soldQty) {
		super();
		this.baseQty = baseQty;
		this.soldQty = soldQty;
	}
	
	

}
