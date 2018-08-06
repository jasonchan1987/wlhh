package com.bootdo.su.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 供应商状态变化历史记录表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
public class StatehisDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//供应商状态变化历史记录表，主键，自增,供应商状态变化序号
	private Long shid;
	//可外联供应商表,供应商系统序号
	private Long srid;
	//状态，默认0：进入  1：退出
	private String state;
	//原因
	private String reason;
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
	 * 设置：供应商状态变化历史记录表，主键，自增,供应商状态变化序号
	 */
	public void setShid(Long shid) {
		this.shid = shid;
	}
	/**
	 * 获取：供应商状态变化历史记录表，主键，自增,供应商状态变化序号
	 */
	public Long getShid() {
		return shid;
	}
	/**
	 * 设置：可外联供应商表,供应商系统序号
	 */
	public void setSrid(Long srid) {
		this.srid = srid;
	}
	/**
	 * 获取：可外联供应商表,供应商系统序号
	 */
	public Long getSrid() {
		return srid;
	}
	/**
	 * 设置：状态，默认0：进入  1：退出
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * 获取：状态，默认0：进入  1：退出
	 */
	public String getState() {
		return state;
	}
	/**
	 * 设置：原因
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * 获取：原因
	 */
	public String getReason() {
		return reason;
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
