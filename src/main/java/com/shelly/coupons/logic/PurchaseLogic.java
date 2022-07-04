package com.shelly.coupons.logic;

import com.shelly.coupons.dao.IPurchaseDao;

import com.shelly.coupons.entities.PurchaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseLogic {
    @Autowired
    private IPurchaseDao purchaseDao;

    public long createPurchase(PurchaseEntity purchase) {
        purchaseDao.save(purchase);
        return purchase.getId();
    }

    public void updatePurchase(PurchaseEntity purchase) {
        purchaseDao.save(purchase);
    }

    public PurchaseEntity getPurchase(long id) {
        PurchaseEntity purchase = purchaseDao.findById(id).get();
        return purchase;
    }

    public List<PurchaseEntity> getPurchases() {
        System.out.println("hello");
        return ;
    }

}
