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

import com.bootdo.su.domain.EnterqualiDO;
import com.bootdo.su.service.EnterqualiService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 资质表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:34
 */
 
@Controller
@RequestMapping("/su/enterquali")
public class EnterqualiController {
	@Autowired
	private EnterqualiService enterqualiService;
	
	@GetMapping()
	@RequiresPermissions("su:enterquali:enterquali")
	String Enterquali(){
	    return "su/enterquali/enterquali";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("su:enterquali:enterquali")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<EnterqualiDO> enterqualiList = enterqualiService.list(query);
		int total = enterqualiService.count(query);
		PageUtils pageUtils = new PageUtils(enterqualiList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("su:enterquali:add")
	String add(){
	    return "su/enterquali/add";
	}

	@GetMapping("/edit/{eqid}")
	@RequiresPermissions("su:enterquali:edit")
	String edit(@PathVariable("eqid") Long eqid,Model model){
		EnterqualiDO enterquali = enterqualiService.get(eqid);
		model.addAttribute("enterquali", enterquali);
	    return "su/enterquali/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("su:enterquali:add")
	public R save( EnterqualiDO enterquali){
		if(enterqualiService.save(enterquali)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("su:enterquali:edit")
	public R update( EnterqualiDO enterquali){
		enterqualiService.update(enterquali);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("su:enterquali:remove")
	public R remove( Long eqid){
		if(enterqualiService.remove(eqid)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("su:enterquali:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] eqids){
		enterqualiService.batchRemove(eqids);
		return R.ok();
	}
	
}
