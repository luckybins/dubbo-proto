# 复现步骤
nacos改成自己的nacos环境（dubbo-proto-service/src/main/resources/application.yml）
注释掉Customer.java的代码，观察Provider在nacos上注册的地址，使用原生GRPC工具调用。
恢复Customer.java的代码，观察Consumer

nacos上注册的是java_package(com.example.dubbo.proto.dubbo.api.jpkg.Greeter)
reflection获取的是package(com.example.dubbo.proto.dubbo.api.Greeter)

3.1.7
原生grpc 能够调用 grpcurl --plaintext -d '{"name":"world"}' 127.0.0.1:50051 com.example.dubbo.proto.dubbo.api.Greeter/greet
java consumer 调用失败

3.2.3
原生grpc 调用失败
java consumer 调用失败
