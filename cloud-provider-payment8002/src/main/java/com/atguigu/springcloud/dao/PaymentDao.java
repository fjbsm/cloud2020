package com.atguigu.springcloud.dao;


import com.atguigu.springcloud.entitise.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao
{
    //写
    public int create(Payment pay);
    //读
    public Payment getPaymentById(@Param("id") Long id);
}
