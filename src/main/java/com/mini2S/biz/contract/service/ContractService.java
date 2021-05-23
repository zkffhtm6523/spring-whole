package com.mini2S.biz.contract.service;

import com.mini2S.biz.contract.model.dto.InsertContractDto;
import com.mini2S.model.response.CommonResult;
import javassist.NotFoundException;

import java.io.IOException;
import java.util.Optional;

public interface ContractService {
    CommonResult insertContract(InsertContractDto dto, String featureDirectory) throws IOException;

    CommonResult selectContractList(String userEmail) throws NotFoundException;
}
