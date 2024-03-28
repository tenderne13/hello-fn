package com.xiaopeng;

import com.xiaopeng.fn.ChildComponentClass;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@Slf4j
public class TestFn {
    @Test
    public void testOptionalFn() {
        ChildComponentClass childComponentClass = new ChildComponentClass();
        childComponentClass.execute("引入OptionalFn实现类前");

        log.info("testOptionalFn ==> 开始引入特定函数");

        childComponentClass.init();
        childComponentClass.execute("引入OptionalFn实现类后");
    }
}
