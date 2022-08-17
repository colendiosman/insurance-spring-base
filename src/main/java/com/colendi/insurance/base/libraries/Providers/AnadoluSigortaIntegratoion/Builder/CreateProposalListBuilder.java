package com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Builder;

import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Request.Pet.CreateProposalListRequest;
import com.colendi.insurance.base.libraries.Providers.AnadoluSigortaIntegratoion.Response.Pet.CreateProposalListResponse;

public class CreateProposalListBuilder {
    public CreateProposalListRequest createRequest(){
        CreateProposalListRequest createProposalListRequest = new CreateProposalListRequest();
        return createProposalListRequest;
    }

    public CreateProposalListResponse createResponse(CreateProposalListResponse response){
        CreateProposalListResponse createProposalListResponse = new CreateProposalListResponse();
        return createProposalListResponse;
    }
}
