package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {
    //插入购买明细，可以过滤重复
    int insertSuccessKilled(long seckillId,long userPhone);

    //根据id查询SuccessKilled并携带秒杀产品对象实体
    SuccessKilled queryByIdWithSeckill(long seckillId);
    
}
