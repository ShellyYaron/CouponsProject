package com.shelly.coupons.logic;/*
package com.shelly.com.shelly.coupons.logic;

import com.shelly.com.shelly.coupons.dao.ICouponDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

@Service
public class ScheduleLogic {
    @Autowired
    private ICouponDao couponDao;

    public void timerTask() {
        LocalDate todayDate = LocalDate.now();
        Calendar date = Calendar.getInstance();
        date.set(Calendar.HOUR_OF_DAY, 0);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("checking if there is expired com.shelly.coupons to delete");
                couponDao.deleteByEndDateLessThan(Date.valueOf(todayDate));
            }
        };
        timer.scheduleAtFixedRate(task, date.getTime(), 86400000);

    }

}
*/
