package com.hoa.shopbanhang.application.outputs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetListProductOutput {

  private List<ProductOutput> productOutputs;

  private PagingMeta meta;

}
