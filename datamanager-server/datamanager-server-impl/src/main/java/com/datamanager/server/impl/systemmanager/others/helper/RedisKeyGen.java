package com.datamanager.server.impl.systemmanager.others.helper;


import com.datamanager.server.api.systemmanager.usermanager.model.UserVO;
import com.datamanager.server.impl.systemmanager.others.constant.KeyCodeConstant;

/**
 * @program: com.umbrella.armsmerchant.common.common_util
 * @description:
 * @author: liujinghui
 * @create: 2018-11-24 11:12
 **/
public class RedisKeyGen {
    public static String KeyGen(Class clazz,String key){
        if(null == key || "".equals(key)){
            return "";
        }
        if(clazz == UserVO.class){
            return KeyCodeConstant.PRODUCT_KEY_PREFIX_CODE+key;
        }else{
            return key;
        }
    }
}
