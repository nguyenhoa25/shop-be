package com.hoa.shopbanhang.application.services.impl;

import com.hoa.shopbanhang.adapter.web.v1.transfer.response.RequestResponse;
import com.hoa.shopbanhang.application.constants.CommonConstant;
import com.hoa.shopbanhang.application.constants.MessageConstant;
import com.hoa.shopbanhang.application.inputs.statistic.AdminStatisticInput;
import com.hoa.shopbanhang.application.inputs.statistic.CreateStatisticInput;
import com.hoa.shopbanhang.application.outputs.AdminStatisticOutput;
import com.hoa.shopbanhang.application.repositories.IStatisticRepository;
import com.hoa.shopbanhang.application.services.IStatisticService;
import com.hoa.shopbanhang.configs.exceptions.VsException;
import com.hoa.shopbanhang.domain.entities.Statistic;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatisticServiceImpl implements IStatisticService {
  private final IStatisticRepository statisticRepository;

  public StatisticServiceImpl(IStatisticRepository statisticRepository) {
    this.statisticRepository = statisticRepository;
  }

  @Override
  public List<AdminStatisticOutput> getStatistic(AdminStatisticInput input) {
    List<AdminStatisticOutput> adminStatisticOutputs = statisticRepository.adminStatistic(input);
    return adminStatisticOutputs;
  }

  @Override
  public List<Statistic> getAll() {
    return statisticRepository.findAll();
  }

  @Override
  public Statistic getStatisticById(Long id) {
    Optional<Statistic> statistic = statisticRepository.findById(id);
    checkStatisticExists(statistic);

    return statistic.get();
  }

  @Override
  public Statistic createStatistic(CreateStatisticInput createStatisticInput) {
    Statistic statistic = new Statistic();
    statistic.setAgeOfUser(createStatisticInput.getAgeOfUser());
    statistic.setUser(createStatisticInput.getUser());
    statistic.setProduct(createStatisticInput.getProduct());

    return statisticRepository.save(statistic);
  }

  @Override
  public RequestResponse deleteById(Long id) {
    Optional<Statistic> statistic = statisticRepository.findById(id);
    checkStatisticExists(statistic);

    statisticRepository.delete(statistic.get());

    return new RequestResponse(CommonConstant.TRUE, CommonConstant.EMPTY_STRING);
  }

  private void checkStatisticExists(Optional<Statistic> statistic) {
    if (statistic.isEmpty()) {
      throw new VsException(MessageConstant.STATISTIC_NOT_EXISTS);
    }
  }
}
