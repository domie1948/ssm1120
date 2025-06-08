
var projectName = '医院住院管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '医护人员',
	url: './pages/yihurenyuan/list.html'
}, 
{
	name: '药品信息',
	url: './pages/yaopinxinxi/list.html'
}, 
{
	name: '健康讲坛',
	url: './pages/jiankangjiangtan/list.html'
}, 

]

var adminurl =  "http://localhost:8080/ssm6m5x3/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"医护人员","menuJump":"列表","tableName":"yihurenyuan"}],"menu":"医护人员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"科室","menuJump":"列表","tableName":"keshi"}],"menu":"科室管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"病人","menuJump":"列表","tableName":"bingren"}],"menu":"病人管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"病房","menuJump":"列表","tableName":"bingfang"}],"menu":"病房管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"病人信息","menuJump":"列表","tableName":"bingrenxinxi"}],"menu":"病人信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"病历","menuJump":"列表","tableName":"bingli"}],"menu":"病历管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"医嘱","menuJump":"列表","tableName":"yizhu"}],"menu":"医嘱管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"手术安排","menuJump":"列表","tableName":"shoushuanpai"}],"menu":"手术安排管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"药品信息","menuJump":"列表","tableName":"yaopinxinxi"}],"menu":"药品信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"仪器设备","menuJump":"列表","tableName":"yiqishebei"}],"menu":"仪器设备管理"},{"child":[{"buttons":["查看","修改","删除","查看评论"],"menu":"健康讲坛","menuJump":"列表","tableName":"jiankangjiangtan"}],"menu":"健康讲坛管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"医疗费用","menuJump":"列表","tableName":"yiliaofeiyong"}],"menu":"医疗费用管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"医护人员列表","menuJump":"列表","tableName":"yihurenyuan"}],"menu":"医护人员模块"},{"child":[{"buttons":["查看","药品购买"],"menu":"药品信息列表","menuJump":"列表","tableName":"yaopinxinxi"}],"menu":"药品信息模块"},{"child":[{"buttons":["查看"],"menu":"健康讲坛列表","menuJump":"列表","tableName":"jiankangjiangtan"}],"menu":"健康讲坛模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","登记信息","病历"],"menu":"病人","menuJump":"列表","tableName":"bingren"}],"menu":"病人管理"},{"child":[{"buttons":["查看","手术安排","医疗费用","删除","修改","医嘱","开药"],"menu":"病人信息","menuJump":"列表","tableName":"bingrenxinxi"}],"menu":"病人信息管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"病历","menuJump":"列表","tableName":"bingli"}],"menu":"病历管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"医嘱","menuJump":"列表","tableName":"yizhu"}],"menu":"医嘱管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"手术安排","menuJump":"列表","tableName":"shoushuanpai"}],"menu":"手术安排管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"健康讲坛","menuJump":"列表","tableName":"jiankangjiangtan"}],"menu":"健康讲坛管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"医疗费用","menuJump":"列表","tableName":"yiliaofeiyong"}],"menu":"医疗费用管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"药品清单","menuJump":"列表","tableName":"yaopinqingdan"}],"menu":"药品清单管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"医护交流","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"医护人员列表","menuJump":"列表","tableName":"yihurenyuan"}],"menu":"医护人员模块"},{"child":[{"buttons":["查看","药品购买"],"menu":"药品信息列表","menuJump":"列表","tableName":"yaopinxinxi"}],"menu":"药品信息模块"},{"child":[{"buttons":["查看"],"menu":"健康讲坛列表","menuJump":"列表","tableName":"jiankangjiangtan"}],"menu":"健康讲坛模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"医护人员","tableName":"yihurenyuan"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"病人信息","menuJump":"列表","tableName":"bingrenxinxi"}],"menu":"病人信息管理"},{"child":[{"buttons":["查看"],"menu":"病历","menuJump":"列表","tableName":"bingli"}],"menu":"病历管理"},{"child":[{"buttons":["查看"],"menu":"医嘱","menuJump":"列表","tableName":"yizhu"}],"menu":"医嘱管理"},{"child":[{"buttons":["查看"],"menu":"手术安排","menuJump":"列表","tableName":"shoushuanpai"}],"menu":"手术安排管理"},{"child":[{"buttons":["支付","查看"],"menu":"医疗费用","menuJump":"列表","tableName":"yiliaofeiyong"}],"menu":"医疗费用管理"},{"child":[{"buttons":["查看","支付"],"menu":"药品清单","menuJump":"列表","tableName":"yaopinqingdan"}],"menu":"药品清单管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"医护人员列表","menuJump":"列表","tableName":"yihurenyuan"}],"menu":"医护人员模块"},{"child":[{"buttons":["查看","药品购买"],"menu":"药品信息列表","menuJump":"列表","tableName":"yaopinxinxi"}],"menu":"药品信息模块"},{"child":[{"buttons":["查看"],"menu":"健康讲坛列表","menuJump":"列表","tableName":"jiankangjiangtan"}],"menu":"健康讲坛模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"病人","tableName":"bingren"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
