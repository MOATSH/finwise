package com.scu.finwise.core.service;

import com.scu.finwise.core.pojo.dto.ExcelDictDTO;
import com.scu.finwise.core.pojo.entity.Dict;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 数据字典 服务类
 * </p>
 *
 * @author MOATSH
 * @since 2023-10-26
 */
public interface DictService extends IService<Dict> {

    void importData(InputStream inputStream);

    List<ExcelDictDTO> listDictData();

    List<Dict> listByParentId(Long parentId);

}
