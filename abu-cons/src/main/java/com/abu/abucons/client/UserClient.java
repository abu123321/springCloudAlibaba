package com.abu.abucons.client;

import com.abu.abucons.fallback.UserFallback;
import com.abu.ums.api.ProvApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "provider-service",fallback = UserFallback.class)
public interface UserClient extends ProvApi {

}
