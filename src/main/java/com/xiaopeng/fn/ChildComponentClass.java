package com.xiaopeng.fn;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChildComponentClass extends BaseComponentClass {

    /**
     * 模拟 reload 调用
     */
    public void init() {
        // 从 reload 远程获取函数实现
        BaseInterface baseInterface = new OptionalFn();
        log.info("开始注入 OptionalFn 实现类 :{}", baseInterface.getClass().getName());
        super.setRemoteImplementation(baseInterface);
        log.info("注入成功 OptionalFn 实现类 : {}", baseInterface.getClass().getName());
    }
}
