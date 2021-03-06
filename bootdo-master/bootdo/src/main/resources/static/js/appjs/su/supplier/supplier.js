
var prefix = "/su/supplier"
$(function() {
	load();
});

function load() {
	$('#exampleTable')
			.bootstrapTable(
					{
						method : 'get', // 服务器数据的请求方式 get or post
						url : prefix + "/list", // 服务器数据的加载地址
					//	showRefresh : true,
					//	showToggle : true,
					//	showColumns : true,
						iconSize : 'outline',
						toolbar : '#exampleToolbar',
						striped : true, // 设置为true会有隔行变色效果
						dataType : "json", // 服务器返回的数据类型
						pagination : true, // 设置为true会在底部显示分页条
						// queryParamsType : "limit",
						// //设置为limit则会发送符合RESTFull格式的参数
						singleSelect : false, // 设置为true将禁止多选
						// contentType : "application/x-www-form-urlencoded",
						// //发送到服务器的数据编码类型
						pageSize : 10, // 如果设置了分页，每页数据条数
						pageNumber : 1, // 如果设置了分布，首页页码
						//search : true, // 是否显示搜索框
						showColumns : false, // 是否显示内容下拉框（选择显示的列）
						sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
						queryParams : function(params) {
							return {
								//说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
								limit: params.limit,
								offset:params.offset
					           // name:$('#searchName').val(),
					           // username:$('#searchName').val()
							};
						},
						// //请求服务器数据时，你可以通过重写参数的方式添加一些额外的参数，例如 toolbar 中的参数 如果
						// queryParamsType = 'limit' ,返回参数必须包含
						// limit, offset, search, sort, order 否则, 需要包含:
						// pageSize, pageNumber, searchText, sortName,
						// sortOrder.
						// 返回false将会终止请求
						columns : [
								{
									checkbox : true
								},
																{
									field : 'srid', 
									title : '供应商表, 供应商系统序号，主键，自增' 
								},
																{
									field : 'orgno', 
									title : '组织机构代码，唯一' 
								},
																{
									field : 'name', 
									title : '企业名称' 
								},
																{
									field : 'desc', 
									title : '企业介绍' 
								},
																{
									field : 'phone', 
									title : '企业电话' 
								},
																{
									field : 'addr', 
									title : '公司所在地' 
								},
																{
									field : 'samplename', 
									title : '企业简称' 
								},
																{
									field : 'dipropertyid', 
									title : '企业性质代码 对应数据字典中的企业性质代码' 
								},
																{
									field : 'email', 
									title : '企业邮箱' 
								},
																{
									field : 'fax', 
									title : '企业传真' 
								},
																{
									field : 'homepage', 
									title : '网站地址' 
								},
																{
									field : 'majorbusiness', 
									title : '主营' 
								},
																{
									field : 'peoplenum', 
									title : '员工人数' 
								},
																{
									field : 'employ', 
									title : '法人代表' 
								},
																{
									field : 'oldname', 
									title : '公司曾用名' 
								},
																{
									field : 'post', 
									title : '邮政编码' 
								},
																{
									field : 'taxnum', 
									title : '税号' 
								},
																{
									field : 'capital', 
									title : '注册资本' 
								},
																{
									field : 'bankname', 
									title : '开户银行' 
								},
																{
									field : 'bankdept', 
									title : '银行开户名' 
								},
																{
									field : 'accountno', 
									title : '开户银行帐号' 
								},
																{
									field : 'mcs', 
									title : '管理体系认证' 
								},
																{
									field : 'establishdate', 
									title : '企业成立日期' 
								},
																{
									field : 'state', 
									title : '状态' 
								},
																{
									field : 'blid', 
									title : '黑名单序号' 
								},
																{
									field : 'dievgradeid', 
									title : '数据字典供应商等级序号' 
								},
																{
									field : 'createBy', 
									title : '创建者' 
								},
																{
									field : 'createDeptid', 
									title : '创建机构' 
								},
																{
									field : 'createDate', 
									title : '创建时间' 
								},
																{
									field : 'updateBy', 
									title : '更新者' 
								},
																{
									field : 'updateDeptid', 
									title : '更新机构' 
								},
																{
									field : 'updateDate', 
									title : '更新时间' 
								},
																{
									field : 'remarks', 
									title : '备注信息' 
								},
																{
									field : 'delFlag', 
									title : '删除标记' 
								},
																{
									title : '操作',
									field : 'id',
									align : 'center',
									formatter : function(value, row, index) {
										var e = '<a class="btn btn-primary btn-sm '+s_edit_h+'" href="#" mce_href="#" title="编辑" onclick="edit(\''
												+ row.srid
												+ '\')"><i class="fa fa-edit"></i></a> ';
										var d = '<a class="btn btn-warning btn-sm '+s_remove_h+'" href="#" title="删除"  mce_href="#" onclick="remove(\''
												+ row.srid
												+ '\')"><i class="fa fa-remove"></i></a> ';
										var f = '<a class="btn btn-success btn-sm" href="#" title="备用"  mce_href="#" onclick="resetPwd(\''
												+ row.srid
												+ '\')"><i class="fa fa-key"></i></a> ';
										return e + d ;
									}
								} ]
					});
}
function reLoad() {
	$('#exampleTable').bootstrapTable('refresh');
}
function add() {
	layer.open({
		type : 2,
		title : '增加',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/add' // iframe的url
	});
}
function edit(id) {
	layer.open({
		type : 2,
		title : '编辑',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/edit/' + id // iframe的url
	});
}
function remove(id) {
	layer.confirm('确定要删除选中的记录？', {
		btn : [ '确定', '取消' ]
	}, function() {
		$.ajax({
			url : prefix+"/remove",
			type : "post",
			data : {
				'srid' : id
			},
			success : function(r) {
				if (r.code==0) {
					layer.msg(r.msg);
					reLoad();
				}else{
					layer.msg(r.msg);
				}
			}
		});
	})
}

function resetPwd(id) {
}
function batchRemove() {
	var rows = $('#exampleTable').bootstrapTable('getSelections'); // 返回所有选择的行，当没有选择的记录时，返回一个空数组
	if (rows.length == 0) {
		layer.msg("请选择要删除的数据");
		return;
	}
	layer.confirm("确认要删除选中的'" + rows.length + "'条数据吗?", {
		btn : [ '确定', '取消' ]
	// 按钮
	}, function() {
		var ids = new Array();
		// 遍历所有选择的行数据，取每条数据对应的ID
		$.each(rows, function(i, row) {
			ids[i] = row['srid'];
		});
		$.ajax({
			type : 'POST',
			data : {
				"ids" : ids
			},
			url : prefix + '/batchRemove',
			success : function(r) {
				if (r.code == 0) {
					layer.msg(r.msg);
					reLoad();
				} else {
					layer.msg(r.msg);
				}
			}
		});
	}, function() {

	});
}