package com.zw.web.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zw.web.model.domian.PageResult;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class PageResultUtil {
    public static <T, R> PageResult<R> createPageResult(IPage<T> page, Function<List<T>, List<R>> convertFunc,
                                                        Map paramMap) {
        PageResult<R> pageResult = new PageResult<R>();
        pageResult.setCurrentPage(page.getCurrent());
        pageResult.setPageSize(page.getSize());
        pageResult.setTotalPages(page.getPages());
        pageResult.setCount(page.getTotal());
        pageResult.setRecords(convertFunc.apply(page.getRecords()));
        pageResult.setParamMap(paramMap);
        return pageResult;
    }
}
