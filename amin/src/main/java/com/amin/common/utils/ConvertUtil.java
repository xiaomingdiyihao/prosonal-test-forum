package com.amin.common.utils;


import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
/**
 * @author yxm
 * @date 20210615
 * @description 转换一些数据格式工具类
 *
 */
public class ConvertUtil {
    /**
     * 将英文逗号隔开的id字符串转换为List数组
     *
     * @param ids
     * @return
     */
    public static List<Long> getListIdByids(String ids) {
        if (StringUtils.isNotBlank(ids)) {
            String[] idArr = ids.split(",");
            List<Long> idsList = new ArrayList<>();
            for (String id : idArr) {
                if (StringUtils.isNotBlank(id)) {
                    idsList.add(Long.valueOf(id));
                }
            }
            return idsList;
        }
        return null;
    }

    public static List<Integer> getListIdByIntegerIds(String ids) {
        if (StringUtils.isNotBlank(ids)) {
            String[] idArr = ids.split(",");
            List<Integer> idsList = new ArrayList<>();
            for (String id : idArr) {
                if (StringUtils.isNotBlank(id)) {
                    idsList.add(Integer.valueOf(id));
                }
            }
            return idsList;
        }
        return null;
    }
    public static List<Long> getListIdByLongIds(String ids) {
        if (StringUtils.isNotBlank(ids)) {
            String[] idArr = ids.split(",");
            List<Long> idsList = new ArrayList<>();
            for (String id : idArr) {
                if (StringUtils.isNotBlank(id)) {
                    idsList.add(Long.valueOf(id));
                }
            }
            return idsList;
        }
        return null;
    }
}
