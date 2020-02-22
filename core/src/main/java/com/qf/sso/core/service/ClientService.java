package com.qf.sso.core.service;

import com.qf.sso.core.model.OAuthClient;

/**
 * @author qiufeng
 * @date 2020/2/16 16:10
 */
public interface ClientService {
    /**
     * 根据客户端ID获取客户端信息
     * @param clientId
     * @return
     */
    OAuthClient getClientById(String clientId);
}
