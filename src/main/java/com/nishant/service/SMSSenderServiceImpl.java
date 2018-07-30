package com.nishant.service;

import com.nishant.Domain.OrderInfo;
import com.nishant.Domain.SMSData;
import com.nishant.KafkaProducer.SMSProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by z001ld8 on 7/30/18.
 */
@Service
public class SMSSenderServiceImpl implements InfoSenderService {


    @Override
    public void Send(OrderInfo orderInfo) {

           /*
        1. this service will create sms object and send that to the user
        2. in case of failure we will put an entry in db where failed orders are stored
        3. quartz scheuler will pick these orders and retry them
         */


    }

}
