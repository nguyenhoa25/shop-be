package com.hoa.shopbanhang.application.services;

import com.hoa.shopbanhang.adapter.web.v1.transfer.response.RequestResponse;
import com.hoa.shopbanhang.application.inputs.statistic.AdminStatisticInput;
import com.hoa.shopbanhang.application.inputs.statistic.CreateStatisticInput;
import com.hoa.shopbanhang.application.outputs.AdminStatisticOutput;
import com.hoa.shopbanhang.domain.entities.Statistic;

import java.util.List;

public interface IStatisticService {

  List<AdminStatisticOutput> getAll(AdminStatisticInput input);

  Statistic getStatisticById(Long id);

  Statistic createStatistic(CreateStatisticInput createStatisticInput);

  RequestResponse deleteById(Long id);

}