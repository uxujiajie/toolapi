package person.search.alltool.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import person.search.alltool.service.PurchaseService;

@RestController
@Api(tags="purchaseController")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService = null;

    @GetMapping("/test")
    @ApiOperation("抢购商品测试")
    public ModelAndView testPage() {
        return new ModelAndView("/html/test.html");
    }
    @PostMapping("purchase")
    public String purchase(int userId, int productId, int quantity) {
        long l1 = System.currentTimeMillis();
        System.out.println(userId);
        boolean sucess = purchaseService.purchase(userId, productId, quantity);
        System.out.println(System.currentTimeMillis()-l1);
        return "抢购结果:" + sucess;
    }
}

