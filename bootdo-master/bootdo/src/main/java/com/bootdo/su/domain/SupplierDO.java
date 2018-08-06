package com.bootdo.su.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 供应商表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
public class SupplierDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//供应商表, 供应商系统序号，主键，自增
	private Long srid;
	//组织机构代码，唯一
	private String orgno;
	//企业名称
	private String name;
	//企业介绍
	private String desc;
	//企业电话
	private String phone;
	//公司所在地
	private String addr;
	//企业简称
	private String samplename;
	//企业性质代码 对应数据字典中的企业性质代码
	private Long dipropertyid;
	//企业邮箱
	private String email;
	//企业传真
	private String fax;
	//网站地址
	private String homepage;
	//主营
	private String majorbusiness;
	//员工人数
	private Integer peoplenum;
	//法人代表
	private String employ;
	//公司曾用名
	private String oldname;
	//邮政编码
	private String post;
	//税号
	private String taxnum;
	//注册资本
	private String capital;
	//开户银行
	private String bankname;
	//银行开户名
	private String bankdept;
	//开户银行帐号
	private String accountno;
	//管理体系认证
	private String mcs;
	//企业成立日期
	private String establishdate;
	//状态
	private String state;
	//黑名单序号
	private Long blid;
	//数据字典供应商等级序号
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
	 * 设置：供应商表, 供应商系统序号，主键，自增
	 */
	public void setSrid(Long srid) {
		this.srid = srid;
	}
	/**
	 * 获取：供应商表, 供应商系统序号，主键，自增
	 */
	public Long getSrid() {
		return srid;
	}
	/**
	 * 设置：组织机构代码，唯一
	 */
	public void setOrgno(String orgno) {
		this.orgno = orgno;
	}
	/**
	 * 获取：组织机构代码，唯一
	 */
	public String getOrgno() {
		return orgno;
	}
	/**
	 * 设置：企业名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：企业名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：企业介绍
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * 获取：企业介绍
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * 设置：企业电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：企业电话
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：公司所在地
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}
	/**
	 * 获取：公司所在地
	 */
	public String getAddr() {
		return addr;
	}
	/**
	 * 设置：企业简称
	 */
	public void setSamplename(String samplename) {
		this.samplename = samplename;
	}
	/**
	 * 获取：企业简称
	 */
	public String getSamplename() {
		return samplename;
	}
	/**
	 * 设置：企业性质代码 对应数据字典中的企业性质代码
	 */
	public void setDipropertyid(Long dipropertyid) {
		this.dipropertyid = dipropertyid;
	}
	/**
	 * 获取：企业性质代码 对应数据字典中的企业性质代码
	 */
	public Long getDipropertyid() {
		return dipropertyid;
	}
	/**
	 * 设置：企业邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：企业邮箱
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：企业传真
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}
	/**
	 * 获取：企业传真
	 */
	public String getFax() {
		return fax;
	}
	/**
	 * 设置：网站地址
	 */
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	/**
	 * 获取：网站地址
	 */
	public String getHomepage() {
		return homepage;
	}
	/**
	 * 设置：主营
	 */
	public void setMajorbusiness(String majorbusiness) {
		this.majorbusiness = majorbusiness;
	}
	/**
	 * 获取：主营
	 */
	public String getMajorbusiness() {
		return majorbusiness;
	}
	/**
	 * 设置：员工人数
	 */
	public void setPeoplenum(Integer peoplenum) {
		this.peoplenum = peoplenum;
	}
	/**
	 * 获取：员工人数
	 */
	public Integer getPeoplenum() {
		return peoplenum;
	}
	/**
	 * 设置：法人代表
	 */
	public void setEmploy(String employ) {
		this.employ = employ;
	}
	/**
	 * 获取：法人代表
	 */
	public String getEmploy() {
		return employ;
	}
	/**
	 * 设置：公司曾用名
	 */
	public void setOldname(String oldname) {
		this.oldname = oldname;
	}
	/**
	 * 获取：公司曾用名
	 */
	public String getOldname() {
		return oldname;
	}
	/**
	 * 设置：邮政编码
	 */
	public void setPost(String post) {
		this.post = post;
	}
	/**
	 * 获取：邮政编码
	 */
	public String getPost() {
		return post;
	}
	/**
	 * 设置：税号
	 */
	public void setTaxnum(String taxnum) {
		this.taxnum = taxnum;
	}
	/**
	 * 获取：税号
	 */
	public String getTaxnum() {
		return taxnum;
	}
	/**
	 * 设置：注册资本
	 */
	public void setCapital(String capital) {
		this.capital = capital;
	}
	/**
	 * 获取：注册资本
	 */
	public String getCapital() {
		return capital;
	}
	/**
	 * 设置：开户银行
	 */
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	/**
	 * 获取：开户银行
	 */
	public String getBankname() {
		return bankname;
	}
	/**
	 * 设置：银行开户名
	 */
	public void setBankdept(String bankdept) {
		this.bankdept = bankdept;
	}
	/**
	 * 获取：银行开户名
	 */
	public String getBankdept() {
		return bankdept;
	}
	/**
	 * 设置：开户银行帐号
	 */
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	/**
	 * 获取：开户银行帐号
	 */
	public String getAccountno() {
		return accountno;
	}
	/**
	 * 设置：管理体系认证
	 */
	public void setMcs(String mcs) {
		this.mcs = mcs;
	}
	/**
	 * 获取：管理体系认证
	 */
	public String getMcs() {
		return mcs;
	}
	/**
	 * 设置：企业成立日期
	 */
	public void setEstablishdate(String establishdate) {
		this.establishdate = establishdate;
	}
	/**
	 * 获取：企业成立日期
	 */
	public String getEstablishdate() {
		return establishdate;
	}
	/**
	 * 设置：状态
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * 获取：状态
	 */
	public String getState() {
		return state;
	}
	/**
	 * 设置：黑名单序号
	 */
	public void setBlid(Long blid) {
		this.blid = blid;
	}
	/**
	 * 获取：黑名单序号
	 */
	public Long getBlid() {
		return blid;
	}
	/**
	 * 设置：数据字典供应商等级序号
	 */
	public void setDievgradeid(Long dievgradeid) {
		this.dievgradeid = dievgradeid;
	}
	/**
	 * 获取：数据字典供应商等级序号
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
