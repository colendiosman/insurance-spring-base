package com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Pet;

import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto.PaymentInfo;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto.PaymentTerm;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto.PolicyKey;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreatePolicyFromProposalRequest {
    private PaymentInfo paymentInfo;
    private PaymentTerm paymentTerm;
    private PolicyKey policyKey;
}
