package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entitise.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService
{
    //写
    public int create(Payment pay);
    //读
    public Payment getPaymentById(@Param("id") Long id);
}
