package com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Pet;

import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Dto.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProposalListRequest {
    private PaymentTerm paymentTerm;
    private PolicyContacts policyContacts;
    private PolicyHeader policyHeader;
    private AssetIvo assetIvo;
    private ProductRelatedParams productRelatedParams;
    private CoverIvos coverIvos;
}
