package com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsumerContext {
    private String lang;
    private String consumerCode;
    private String userName;
    private String messageId;
    private String messageGroupId;
    private String clientRequestTimestamp;
    private String organizationUnitCode;
    private String sessionId;
    private String ipAddress;
    private String serverInstanceId;
    private String channelCode;
    private String customerNumber;
}
