package com.wang.ordering.util.pageBean;

import java.util.List;


public class PageBean<T> {
    /**
     * 页码
     */
    private Integer pageNum;
    /**
     * 每页数据条数
     */
    private Integer pageSize;
    /**
     * 总条数
     */
    private Integer count;
    /**
     * 总页数
     */
    private Integer totalPage;
    /**
     * 分页结果集
     */
    private List<T> list;

    public PageBean(Integer pageNum, Integer pageSize, Integer count, List<T> list) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.count = count;
        this.totalPage = (this.count + this.pageSize - 1) / this.pageSize;
        this.list = list;
    }

    public PageBean(List<T> list, Integer pageNum, Integer pageSize, Integer count) {
        this.list = list;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.count = count;
        this.totalPage = (this.count + this.pageSize - 1) / this.pageSize;
    }

    /**
     * 页码
     *
     * @return 页码
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * 页码
     *
     * @param pageNum 页码
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * 每页数据条数
     *
     * @return 每页数据条数
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 每页数据条数
     *
     * @param pageSize 每页数据条数
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 总条数
     *
     * @return 总条数
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 总条数
     *
     * @param count 总条数
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 总页数
     *
     * @return 总页数
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    /**
     * 总页数
     *
     * @param totalPage 总页数
     */
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    /**
     * 分页结果集
     *
     * @return 分页结果集
     */
    public List<T> getList() {
        return list;
    }

    /**
     * 分页结果集
     *
     * @param list 分页结果集
     */
    public void setList(List<T> list) {
        this.list = list;
    }
}
