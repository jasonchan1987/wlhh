package com.bootdo.su.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 物料表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
public class MaterielDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键，自增物料序号
	private Long maid;
	//合同序号
	private Long conid;
	//物料名称
	private String name;
	//对应数据字典中的物料类别数据字典物料类别序号
	private Long dimaterieltypeid;
	//物料数量
	private Integer num;
	//物料备注
	private String mdesc;
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
	 * 设置：主键，自增物料序号
	 */
	public void setMaid(Long maid) {
		this.maid = maid;
	}
	/**
	 * 获取：主键，自增物料序号
	 */
	public Long getMaid() {
		return maid;
	}
	/**
	 * 设置：合同序号
	 */
	public void setConid(Long conid) {
		this.conid = conid;
	}
	/**
	 * 获取：合同序号
	 */
	public Long getConid() {
		return conid;
	}
	/**
	 * 设置：物料名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：物料名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：对应数据字典中的物料类别数据字典物料类别序号
	 */
	public void setDimaterieltypeid(Long dimaterieltypeid) {
		this.dimaterieltypeid = dimaterieltypeid;
	}
	/**
	 * 获取：对应数据字典中的物料类别数据字典物料类别序号
	 */
	public Long getDimaterieltypeid() {
		return dimaterieltypeid;
	}
	/**
	 * 设置：物料数量
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	/**
	 * 获取：物料数量
	 */
	public Integer getNum() {
		return num;
	}
	/**
	 * 设置：物料备注
	 */
	public void setMdesc(String mdesc) {
		this.mdesc = mdesc;
	}
	/**
	 * 获取：物料备注
	 */
	public String getMdesc() {
		return mdesc;
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
