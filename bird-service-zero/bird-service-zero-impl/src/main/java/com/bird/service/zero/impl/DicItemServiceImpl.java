package com.bird.service.zero.impl;

import com.bird.service.common.service.AbstractServiceImpl;
import com.bird.service.zero.DicItemService;
import com.bird.service.zero.model.DicItem;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

/**
 * Created by liuxx on 2017/11/3.
 */
@Service
@CacheConfig(cacheNames = "zero_dicItem")
@com.alibaba.dubbo.config.annotation.Service(interfaceName = "com.bird.service.zero.DicItemService")
public class DicItemServiceImpl extends AbstractServiceImpl<DicItem> implements DicItemService {
}
