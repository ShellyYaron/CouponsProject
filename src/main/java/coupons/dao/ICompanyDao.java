package coupons.dao;

import com.shelly.coupons.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ICompanyDao extends JpaRepository<CompanyEntity, Long> {

}
