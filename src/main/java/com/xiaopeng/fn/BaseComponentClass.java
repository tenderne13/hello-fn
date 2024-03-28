package com.xiaopeng.fn;

import lombok.extern.slf4j.Slf4j;

/**
 * 示例父类方法
 */
@Slf4j
public class BaseComponentClass implements BaseInterface {
    private BaseInterface fnSubject;

    /**
     * 注入接口实现类
     *
     * @param baseInterface
     */
    protected void setRemoteImplementation(BaseInterface baseInterface) {
        fnSubject = baseInterface;
    }

    /**
     * 获取接口代理类
     *
     * @return
     */
    public BaseInterface getSubject() {
        if (fnSubject == null) {
            return this;
        }
        return fnSubject;
    }

    public void baseMethod() {
        log.info("baseMethod execute");
    }

    public void execute(String query) {
        //1. 模拟其他方法
        baseMethod();
        getSubject().updateReqQuery(query);
        getSubject().changeThirdAppApi(query);
        getSubject().changeWeatherSearch(query);
    }
}
