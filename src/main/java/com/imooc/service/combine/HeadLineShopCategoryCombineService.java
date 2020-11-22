package com.imooc.service.combine;

import com.imooc.entity.dto.MainPageInfoDTO;
import com.imooc.entity.dto.Result;

/**
 * created by Ethan on 2020/11/20 9:53 下午
 */
public interface HeadLineShopCategoryCombineService {
    Result<MainPageInfoDTO> getMainPageInfo();
}
