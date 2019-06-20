package com.hibernate.Demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hibernate.Demo.dao.BaseDAOImpl;
import com.hibernate.Demo.model.AddressVo;
import com.hibernate.Demo.model.BlockMarketSegmentId;
import com.hibernate.Demo.model.BlockMktSgmtVo;
import com.hibernate.Demo.model.GroupBlkInvVo;
import com.hibernate.Demo.model.GroupBlockVo;
import com.hibernate.Demo.model.RatePlanVo;

public class GroupBlockTester {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*select * from springhibernate_db.GROUP_BLK_DETAIL;
		select * from springhibernate_db.GB_ADDRESS;
		select * from springhibernate_db.RATE_PLAN_DETAIL;
		select * from springhibernate_db.GROUP_BLK_INV;
		select * from springhibernate_db.GROUP_BLK_RP;*/
		List<GroupBlockVo> groupBlockVos = new ArrayList<GroupBlockVo>();
		AddressVo addressVo1 = new AddressVo("#Sri Tirumala Sarovar-1", "NH44", "Bangalore", "Karnataka", "India", 560068);
		AddressVo addressVo2 = new AddressVo("#Sri Tirumala Sarovar-2", "NH44", "Bangalore", "Karnataka", "India", 560068);
		AddressVo addressVo3 = new AddressVo("#Sri Tirumala Sarovar-3", "NH44", "Bangalore", "Karnataka", "India", 560068);
		
		GroupBlkInvVo blkInvVo1 = new GroupBlkInvVo(10, 7);
		GroupBlkInvVo blkInvVo2 = new GroupBlkInvVo(9, 7);
		GroupBlkInvVo blkInvVo3 = new GroupBlkInvVo(8, 7);
		GroupBlkInvVo blkInvVo4 = new GroupBlkInvVo(7, 7);
		
		
		RatePlanVo ratePlanVo1 = new RatePlanVo("RPID1", "RatePlan Name#1", 1047);
		RatePlanVo ratePlanVo2 = new RatePlanVo("RPID2", "RatePlan Name#2", 1089);
		RatePlanVo ratePlanVo3 = new RatePlanVo("RPID3", "RatePlan Name#3", 1000);
		RatePlanVo ratePlanVo4 = new RatePlanVo("RPID4", "RatePlan Name#4", 1522);
		
		GroupBlockVo groupBlockVo1 = new GroupBlockVo(101, 1001, "GB#1", "First Group Block", addressVo1);
		GroupBlockVo groupBlockVo2 = new GroupBlockVo(102, 1002, "GB#2", "Second Group Block", addressVo2);
		GroupBlockVo groupBlockVo3 = new GroupBlockVo(103, 1003, "GB#3", "Third Group Block", addressVo3);
		
		BlockMarketSegmentId mktSgmtId1 = new BlockMarketSegmentId(1047, "DCTN");
		BlockMktSgmtVo blockMktSgmtVo1 = new BlockMktSgmtVo(mktSgmtId1, "DCTN - desc",new Date(), new Date());
		
		BlockMarketSegmentId mktSgmtId2 = new BlockMarketSegmentId(1000, "TNCN");
		BlockMktSgmtVo blockMktSgmtVo2 = new BlockMktSgmtVo(mktSgmtId2, "TNCN - desc",new Date(), new Date());
		
		groupBlockVo1.getRatePlanVos().add(ratePlanVo4);
		groupBlockVo1.getRatePlanVos().add(ratePlanVo3);
		
		groupBlockVo2.getRatePlanVos().add(ratePlanVo4);
		groupBlockVo2.getRatePlanVos().add(ratePlanVo1);
		groupBlockVo2.getRatePlanVos().add(ratePlanVo2);
		
		groupBlockVo3.getRatePlanVos().add(ratePlanVo1);
		groupBlockVo3.getRatePlanVos().add(ratePlanVo3);
		
		
		groupBlockVo1.getGroupBlkInvVo().add(blkInvVo1);
		groupBlockVo1.getGroupBlkInvVo().add(blkInvVo2);
		groupBlockVo2.getGroupBlkInvVo().add(blkInvVo3);
		groupBlockVo3.getGroupBlkInvVo().add(blkInvVo4);
		
		addressVo1.setBlockVo(groupBlockVo1);
		addressVo2.setBlockVo(groupBlockVo2);
		addressVo3.setBlockVo(groupBlockVo3);
		
		blkInvVo1.setBlockVo(groupBlockVo1);
		blkInvVo2.setBlockVo(groupBlockVo1);
		blkInvVo3.setBlockVo(groupBlockVo2);
		blkInvVo4.setBlockVo(groupBlockVo3);
		
		ratePlanVo3.getGroupBlkVo().add(groupBlockVo1);
		ratePlanVo3.getGroupBlkVo().add(groupBlockVo3);
		
		ratePlanVo4.getGroupBlkVo().add(groupBlockVo1);
		ratePlanVo4.getGroupBlkVo().add(groupBlockVo2);
		
		ratePlanVo2.getGroupBlkVo().add(groupBlockVo2);
		ratePlanVo1.getGroupBlkVo().add(groupBlockVo2);
		
		blockMktSgmtVo1.getBlockVo().add(groupBlockVo1);
		blockMktSgmtVo1.getBlockVo().add(groupBlockVo2);
		blockMktSgmtVo2.getBlockVo().add(groupBlockVo3);
		
		groupBlockVo1.setMktSgmtVo(blockMktSgmtVo1);
		groupBlockVo2.setMktSgmtVo(blockMktSgmtVo1);
		groupBlockVo3.setMktSgmtVo(blockMktSgmtVo2);
		
		
		
		
		BaseDAOImpl<GroupBlockVo> baseDAOImpl = new BaseDAOImpl<GroupBlockVo>();
		baseDAOImpl.save(groupBlockVo1);
		baseDAOImpl.save(groupBlockVo2);
		baseDAOImpl.save(groupBlockVo3);
		BaseDAOImpl<AddressVo> baseAddDAOImpl = new BaseDAOImpl<AddressVo>();
		baseAddDAOImpl.save(addressVo1);
		baseAddDAOImpl.save(addressVo2);
		baseAddDAOImpl.save(addressVo3);
		BaseDAOImpl<GroupBlkInvVo> baseInvDAOImpl = new BaseDAOImpl<GroupBlkInvVo>();
		baseInvDAOImpl.save(blkInvVo1);
		baseInvDAOImpl.save(blkInvVo2);
		baseInvDAOImpl.save(blkInvVo3);
		baseInvDAOImpl.save(blkInvVo4);
		BaseDAOImpl<RatePlanVo>  baseRpDAOImpl= new BaseDAOImpl<RatePlanVo>();
		baseRpDAOImpl.save(ratePlanVo1);
		baseRpDAOImpl.save(ratePlanVo2);
		baseRpDAOImpl.save(ratePlanVo3);
		baseRpDAOImpl.save(ratePlanVo4);
		BaseDAOImpl<BlockMktSgmtVo>  basemktSgmtDAOImpl= new BaseDAOImpl<BlockMktSgmtVo>();
		basemktSgmtDAOImpl.save(blockMktSgmtVo1);
		basemktSgmtDAOImpl.save(blockMktSgmtVo2);
		
		baseDAOImpl.delete(groupBlockVo3);
		
	}
	
	

}
