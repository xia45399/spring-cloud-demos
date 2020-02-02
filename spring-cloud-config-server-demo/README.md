## 配置中心 spring-cloud-config-server-demo

### 功能：

1 配置中心

2 动态刷新配置

### 注意事项：
1.未使用git管理配置文件
2. 需要暴露bus-refresh 端点
3.动态刷新需要在配置拉去方对应类加@RefreshScope注解
访问 http://ip:port/actuator/bus-refresh 动态刷新