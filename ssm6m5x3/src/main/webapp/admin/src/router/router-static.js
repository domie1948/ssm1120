import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import bingfang from '@/views/modules/bingfang/list'
    import discussjiankangjiangtan from '@/views/modules/discussjiankangjiangtan/list'
    import jiankangjiangtan from '@/views/modules/jiankangjiangtan/list'
    import keshi from '@/views/modules/keshi/list'
    import bingli from '@/views/modules/bingli/list'
    import yaopinxinxi from '@/views/modules/yaopinxinxi/list'
    import yizhu from '@/views/modules/yizhu/list'
    import bingrenxinxi from '@/views/modules/bingrenxinxi/list'
    import yihurenyuan from '@/views/modules/yihurenyuan/list'
    import shoushuanpai from '@/views/modules/shoushuanpai/list'
    import yaopinqingdan from '@/views/modules/yaopinqingdan/list'
    import bingren from '@/views/modules/bingren/list'
    import yiliaofeiyong from '@/views/modules/yiliaofeiyong/list'
    import chat from '@/views/modules/chat/list'
    import config from '@/views/modules/config/list'
    import yiqishebei from '@/views/modules/yiqishebei/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/bingfang',
        name: '病房',
        component: bingfang
      }
          ,{
	path: '/discussjiankangjiangtan',
        name: '健康讲坛评论',
        component: discussjiankangjiangtan
      }
          ,{
	path: '/jiankangjiangtan',
        name: '健康讲坛',
        component: jiankangjiangtan
      }
          ,{
	path: '/keshi',
        name: '科室',
        component: keshi
      }
          ,{
	path: '/bingli',
        name: '病历',
        component: bingli
      }
          ,{
	path: '/yaopinxinxi',
        name: '药品信息',
        component: yaopinxinxi
      }
          ,{
	path: '/yizhu',
        name: '医嘱',
        component: yizhu
      }
          ,{
	path: '/bingrenxinxi',
        name: '病人信息',
        component: bingrenxinxi
      }
          ,{
	path: '/yihurenyuan',
        name: '医护人员',
        component: yihurenyuan
      }
          ,{
	path: '/shoushuanpai',
        name: '手术安排',
        component: shoushuanpai
      }
          ,{
	path: '/yaopinqingdan',
        name: '药品清单',
        component: yaopinqingdan
      }
          ,{
	path: '/bingren',
        name: '病人',
        component: bingren
      }
          ,{
	path: '/yiliaofeiyong',
        name: '医疗费用',
        component: yiliaofeiyong
      }
          ,{
	path: '/chat',
        name: '医护交流',
        component: chat
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/yiqishebei',
        name: '仪器设备',
        component: yiqishebei
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
