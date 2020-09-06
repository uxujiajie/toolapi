package person.search.alltool.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import person.search.alltool.mbg.mapper.TProductMapper;
import person.search.alltool.mbg.mapper.TPurchaseRecordMapper;
import person.search.alltool.mbg.model.TProduct;
import person.search.alltool.mbg.model.TPurchaseRecord;
import person.search.alltool.service.PurchaseService;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    private TProductMapper tProductMapper;
    @Autowired
    private TPurchaseRecordMapper tPurchaseRecordMapper;

    @Override
    @Transactional
    public boolean purchase(int userId, int productId, int quantity) {
        TProduct product = tProductMapper.selectByPrimaryKey(productId);
        if (product.getStock() < quantity) {
            return false;
        }
        //product.setStock(product.getStock() - quantity);
        int nums = tProductMapper.updatePurchaseByPrimaryKey(productId, quantity);
        if(nums != quantity) {
            return false;
        }
        tPurchaseRecordMapper.insert(initPurchaseRecord(userId, product, quantity) );
        return true;
    }

    private TPurchaseRecord initPurchaseRecord(int userId, TProduct product, int quantity) {
        TPurchaseRecord tre = new TPurchaseRecord();
        tre.setNote("购买时间:" + System.currentTimeMillis() );
        tre.setPrice(product.getPrice() );
        tre.setProductId(product.getId() );
        tre.setQuantity(quantity);
        tre.setPurchaseDate(new Date());
        tre.setSum(product.getPrice().multiply(new BigDecimal(quantity) ) );
        tre.setUserId(userId);
        return tre;
    }
}
