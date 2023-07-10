## 介绍

这个项目主要一些 Java 脚本和 Java 的一些 demo。


## 目录结构

```
├─.idea
├─src               # 源码文件夹
│  ├─main
│  │  ├─java      # 放置项目Java源代码
│  │  │  └─com
│  │  │      └─flepeng
│  │  │          ├─dao       # 放置数据访问层代码 
│  │  │          │  └─impl  # 存放业务逻辑实际实现
│  │  │          ├─demain
│  │  │          ├─service   # 放置具体的业务逻辑代码（接口和实现分离）
│  │  │          │  └─impl  # 存放业务逻辑实际实现
│  │  │          └─util      # 放置工具类和辅助代码
│  │  ├─resources # 放置项目静态资源和配置文件，如多字符集boundle，位图，配置文件等（单独建立conf等子目录）
│  │  └─webapp    # Web 应用的网页
│  │      └─WEB-INF
│  └─test          # 放置项目测试用例代码
│      └─java
├─target            # 打包输出目录
├─pom.xml           # Maven工程的配置文件
├─LICENSE.txt       # 产品/本工程的版权信息文件
└─Readme.md         # 产品/本工程的说明文件
```

https://dengtao.me/blog/151
https://blog.csdn.net/m4330187/article/details/118811164
cnblogs.com/scown/p/5561677.html


## resource 目录

```
applicationContext-jdbc.xml
applicationContext-spring-anno.xml      # 注解方式
applicationContext-spring-aop.xml       # 面向切面
applicationContext-spring-ioc.xml       # 控制反转，最基础的方式
applicationContext-spring-tx.xml        # 事务管理
applicationContext-spring-tx-anno.xml   # 事务管理的注解方式
```


## 进度

spring 开始都做了