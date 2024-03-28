package com.xiaopeng.fn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface BaseInterface {

    Logger log = LoggerFactory.getLogger(BaseInterface.class);

    default void updateReqQuery(String query) {
        try {
            log.info(" 模拟默认方法实现 updateReqQuery 示例 ：" + query);
        } catch (Exception e) {
            log.error(" 模拟默认方法实现 updateReqQuery 示例异常");
        }

    }

    default void changeThirdAppApi(String query) {
        try {
            log.info(" 模拟默认方法实现 changeThirdAppApi 示例 ：" + query);
        } catch (Exception e) {
            log.error(" 模拟默认方法实现 changeThirdAppApi 示例异常");
        }
    }

    default void changeWeatherSearch(String query) {
        try {
            log.info(" 模拟默认方法实现 changeWeatherSearch 示例 ：" + query);
        } catch (Exception e) {
            log.error(" 模拟默认方法实现 changeWeatherSearch 示例异常");
        }
    }
}
