package com.datamanager.extract.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.datamanager.extract.api.IExtractManagerService;

@Service
public class ExtractManagerServiceImpl implements IExtractManagerService {

    public void doExtract(){
        System.out.println("invoke extract");
    }
}
