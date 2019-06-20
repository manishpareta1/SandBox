package com.hibernate.Demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class BlockMarketSegmentId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="PROP_ID")
	private int propId;
	
	@Column(name="CORP_MRKT_SGMT")
	private String mktSgmt;

	public int getPropId() {
		return propId;
	}

	public void setPropId(int propId) {
		this.propId = propId;
	}

	public String getMktSgmt() {
		return mktSgmt;
	}

	public void setMktSgmt(String mktSgmt) {
		this.mktSgmt = mktSgmt;
	}

	public BlockMarketSegmentId() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mktSgmt == null) ? 0 : mktSgmt.hashCode());
		result = prime * result + propId;
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
		BlockMarketSegmentId other = (BlockMarketSegmentId) obj;
		if (mktSgmt == null) {
			if (other.mktSgmt != null)
				return false;
		} else if (!mktSgmt.equals(other.mktSgmt))
			return false;
		if (propId != other.propId)
			return false;
		return true;
	}

	public BlockMarketSegmentId(int propId, String mktSgmt) {
		super();
		this.propId = propId;
		this.mktSgmt = mktSgmt;
	}
	
		
	

}
