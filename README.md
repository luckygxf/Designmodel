# 说明
设计模式demo  
### 模板设计模式
1. 把所有重复内容放到基类中
### 装饰模式
1. 在原来的基础上添加新的职责
2. 在新的类中，设置原来对象，调用实例方法，做相应包装
### 观察者模式
1. 需要订阅某个主题的注册，主题更新，调用观察者方法。缺点：所有观察者方法名需要相同
### 单例模式
1. 保证系统中某个类只有一个实例对象
2. 私有化构造方法
3. 对外提供获取实例接口
4. 考虑多线程安全问题