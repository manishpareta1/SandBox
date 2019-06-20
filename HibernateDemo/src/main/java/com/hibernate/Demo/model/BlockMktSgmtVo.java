package com.hibernate.Demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.hibernate.Demo.model.ReviewType.REVIEWTYPE;

@Entity
@Table(name="BLOCK_MKT_SGMT")
public class BlockMktSgmtVo {
	
	@EmbeddedId
	private BlockMarketSegmentId mktSgmtId;
	
	@Column(name="DESCRIPTION")
	private String desc;
	
	/*@Column(name="REVIER_METHOD")
	private ReviewType.REVIEWTYPE reviewType;*/
	
	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;
	
	@NotFound(action=NotFoundAction.IGNORE)
	@OneToMany(mappedBy="mktSgmtVo", cascade=CascadeType.DETACH)
	private List<GroupBlockVo> blockVo = new ArrayList<GroupBlockVo>();

	public BlockMarketSegmentId getMktSgmtId() {
		return mktSgmtId;
	}

	public void setMktSgmtId(BlockMarketSegmentId mktSgmtId) {
		this.mktSgmtId = mktSgmtId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	/*public ReviewType.REVIEWTYPE getReviewType() {
		return reviewType;
	}

	public void setReviewType(ReviewType.REVIEWTYPE reviewType) {
		this.reviewType = reviewType;
	}*/

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	
	public List<GroupBlockVo> getBlockVo() {
		return blockVo;
	}

	public void setBlockVo(List<GroupBlockVo> blockVo) {
		this.blockVo = blockVo;
	}

	public BlockMktSgmtVo() {
		super();
	}

	public BlockMktSgmtVo(BlockMarketSegmentId mktSgmtId, String desc, Date createDate,
			Date updateDate) {
		super();
		this.mktSgmtId = mktSgmtId;
		this.desc = desc;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	

}

class ReviewType{
	enum REVIEWTYPE{
		AUTO,REVIEW,NONMIG
	}
}
