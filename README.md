# 项目介绍
  项目包括三个部分：common、server、client，都是springboot项目，具体如下：  
  common项目相当于三方提供的SDK，里面包含需要实现的接口，以及需要传输的数据Model定义等，具体视情况而定；  
  server项目相当于我们的业务系统，我们需要在这个系统里实现common里面的接口，并且以HttpInvokerServiceExporter类型注册到Spring容器，具体参考ServerConfiguration类；  
  client项目相当于三方系统，他通过SpringHttpInvoker调用我们提供的远程接口，具体参考ClientConfiguration类。  
# 测试方式
  启动server项目；  
  启动client项目；  
  在浏览器访问http://localhost:8888/user/{id}； id随便什么数字都行，即可看到由server端返回的数据。
