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

import com.bootdo.su.domain.BlacklistDO;
import com.bootdo.su.service.BlacklistService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 供应商黑名单历史记录表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:34
 */
 
@Controller
@RequestMapping("/su/blacklist")
public class BlacklistController {
	@Autowired
	private BlacklistService blacklistService;
	
	@GetMapping()
	@RequiresPermissions("su:blacklist:blacklist")
	String Blacklist(){
	    return "su/blacklist/blacklist";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("su:blacklist:blacklist")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<BlacklistDO> blacklistList = blacklistService.list(query);
		int total = blacklistService.count(query);
		PageUtils pageUtils = new PageUtils(blacklistList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("su:blacklist:add")
	String add(){
	    return "su/blacklist/add";
	}

	@GetMapping("/edit/{blid}")
	@RequiresPermissions("su:blacklist:edit")
	String edit(@PathVariable("blid") Long blid,Model model){
		BlacklistDO blacklist = blacklistService.get(blid);
		model.addAttribute("blacklist", blacklist);
	    return "su/blacklist/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("su:blacklist:add")
	public R save( BlacklistDO blacklist){
		if(blacklistService.save(blacklist)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("su:blacklist:edit")
	public R update( BlacklistDO blacklist){
		blacklistService.update(blacklist);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("su:blacklist:remove")
	public R remove( Long blid){
		if(blacklistService.remove(blid)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("su:blacklist:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] blids){
		blacklistService.batchRemove(blids);
		return R.ok();
	}
	
}
