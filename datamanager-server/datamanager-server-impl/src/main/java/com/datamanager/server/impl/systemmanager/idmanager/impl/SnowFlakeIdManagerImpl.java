package com.datamanager.server.impl.systemmanager.idmanager.impl;

import com.datamanager.server.api.systemmanager.idmanager.service.ISnowFlakeIdManagerService;
import com.datamanager.server.impl.systemmanager.idmanager.utils.CoreIdWorker;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: com.datamanager.server.impl.systemmanager.idmanager.impl
 * @description:
 * @author: liujinghui
 * @create: 2019-03-09 15:07
 **/
public class SnowFlakeIdManagerImpl implements ISnowFlakeIdManagerService {

    @Autowired
    private CoreIdWorker coreIdWorker;

    @Override
    public long getId() {
        return coreIdWorker.nextId();
    }
}
