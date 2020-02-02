## spring cloud demo:

|module名|module介绍|端口号|功能|
|---|---|---|---|
|spring-cloud-eureka-server-demo | 注册中心 | 9000 | 管理所有服务,提供配置中心地址 |
|spring-cloud-config-server-demo |配置中心 | 9001 | 所有module配置文件管理，实现配置文件动态刷新 |
|spring-cloud-service-demo | 服务提供者 | 9002 | 服务提供，从注册中心获取配置中心地址，再拉去配置 |
|spring-cloud-consumer-demo | 服务消费者 | 9004 | 服务消费者 |

### 使用方法：

1、启动注册中心

spring-cloud-eureka-server-demo

启动成功后打开 http://localhost:9000

输入用户名密码进入注册中心管理端

2、启动配置中心

spring-cloud-config-server-demo

3、启动服务提供者

spring-cloud-service-demo
访问 http://localhost:9002/hello

4、启动服务消费者

spring-cloud-consumer-demo
  
## 疑问:
各应用只配置注册中心地址,mq配置信息能写到配置中心吗？