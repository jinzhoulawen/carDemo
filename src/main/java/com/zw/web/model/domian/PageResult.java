package com.zw.web.model.domian;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = -1827313258340281968L;
    private long totalPages;
    private long count;
    private String id;
    private long currentPage = 1L;
    private long pageSize = 15L;
    private List<T> records;
    private Map<String, String> sort;
    private Map<String, Object> paramMap;

    public PageResult() {
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
        if (this.getTotalPages() == 0L) {
            long p = count / this.getPageSize();
            if (count % this.getPageSize() == 0L) {
                this.setTotalPages(p);
            } else {
                this.setTotalPages(p + 1L);
            }
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(long currentPage) {
        this.currentPage = currentPage;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getRecords() {
        if (this.records == null) {
            this.records = new LinkedList();
        }

        return this.records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
        if (0L >= this.getCount() && records.size() > 0) {
            this.setCount((long)records.size());
        }
    }

    public Map<String, String> getSort() {
        return sort;
    }

    public void setSort(Map<String, String> sort) {
        this.sort = sort;
    }

    public Map<String, Object> getParamMap() {
        if (this.paramMap == null) {
            this.paramMap = new HashMap();
        }
        return this.paramMap;
    }

    public void setParamMap(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }
    public long getStartIndex() {
        long result = (this.currentPage - 1L) * this.pageSize + 1L;
        return result;
    }

    public long getEndIndex() {
        long result = this.currentPage * this.pageSize;
        return result;
    }
}
