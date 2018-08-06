package com.bootdo.su.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 资质表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:34
 */
public class EnterqualiDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//资质表,主键，自增,资质表系统序号
	private Long eqid;
	//可外联供应商表,供应商系统序号
	private Long srid;
	//zzjg:组织机构、logo:公司LOGO、swdj:税务登记,类别
	private String type;
	//存放相关资质的图片,图片地址
	private String imgurl;
	//默认为0,排序
	private Integer sort;
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
	 * 设置：资质表,主键，自增,资质表系统序号
	 */
	public void setEqid(Long eqid) {
		this.eqid = eqid;
	}
	/**
	 * 获取：资质表,主键，自增,资质表系统序号
	 */
	public Long getEqid() {
		return eqid;
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
	 * 设置：zzjg:组织机构、logo:公司LOGO、swdj:税务登记,类别
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：zzjg:组织机构、logo:公司LOGO、swdj:税务登记,类别
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：存放相关资质的图片,图片地址
	 */
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	/**
	 * 获取：存放相关资质的图片,图片地址
	 */
	public String getImgurl() {
		return imgurl;
	}
	/**
	 * 设置：默认为0,排序
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * 获取：默认为0,排序
	 */
	public Integer getSort() {
		return sort;
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
