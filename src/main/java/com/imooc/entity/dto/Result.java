package com.imooc.entity.dto;

import lombok.Data;

/**
 * created by Ethan on 2020/11/20 9:37 下午
 */
@Data
public class Result<T> {
    // 本次请求结果的状态码,200表示成功
    private int code;
    // 本次请求结果的详情
    private String msg;
    // 本次请求返回的结果集
    private T data;
}
