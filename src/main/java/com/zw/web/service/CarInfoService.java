package com.zw.web.service;

import com.zw.web.model.domian.Car;
import com.zw.web.model.dto.PageQuery;
import com.zw.web.model.domian.PageResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CarInfoService {
   String addCarHistory(HttpServletRequest request, HttpServletResponse response);
   String addCarCollection(HttpServletRequest request, HttpServletResponse response);
  // Page<Car> selectCarListPage();
   public PageResult<Car> queryCarPaging(PageQuery pageQuery);


}
