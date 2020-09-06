package person.search.alltool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import person.search.alltool.service.PurchaseService;

@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;
    @GetMapping("/test")
    public ModelAndView testPage() {
        return new ModelAndView("/html/test.html");
    }
    @PostMapping("purchase")
    public String purchase(int userId, int productId, int quantity) {
        //long l1 = System.currentTimeMillis();
        //System.out.println(userId);
        boolean sucess = purchaseService.purchase(userId, productId, quantity);
        //System.out.println(System.currentTimeMillis()-l1);
        return "抢购结果:" + sucess;
    }
}

class Result{
    private boolean success = false;

}