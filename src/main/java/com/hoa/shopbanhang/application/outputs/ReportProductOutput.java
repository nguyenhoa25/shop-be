package com.hoa.shopbanhang.application.outputs;

import com.hoa.shopbanhang.domain.entities.Product;

public interface ReportProductOutput {

  Product getProduct();

  Long getSold();

}
