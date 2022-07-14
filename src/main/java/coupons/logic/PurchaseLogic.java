package coupons.logic;

import com.shelly.coupons.dao.IPurchaseDao;
import com.shelly.coupons.dto.Purchase;
import com.shelly.coupons.entities.PurchaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseLogic {

    private final IPurchaseDao purchaseDao;

    @Autowired
    public PurchaseLogic(IPurchaseDao purchaseDao) {
        this.purchaseDao = purchaseDao;
    }

    public long createPurchase(Purchase purchase) {
        PurchaseEntity purchasesEntity = new PurchaseEntity(purchase);
        purchaseDao.save(purchasesEntity);
        return purchasesEntity.getId();
    }

    public void updatePurchase(Purchase purchase) {
        PurchaseEntity purchasesEntity = new PurchaseEntity(purchase);
        purchaseDao.save(purchasesEntity);
    }
    public void deletePurchase(long id) {
        purchaseDao.deleteById(id);
    }

    public Purchase getPurchaseById(long id) {
        PurchaseEntity purchasesEntity = purchaseDao.findById(id).get();
        Purchase purchase = new Purchase(purchasesEntity);
        return purchase;
    }

    public List<Purchase> getAllPurchases() {
        List<Purchase> purchasesList = new ArrayList<>();
        Iterable<PurchaseEntity> purchasesIterable = purchaseDao.findAll();
        for (PurchaseEntity purchasesEntity : purchasesIterable) {
            Purchase purchase = new Purchase(purchasesEntity);
            purchasesList.add(purchase);
        }
        return purchasesList;
    }

}
