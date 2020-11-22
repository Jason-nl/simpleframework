package com.imooc.service.solo;

import com.imooc.entity.HeadLine;
import com.imooc.entity.dto.Result;

import java.util.List;

/**
 * created by Ethan on 2020/11/20 9:43 下午
 */
public interface HeadLineService {
    Result<Boolean> addHeadLine(HeadLine headLine);

    Result<Boolean> removeHeadLine(int headLineId);

    Result<Boolean> modifyHeadLine(HeadLine headLine);
    Result<HeadLine> queryHeadLineById(int headLineId);

    Result<List<HeadLine>> queryHeadLine(HeadLine headLineCondition, int pageIndex, int pageSize);

}
