package com.bird.service.cms;

import com.bird.service.cms.dto.CmsFullContentDTO;
import com.bird.service.cms.model.CmsContent;
import com.bird.service.common.service.AbstractService;

public interface CmsContentService extends AbstractService<CmsContent> {

    /**
     * 保存文章信息（包括自定义属性）
     * @param fullContentDTO
     */
    void saveContent(CmsFullContentDTO fullContentDTO);
}
