package com.goodsoft.hotel.service;

import com.goodsoft.hotel.domain.entity.cookbook.MenuMeans;
import com.goodsoft.hotel.domain.entity.cookbook.MenuSubType;
import com.goodsoft.hotel.domain.entity.cookbook.MenuType;
import com.goodsoft.hotel.domain.entity.cookbook.SetMeal;
import com.goodsoft.hotel.domain.entity.param.MeansParam;
import com.goodsoft.hotel.domain.entity.param.MenuParam;
import com.goodsoft.hotel.domain.entity.param.HotelParam;
import com.goodsoft.hotel.domain.entity.result.Status;
import com.goodsoft.hotel.exception.HotelDataBaseException;

import javax.servlet.http.HttpServletRequest;

/**
 * description:
 * ===>菜单管理业务类
 *
 * @author 严彬荣 Created on 2017-11-07 16:49
 * @version V1.0
 */
public interface CookBookService {

    //点餐主页大类小类数据展示业务方法，用于点餐时进入主页提供类型选择
    <T> T queryTypeAndSubtypeService(HotelParam page) throws Exception;

    //前台下拉框菜单小类数据过滤
    <T> T queryMenuStypeService(String tid) throws Exception;

    //查询菜单类型，用于前台点餐时大类的数据展示或添加菜单数据用于定位小类型
    <T> T queryMenuTypeService(HotelParam page) throws Exception;

    //查询菜单子类型，用于前台点餐时小类的数据展示或添加菜单数据用于定位菜名
    <T> T queryMenuStypeService(String tid, HotelParam page) throws Exception;

    //前台下拉框菜单或多选框数据查询
    <T> T queryMenuService(String stid, String tid) throws Exception;

    //菜单数据查询，用于前台点餐时菜单数据的展示
    <T> T queryMenuDetailDao(String stid, String tid, HotelParam page, HttpServletRequest request, boolean setFindFiles) throws Exception;

    //菜单做法查询，用于前台点餐时做法数据展示或添加菜单数据用于定位做法详情
    <T> T queryMenuMeansService(String cbid, HotelParam page) throws Exception;

    //菜单做法详情查询，用于前台点餐时具体做法数据展示
    <T> T queryMenuMeansDetailService(String mid, HotelParam page) throws Exception;

    //餐饮套餐查询，用于前台点餐时具体获取套餐系列菜品以及获取套餐具体明细
    <T> T querySetMealDao(HotelParam page) throws Exception;

    //菜单类别与小类数据添加
    void addMenuTypeService(MenuType msg) throws Exception;

    //菜单数据、库存量数据添加
    Status addMenuService(MenuParam msg) throws Exception;

    //菜单做法数据添加
    void addMenuMeansService(MeansParam msg) throws Exception;

    //菜单详细做法数据添加
    void addMenuMeansDetailService(MenuMeans msg) throws Exception;

    //套餐数据添加
    void addSetMealService(SetMeal msg) throws Exception;

    //菜单类别与小类数据更新
    Status updateMenuTypeService(MenuType msg) throws Exception;

    //菜单数据、库存量数据更新
    Status updateMenuService(MenuSubType msg) throws Exception;

    //菜单做法数据更新
    Status updateMenuMeansService(MeansParam msg) throws Exception;

    //菜单详细做法数据更新
    Status updateMenuMeansDetailService(MenuMeans msg) throws Exception;

    //套餐数据更新
    Status updateSetMealService(SetMeal msg) throws Exception;

    //部门类别数据删除
    Status deleteMenuTypeService(String... id) throws HotelDataBaseException;

    //小类数据删除
    Status deleteMenuSubTypeService(String... id) throws HotelDataBaseException;

    //菜单数据、库存量数据删除
    Status deleteMenuService(String... id) throws HotelDataBaseException;

    //菜单做法数据删除
    Status deleteMenuMeansService(String... id) throws HotelDataBaseException;

    //菜单详细做法数据删除
    Status deleteMenuMeansDetailService(String... id) throws Exception;

    //套餐数据删除
    Status deleteSetMealService(String... id) throws HotelDataBaseException;

    //套餐明细数据删除
    Status deleteSetMealDetailService(String... id) throws Exception;

}
