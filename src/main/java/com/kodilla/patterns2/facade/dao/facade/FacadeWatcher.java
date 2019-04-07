package com.kodilla.patterns2.facade.dao.facade;

import com.kodilla.patterns2.facade.api.OrderDto;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(theOrder, theUserId) && target(object)")
    public void logEvent(OrderDto theOrder, Long theUserId, Object object)throws Throwable{
        try{
            LOGGER.info("call for processOrder() methode, " + "Class:  " + object.getClass().getName() + ", Args: " + theOrder +", "+ theUserId);
        }catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
    }
}
//C:\SJ PRIV\28. Wzorce projektowe\patterns\src\main\java\com\kodilla\patterns2\facade\api\OrderFacade.java
