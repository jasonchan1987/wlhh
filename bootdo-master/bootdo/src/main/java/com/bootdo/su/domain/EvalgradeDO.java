package com.bootdo.su.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 供应商等级表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
public class EvalgradeDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//供应商等级序号 主键，自增
	private Long evgid;
	//供应商系统序号
	private Long srid;
	//等级详情 模板 1、产品/服务重要性  2、信息资产安全  3、使用数量/应用范围
	private String gradedesc;
	//数据字典供应商等级序号 对应数据字典中的供应商等级
	private Long dievgradeid;
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
	 * 设置：供应商等级序号 主键，自增
	 */
	public void setEvgid(Long evgid) {
		this.evgid = evgid;
	}
	/**
	 * 获取：供应商等级序号 主键，自增
	 */
	public Long getEvgid() {
		return evgid;
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
	 * 设置：等级详情 模板 1、产品/服务重要性
2、信息资产安全
3、使用数量/应用范围
	 */
	public void setGradedesc(String gradedesc) {
		this.gradedesc = gradedesc;
	}
	/**
	 * 获取：等级详情 模板 1、产品/服务重要性
2、信息资产安全
3、使用数量/应用范围
	 */
	public String getGradedesc() {
		return gradedesc;
	}
	/**
	 * 设置：数据字典供应商等级序号 对应数据字典中的供应商等级
	 */
	public void setDievgradeid(Long dievgradeid) {
		this.dievgradeid = dievgradeid;
	}
	/**
	 * 获取：数据字典供应商等级序号 对应数据字典中的供应商等级
	 */
	public Long getDievgradeid() {
		return dievgradeid;
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
