package com.threebrother.qofood.service;

import com.threebrother.qofood.entity.ReceiveAddress;

import java.util.List;

public interface ReceiveAddressService {

    void saveReceiveAddress(ReceiveAddress receiveAddress);

    List<ReceiveAddress> getUserReceiveAddressList(String userOpenId);

    void updateReceiveAddress(ReceiveAddress receiveAddress);

    void deleteReceiveAddress(int receiveAddressId, String userOpenId);
}
