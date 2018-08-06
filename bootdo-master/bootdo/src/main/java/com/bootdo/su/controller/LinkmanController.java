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

import com.bootdo.su.domain.LinkmanDO;
import com.bootdo.su.service.LinkmanService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 联系人表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
 
@Controller
@RequestMapping("/su/linkman")
public class LinkmanController {
	@Autowired
	private LinkmanService linkmanService;
	
	@GetMapping()
	@RequiresPermissions("su:linkman:linkman")
	String Linkman(){
	    return "su/linkman/linkman";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("su:linkman:linkman")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<LinkmanDO> linkmanList = linkmanService.list(query);
		int total = linkmanService.count(query);
		PageUtils pageUtils = new PageUtils(linkmanList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("su:linkman:add")
	String add(){
	    return "su/linkman/add";
	}

	@GetMapping("/edit/{lmid}")
	@RequiresPermissions("su:linkman:edit")
	String edit(@PathVariable("lmid") Long lmid,Model model){
		LinkmanDO linkman = linkmanService.get(lmid);
		model.addAttribute("linkman", linkman);
	    return "su/linkman/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("su:linkman:add")
	public R save( LinkmanDO linkman){
		if(linkmanService.save(linkman)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("su:linkman:edit")
	public R update( LinkmanDO linkman){
		linkmanService.update(linkman);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("su:linkman:remove")
	public R remove( Long lmid){
		if(linkmanService.remove(lmid)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("su:linkman:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] lmids){
		linkmanService.batchRemove(lmids);
		return R.ok();
	}
	
}
