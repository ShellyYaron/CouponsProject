package com.shelly.coupons.controller;

import com.shelly.coupons.dto.Purchase;
import com.shelly.coupons.exception.ApplicationException;
import com.shelly.coupons.logic.PurchaseLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

    private final PurchaseLogic purchaseLogic;

    @Autowired
    public PurchaseController(PurchaseLogic purchaseLogic) {
        this.purchaseLogic = purchaseLogic;
    }


    @PostMapping
    public long createPurchase(@RequestBody Purchase purchase)throws ApplicationException {
        return purchaseLogic.createPurchase(purchase);
    }

    @PutMapping
    public void updatePurchase(@RequestBody Purchase purchase)throws ApplicationException {
        purchaseLogic.updatePurchase(purchase);
    }

    @DeleteMapping("/{id}")
    public void deletePurchase(@PathVariable("id") long id)throws ApplicationException {
        purchaseLogic.deletePurchase(id);
    }

    @GetMapping
    public List<Purchase> getAllPurchases()throws ApplicationException {
        return purchaseLogic.getAllPurchases();
    }
}
