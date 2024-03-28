# hello-fn
OptionalFn examples

![img.png](docs%2Fimg.png)


UT
```sh
 ~ mvn test -Dtest=com.xiaopeng.TestFn#testOptionalFn

Running com.xiaopeng.TestFn
11:44:26.143 baseMethod execute
11:44:26.145  模拟默认方法实现 updateReqQuery 示例 ：引入OptionalFn实现类前
11:44:26.145  模拟默认方法实现 changeThirdAppApi 示例 ：引入OptionalFn实现类前
11:44:26.145  模拟默认方法实现 changeWeatherSearch 示例 ：引入OptionalFn实现类前
11:44:26.145 testOptionalFn ==> 开始引入特定函数
11:44:26.161 开始注入 OptionalFn 实现类 :com.xiaopeng.fn.OptionalFn
11:44:26.161 注入成功 OptionalFn 实现类 : com.xiaopeng.fn.OptionalFn
11:44:26.161 baseMethod execute
11:44:26.162 这个是我的可选的实现类 updateReqQuery :引入OptionalFn实现类后
11:44:26.162 这个是我的可选的实现类 changeThirdAppApi: 引入OptionalFn实现类后
11:44:26.162  模拟默认方法实现 changeWeatherSearch 示例 ：引入OptionalFn实现类后
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.021 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0



```