package com.example.orderRestfulServer.repository;

import com.example.orderRestfulServer.models.CheckOrderStatus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICheckOrderStatusRepo extends PagingAndSortingRepository<CheckOrderStatus, Integer> {

    @Query("SELECT p FROM CheckOrderStatus p WHERE p.order_number = :order_number AND p.company_id = :company_id")
    CheckOrderStatus checkOrder(@Param("order_number") String order_number, @Param("company_id") String company_id);
}
