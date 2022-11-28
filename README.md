# 笔记

## Day01

1. 搭建项目环境
2. 初始化项目
3. 使用GitHub登录API做第三方登录
4. 认识新注解@Value,作用是在项目启动的时候将数值注入变量

### Day01遇到的问题
1. 引入Bootstrap失败,下拉菜单没反应
2. Github登录API请求头格式变更,无法获取到账户名字

### Day01解决方法
1. 将引入方式改为CDN,并引入jquery,其中jquery要在Bootstrap之前引入
2. 将GithubProvider中的请求头格式变更



## Day02

1. 弄清楚Session和Cookies的原理