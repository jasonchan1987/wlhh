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

import com.bootdo.su.domain.ContractDO;
import com.bootdo.su.service.ContractService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 合同表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:34
 */
 
@Controller
@RequestMapping("/su/contract")
public class ContractController {
	@Autowired
	private ContractService contractService;
	
	@GetMapping()
	@RequiresPermissions("su:contract:contract")
	String Contract(){
	    return "su/contract/contract";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("su:contract:contract")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ContractDO> contractList = contractService.list(query);
		int total = contractService.count(query);
		PageUtils pageUtils = new PageUtils(contractList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("su:contract:add")
	String add(){
	    return "su/contract/add";
	}

	@GetMapping("/edit/{conid}")
	@RequiresPermissions("su:contract:edit")
	String edit(@PathVariable("conid") Long conid,Model model){
		ContractDO contract = contractService.get(conid);
		model.addAttribute("contract", contract);
	    return "su/contract/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("su:contract:add")
	public R save( ContractDO contract){
		if(contractService.save(contract)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("su:contract:edit")
	public R update( ContractDO contract){
		contractService.update(contract);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("su:contract:remove")
	public R remove( Long conid){
		if(contractService.remove(conid)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("su:contract:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] conids){
		contractService.batchRemove(conids);
		return R.ok();
	}
	
}
