package com.hibernate.Demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class GroupBlockInvId implements Serializable {
	
	@Column(name="PRODCT_ID")
	private int prdctId;
	
	@Id
	private int blkId;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + blkId;
		result = prime * result + prdctId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroupBlockInvId other = (GroupBlockInvId) obj;
		if (blkId != other.blkId)
			return false;
		if (prdctId != other.prdctId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GroupBlockInvId [prdctId=" + prdctId + ", blkId=" + blkId + "]";
	}

	public int getPrdctId() {
		return prdctId;
	}

	public void setPrdctId(int prdctId) {
		this.prdctId = prdctId;
	}

	public int getBlkId() {
		return blkId;
	}

	public void setBlkId(int blkId) {
		this.blkId = blkId;
	}
	
	

}
