package com.bootdo.su.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 供应商评分表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
public class EvalscoreDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//供应商评价序号 主键，自增
	private Long evid;
	//供应商系统序号
	private Long srid;
	//主题
	private String topic;
	//对应数据字典中的评价类别数据字典评价类别序号
	private Long ditypeid;
	//对应数据字典中的评价周期 数据字典评价周期序号
	private Long diperiodid;
	//合同表的主键 合同序号
	private Long conid;
	//供应商评价附件
	private String evdescurl;
	//打分
	private Double score;
	//评语
	private String evdesc;
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
	 * 设置：供应商评价序号 主键，自增
	 */
	public void setEvid(Long evid) {
		this.evid = evid;
	}
	/**
	 * 获取：供应商评价序号 主键，自增
	 */
	public Long getEvid() {
		return evid;
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
	 * 设置：对应数据字典中的评价类别数据字典评价类别序号
	 */
	public void setDitypeid(Long ditypeid) {
		this.ditypeid = ditypeid;
	}
	/**
	 * 获取：对应数据字典中的评价类别数据字典评价类别序号
	 */
	public Long getDitypeid() {
		return ditypeid;
	}
	/**
	 * 设置：对应数据字典中的评价周期 数据字典评价周期序号
	 */
	public void setDiperiodid(Long diperiodid) {
		this.diperiodid = diperiodid;
	}
	/**
	 * 获取：对应数据字典中的评价周期 数据字典评价周期序号
	 */
	public Long getDiperiodid() {
		return diperiodid;
	}
	/**
	 * 设置：合同表的主键 合同序号
	 */
	public void setConid(Long conid) {
		this.conid = conid;
	}
	/**
	 * 获取：合同表的主键 合同序号
	 */
	public Long getConid() {
		return conid;
	}
	/**
	 * 设置：供应商评价附件
	 */
	public void setEvdescurl(String evdescurl) {
		this.evdescurl = evdescurl;
	}
	/**
	 * 获取：供应商评价附件
	 */
	public String getEvdescurl() {
		return evdescurl;
	}
	/**
	 * 设置：打分
	 */
	public void setScore(Double score) {
		this.score = score;
	}
	/**
	 * 获取：打分
	 */
	public Double getScore() {
		return score;
	}
	/**
	 * 设置：评语
	 */
	public void setEvdesc(String evdesc) {
		this.evdesc = evdesc;
	}
	/**
	 * 获取：评语
	 */
	public String getEvdesc() {
		return evdesc;
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
