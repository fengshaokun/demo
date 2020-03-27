package com.yikun.demo;

import com.yikun.demo.redis.RedisDao;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

/*

    public static Logger logger= LoggerFactory.getLogger(DemoApplicationTests.class);

    @Test
    void contextLoads() {


    }
    @Autowired
    RedisDao redisDao;
    @Test
    public void testRedis(){
        redisDao.setKey("name","yikun");
        redisDao.setKey("age","11");
        logger.info(redisDao.getValue("name"));
        logger.info(redisDao.getValue("age"));
    }
*/

}
