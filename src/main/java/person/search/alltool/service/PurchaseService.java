package person.search.alltool.service;

public interface PurchaseService {
    /**
     * 处理购买业务
     * @param userId 用户id
     * @param productId 产品编号
     * @param quantity 购买数量
     * @return 是否成功
     */
     boolean purchase(int userId, int productId, int quantity);
}
