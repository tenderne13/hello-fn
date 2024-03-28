package com.xiaopeng.fn;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OptionalFn implements BaseInterface {

    @Override
    public void updateReqQuery(String query) {
        log.info("这个是我的可选的实现类 updateReqQuery :{}", query);
    }

    @Override
    public void changeThirdAppApi(String query) {
        log.info("这个是我的可选的实现类 changeThirdAppApi: {}", query);
    }
}
