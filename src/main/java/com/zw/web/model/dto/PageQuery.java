package com.zw.web.model.dto;

import com.zw.web.model.domian.PageResult;

import java.io.Serializable;
import java.util.Map;

public class PageQuery implements Serializable {
    private static final long serialVersionUID = -5565365082457256257L;

    private int currentPage = 1;
    private long count;

    private int pageSize = 15;

    private Map<String, String> sort;

    private Map<String, Object> paramMap;

    public PageQuery() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Map<String, String> getSort() {
        return sort;
    }

    public void setSort(Map<String, String> sort) {
        this.sort = sort;
    }

    public Map<String, Object> getParamMap() {
        return paramMap;
    }

    public void setParamMap(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public PageResult createPageResult() {
        PageResult result = new PageResult();
        result.setParamMap(this.paramMap);
        result.setCurrentPage((long)this.currentPage);
        result.setPageSize((long)this.pageSize);
        result.setSort(this.sort);
        if (this.getCount() > 0L) {
            result.setCount(this.getCount());
        }

        return result;
    }

    public long getStartIndex() {
        long result = (long)((this.currentPage - 1) * this.pageSize + 1);
        return result;
    }

    public long getEndIndex() {
        long result = (long)(this.currentPage * this.pageSize);
        return result;
    }

    public long getPagingStartIndex() {
        long result = (long)((this.currentPage - 1) * this.pageSize);
        return result;
    }
}
