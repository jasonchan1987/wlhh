package com.bootdo.su.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.su.domain.SupplierDO;
import com.bootdo.su.service.SupplierService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 供应商表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
 
@Controller
@RequestMapping("/su/supplier")
public class SupplierController {
	@Autowired
	private SupplierService supplierService;
	
	@GetMapping()
	@RequiresPermissions("su:supplier:supplier")
	String Supplier(){
	    return "su/supplier/supplier";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("su:supplier:supplier")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<SupplierDO> supplierList = supplierService.list(query);
		int total = supplierService.count(query);
		PageUtils pageUtils = new PageUtils(supplierList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("su:supplier:add")
	String add(){
	    return "su/supplier/add";
	}

	@GetMapping("/edit/{srid}")
	@RequiresPermissions("su:supplier:edit")
	String edit(@PathVariable("srid") Long srid,Model model){
		SupplierDO supplier = supplierService.get(srid);
		model.addAttribute("supplier", supplier);
	    return "su/supplier/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("su:supplier:add")
	public R save( SupplierDO supplier){
		if(supplierService.save(supplier)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("su:supplier:edit")
	public R update( SupplierDO supplier){
		supplierService.update(supplier);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("su:supplier:remove")
	public R remove( Long srid){
		if(supplierService.remove(srid)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("su:supplier:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] srids){
		supplierService.batchRemove(srids);
		return R.ok();
	}
	
}
