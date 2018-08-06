package com.bootdo.su.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 合同表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:34
 */
public class ContractDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键，自增合同序号
	private Long conid;
	//供应商系统序号
	private Long srid;
	//主题
	private String topic;
	//合同号
	private String connum;
	//对应数据字典中的签订方式数据字典签订方式
	private Long disignmid;
	//金额
	private String amount;
	//手输付款方式
	private String paymethod;
	//附件
	private String attachurl;
	//甲方
	private String fpart;
	//甲方负责人
	private String fpartyhead;
	//乙方
	private String spart;
	//乙方负责人
	private String spartyhead;
	//签订时间
	private Date signdate;
	//默认 0：履行中 1：完结 状态
	private String state;
	//创建者
	private Long createBy;
	//创建机构
	private Long createDeptid;
	//创建时间
	private Date createDate;
	//更新者
	private Long updateBy;
	//更新机构
	private Long updateDeptid;
	//更新时间
	private Date updateDate;
	//备注信息
	private String remarks;
	//删除标记
	private String delFlag;

	/**
	 * 设置：主键，自增合同序号
	 */
	public void setConid(Long conid) {
		this.conid = conid;
	}
	/**
	 * 获取：主键，自增合同序号
	 */
	public Long getConid() {
		return conid;
	}
	/**
	 * 设置：供应商系统序号
	 */
	public void setSrid(Long srid) {
		this.srid = srid;
	}
	/**
	 * 获取：供应商系统序号
	 */
	public Long getSrid() {
		return srid;
	}
	/**
	 * 设置：主题
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}
	/**
	 * 获取：主题
	 */
	public String getTopic() {
		return topic;
	}
	/**
	 * 设置：合同号
	 */
	public void setConnum(String connum) {
		this.connum = connum;
	}
	/**
	 * 获取：合同号
	 */
	public String getConnum() {
		return connum;
	}
	/**
	 * 设置：对应数据字典中的签订方式数据字典签订方式
	 */
	public void setDisignmid(Long disignmid) {
		this.disignmid = disignmid;
	}
	/**
	 * 获取：对应数据字典中的签订方式数据字典签订方式
	 */
	public Long getDisignmid() {
		return disignmid;
	}
	/**
	 * 设置：金额
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * 获取：金额
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * 设置：手输付款方式
	 */
	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}
	/**
	 * 获取：手输付款方式
	 */
	public String getPaymethod() {
		return paymethod;
	}
	/**
	 * 设置：附件
	 */
	public void setAttachurl(String attachurl) {
		this.attachurl = attachurl;
	}
	/**
	 * 获取：附件
	 */
	public String getAttachurl() {
		return attachurl;
	}
	/**
	 * 设置：甲方
	 */
	public void setFpart(String fpart) {
		this.fpart = fpart;
	}
	/**
	 * 获取：甲方
	 */
	public String getFpart() {
		return fpart;
	}
	/**
	 * 设置：甲方负责人
	 */
	public void setFpartyhead(String fpartyhead) {
		this.fpartyhead = fpartyhead;
	}
	/**
	 * 获取：甲方负责人
	 */
	public String getFpartyhead() {
		return fpartyhead;
	}
	/**
	 * 设置：乙方
	 */
	public void setSpart(String spart) {
		this.spart = spart;
	}
	/**
	 * 获取：乙方
	 */
	public String getSpart() {
		return spart;
	}
	/**
	 * 设置：乙方负责人
	 */
	public void setSpartyhead(String spartyhead) {
		this.spartyhead = spartyhead;
	}
	/**
	 * 获取：乙方负责人
	 */
	public String getSpartyhead() {
		return spartyhead;
	}
	/**
	 * 设置：签订时间
	 */
	public void setSigndate(Date signdate) {
		this.signdate = signdate;
	}
	/**
	 * 获取：签订时间
	 */
	public Date getSigndate() {
		return signdate;
	}
	/**
	 * 设置：默认 0：履行中 1：完结 状态
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * 获取：默认 0：履行中 1：完结 状态
	 */
	public String getState() {
		return state;
	}
	/**
	 * 设置：创建者
	 */
	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}
	/**
	 * 获取：创建者
	 */
	public Long getCreateBy() {
		return createBy;
	}
	/**
	 * 设置：创建机构
	 */
	public void setCreateDeptid(Long createDeptid) {
		this.createDeptid = createDeptid;
	}
	/**
	 * 获取：创建机构
	 */
	public Long getCreateDeptid() {
		return createDeptid;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * 设置：更新者
	 */
	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}
	/**
	 * 获取：更新者
	 */
	public Long getUpdateBy() {
		return updateBy;
	}
	/**
	 * 设置：更新机构
	 */
	public void setUpdateDeptid(Long updateDeptid) {
		this.updateDeptid = updateDeptid;
	}
	/**
	 * 获取：更新机构
	 */
	public Long getUpdateDeptid() {
		return updateDeptid;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdateDate() {
		return updateDate;
	}
	/**
	 * 设置：备注信息
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * 获取：备注信息
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * 设置：删除标记
	 */
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	/**
	 * 获取：删除标记
	 */
	public String getDelFlag() {
		return delFlag;
	}
}
