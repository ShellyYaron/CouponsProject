package coupons.dao;

import com.shelly.coupons.entities.PurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPurchaseDao extends JpaRepository<PurchaseEntity, Long> {

}
