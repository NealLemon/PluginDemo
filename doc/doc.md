# SaaS模式下下基于微内核架构实现各租户业务扩展

## 介绍

​	相信很多公司都有自己的SaaS产品,针对小客户可以使用现有的业务逻辑让客户去适应SaaS中提供的业务功能,但不缺乏有很多大公司或者大客户去使用SaaS产时,现有功能不能满足其业务去修，需要针对某些业务功能去基于现有的 SaaS产品去做定制化功能。由于是SaaS产品，不能任由客户随意进行业务修改。这时候微内核架构的产品设计方案非常适合这种情况。

### 微内核架构

如下图可见，微内核架构核心思想主要是以下两点。

- 微内核架构包含两类组件：核心系统（core system）和插件模块（plug-in modules）

- 应用逻辑被分割为独立的插件模块和核心系统，提供了可扩展性、灵活性、功能隔离和自定义处理逻辑的特性。

  ​													微内核架构图.png

#### 设计关键

- **插件管理**:核心系统需要知道当前有哪些插件可用，如何加载这些插件，什么时候加载插件。常见的实现方法是插件注册表机制。核心系统提供插件注册表（可以是配置文件，也可以是代码，还可以是数据库），插件注册表含有每个插件模块的信息，包括它的名字、位置、加载时机（启动就加载，还是按需加载）等。
- **插件连接**:  插件连接指插件如何连接到核心系统。通常来说，核心系统必须制定插件和核心系统的连接规范，然后插件按照规范实现，核心系统按照规范加载即可。
- **插件通信**:  插件通信指插件间的通信。虽然设计的时候插件间是完全解耦的，但实际业务运行过程中，必然会出现某个业务流程需要多个插件协作，这就要求两个插件间进行通信。由于插件之间没有直接联系，通信必须通过核心系统，因此核心系统需要提供插件通信机制。



原文链接： [架构：微内核架构（Microkernel Architecture）](https://xie.infoq.cn/article/d87245f256b835e7dbf37059d)



## 如何基于SpringBoot实现微内核架构

​	从 Spring Framework 3.1 开始，允许在 Bean 装配时增加前置条件判断。也就是说可以在Bean装配时根据一些条件选择对应的Bean进行注册以及实例化。本次主要介绍两种实现方案

- 基于 自定义 `@Conditional` 注解
- 基于 默认 `@ConditionalOnMissingBean` 注解



### 微内核样例系统

如图所示,我们现在有一个 Say World 的微内核架构的系统，这个系统的核心功能就是输出不同的 Say World .此次实现包括三种 ，都提供默认实现，并提供扩展点来进行不同租户的实现

​    PluginDemo架构图.png

- Say Hello World: 使用 `@ConditionalOnMissingBean`  适用于每个租户 对应一个代码仓库地址的情况
  - Default: 输出 "Default original condition Plugin Say : Hello World"
  - Tenant: 输出 "Single Tenant original condition Plugin say : Hello World"
- Say Good Night ： 使用 `@ConditionalOnMissingBean`   + Spring Boot 自动装配 适用于每个租户对应一个代码仓库地址的情况
  - Default：输出  "Default Plugin by auto configuration say : Good Night"
  - Tenant：输出  "Tenant Plugin say : Good Night"
- Say Good Morning : 自定义实现 `@Conditional`  , 适用于多个租户共享一个代码仓库地址，根据外部化配置实现 条件装配
  - Default：输出 "Default Plugin: Good Morning"
  - Tenant-china：输出  "China Plugin: Good Morning"
  - Tenant-india:: 输出 "India Plugin: Good Morning"

​                      