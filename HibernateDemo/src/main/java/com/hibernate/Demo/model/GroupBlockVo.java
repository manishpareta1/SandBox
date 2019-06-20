package com.hibernate.Demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="GROUP_BLK_DETAIL")
public class GroupBlockVo {
	
	@Id
	@Column(name="BLK_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int blkId;
	
	@Column(name="CRS_ID")
	private int crsId;
	
	@Column(name="IPS_ID")
	private int ipsId;
	
	@Column(name="ABBR_CD")
	private String abbrCode;
	
	@Column(name="BLOCK_NAME")
	private String blockName;
	
	@NotFound(action=NotFoundAction.IGNORE)
	@OneToOne(mappedBy="blockVo",cascade=CascadeType.ALL)
	private AddressVo addressVo = new AddressVo();
	
	@NotFound(action=NotFoundAction.IGNORE)
	@OneToMany(mappedBy="blockVo", cascade=CascadeType.ALL)
	private List<GroupBlkInvVo> groupBlkInvVo = new ArrayList<GroupBlkInvVo>();
	
	@NotFound(action=NotFoundAction.IGNORE)
	@ManyToMany
	@JoinTable(name="GROUP_BLK_RP", joinColumns=@JoinColumn(name="GROUP_BLK_ID"),
			inverseJoinColumns=@JoinColumn(name="RATE_PLAN_ID")
			)
	private List<RatePlanVo> ratePlanVos = new ArrayList<RatePlanVo>();
	
	@NotFound(action=NotFoundAction.IGNORE)
	@ManyToOne
	@JoinColumns({
        @JoinColumn(
            name = "PROP_ID",
            referencedColumnName = "PROP_ID"),
        @JoinColumn(
            name = "CORP_MRKT_SGMT",
            referencedColumnName = "CORP_MRKT_SGMT")
    })
	private BlockMktSgmtVo mktSgmtVo;

	public int getBlkId() {
		return blkId;
	}

	public void setBlkId(int blkId) {
		this.blkId = blkId;
	}

	public int getCrsId() {
		return crsId;
	}

	public void setCrsId(int crsId) {
		this.crsId = crsId;
	}

	public int getIpsId() {
		return ipsId;
	}

	public void setIpsId(int ipsId) {
		this.ipsId = ipsId;
	}

	public String getAbbrCode() {
		return abbrCode;
	}

	public void setAbbrCode(String abbrCode) {
		this.abbrCode = abbrCode;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public AddressVo getAddressVo() {
		return addressVo;
	}

	public void setAddressVo(AddressVo addressVo) {
		this.addressVo = addressVo;
	}

	public List<GroupBlkInvVo> getGroupBlkInvVo() {
		return groupBlkInvVo;
	}

	public void setGroupBlkInvVo(List<GroupBlkInvVo> groupBlkInvVo) {
		this.groupBlkInvVo = groupBlkInvVo;
	}

	public List<RatePlanVo> getRatePlanVos() {
		return ratePlanVos;
	}

	public void setRatePlanVos(List<RatePlanVo> ratePlanVos) {
		this.ratePlanVos = ratePlanVos;
	}

	public GroupBlockVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public BlockMktSgmtVo getMktSgmtVo() {
		return mktSgmtVo;
	}

	public void setMktSgmtVo(BlockMktSgmtVo mktSgmtVo) {
		this.mktSgmtVo = mktSgmtVo;
	}

	@Override
	public String toString() {
		return "GroupBlockVo [blkId=" + blkId + ", crsId=" + crsId + ", ipsId=" + ipsId
				+ ", abbrCode=" + abbrCode + ", blockName=" + blockName + ", addressVo="
				+ addressVo + ", groupBlkInvVo=" + groupBlkInvVo + ", ratePlanVos=" + ratePlanVos + "]";
	}

	public GroupBlockVo(int crsId, int ipsId, String abbrCode, String blockName, AddressVo addressVo) {
		super();
		this.crsId = crsId;
		this.ipsId = ipsId;
		this.abbrCode = abbrCode;
		this.blockName = blockName;
		this.addressVo = addressVo;
	}
	
	

}
