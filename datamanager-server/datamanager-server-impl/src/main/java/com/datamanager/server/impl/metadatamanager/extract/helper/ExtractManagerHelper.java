package com.datamanager.server.impl.metadatamanager.extract.helper;

import com.alibaba.dubbo.config.annotation.Reference;
import com.datamanager.extract.api.IExtractManagerService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @program: com.datamanager.server.impl.metadatamanager.extract.impl
 * @description:
 * @author: liujinghui
 * @create: 2019-03-10 19:46
 **/
@Component
public class ExtractManagerHelper {
    @Reference
    private IExtractManagerService iExtractManagerService;

    public void doExtract(){
        iExtractManagerService.doExtract();
    }
}
