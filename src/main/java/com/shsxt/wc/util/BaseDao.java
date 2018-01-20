package com.shsxt.wc.util;

import java.util.List;
import java.util.Map;

public interface BaseDao <K, E> {

    long delete(K id);

    long save(E record);

    /**
     * 只保存非空字段
     *
     * @param record
     * @return
     */
    long saveSte(E record);

    E get(K id);

    /**
     * 只更新非空字段
     *
     * @param record
     * @return
     */
    long updateSte(E record);

    long update(E record);

    long count(Object param);

    List<E> find(Map<String, Object> param);

    /**
     * 有多个符合条件的也只取第一个
     *
     * @param param
     * @return
     */
    E findOne(Map<String, Object> param);
}
