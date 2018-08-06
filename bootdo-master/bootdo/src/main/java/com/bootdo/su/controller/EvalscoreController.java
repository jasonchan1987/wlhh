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

import com.bootdo.su.domain.EvalscoreDO;
import com.bootdo.su.service.EvalscoreService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 供应商评分表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
 
@Controller
@RequestMapping("/su/evalscore")
public class EvalscoreController {
	@Autowired
	private EvalscoreService evalscoreService;
	
	@GetMapping()
	@RequiresPermissions("su:evalscore:evalscore")
	String Evalscore(){
	    return "su/evalscore/evalscore";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("su:evalscore:evalscore")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<EvalscoreDO> evalscoreList = evalscoreService.list(query);
		int total = evalscoreService.count(query);
		PageUtils pageUtils = new PageUtils(evalscoreList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("su:evalscore:add")
	String add(){
	    return "su/evalscore/add";
	}

	@GetMapping("/edit/{evid}")
	@RequiresPermissions("su:evalscore:edit")
	String edit(@PathVariable("evid") Long evid,Model model){
		EvalscoreDO evalscore = evalscoreService.get(evid);
		model.addAttribute("evalscore", evalscore);
	    return "su/evalscore/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("su:evalscore:add")
	public R save( EvalscoreDO evalscore){
		if(evalscoreService.save(evalscore)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("su:evalscore:edit")
	public R update( EvalscoreDO evalscore){
		evalscoreService.update(evalscore);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("su:evalscore:remove")
	public R remove( Long evid){
		if(evalscoreService.remove(evid)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("su:evalscore:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] evids){
		evalscoreService.batchRemove(evids);
		return R.ok();
	}
	
}
