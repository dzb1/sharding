package com.controller;

import com.mapper.GoodsMapper;
import com.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author dzb
 */
@RestController
public class ShardingController {
    @Autowired
    private GoodsMapper goodsMapper;
    @GetMapping("/hello")
    public String hello() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            Goods good = new Goods();
            good.setGname("小米手机1");
            good.setUserId(current.nextLong(1, 100));
            good.setGstatus("已发布");
            goodsMapper.insert(good);
        }
        return "success";
    }
}
