package com.example.orderRestfulServer.services;

import com.example.orderRestfulServer.models.CheckOrderStatus;
import com.example.orderRestfulServer.repository.ICheckOrderStatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CheckOrderStatusService {

    @Autowired
    private ICheckOrderStatusRepo checkOrderStatusRepo;

    /*public ArrayList<CheckOrderStatus> getAll() {
        ArrayList<CheckOrderStatus> list = new ArrayList<>();
        Iterable it = checkOrderStatusRepo.findAll();
        for(Object CheckOrderStatus: it){
            list.add((com.example.orderRestfulServer.models.CheckOrderStatus) CheckOrderStatus);
        }
        return list;
    }*/

    public String check(String orderNumber, String companyID) {
        return checkOrderStatusRepo.checkOrder(orderNumber, companyID).getOrder_status();
    }
}
