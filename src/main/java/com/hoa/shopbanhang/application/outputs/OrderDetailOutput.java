package com.hoa.shopbanhang.application.outputs;

import com.hoa.shopbanhang.domain.entities.ItemDetail;
import com.hoa.shopbanhang.domain.entities.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailOutput {

  private Order order;

  private List<ItemDetail> itemDetails;

}
