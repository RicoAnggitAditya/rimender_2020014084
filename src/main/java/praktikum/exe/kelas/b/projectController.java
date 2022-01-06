/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.exe.kelas.b;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author acer
 */
@Controller
public class projectController {
    
    @RequestMapping("/input")
    public String getData(HttpServletRequest data, Model discountprocess){
        
        proses prosesdata = new proses();
        
        String name = prosesdata.dataName(data);
        String price = prosesdata.dataPrice(data);
        String quantity = prosesdata.dataQuantity(data);
        
        Double iprice = prosesdata.dataiPrice(price);
        Double itotal = prosesdata.dataiTotal(quantity);
        Double pricetotal = prosesdata.dataPriceTotal(iprice, itotal);
        Double gettotal = prosesdata.dataTotalPrice(pricetotal);
        String diskon = prosesdata.dataDiscount(pricetotal, gettotal);
        
        
        discountprocess.addAttribute("name", name);
        discountprocess.addAttribute("price", price);
        discountprocess.addAttribute("quantity", quantity);
        discountprocess.addAttribute("pricetotal", pricetotal);
        discountprocess.addAttribute("total", gettotal);
        discountprocess.addAttribute("diskone", diskon);
        
        return "view";
    }
}
