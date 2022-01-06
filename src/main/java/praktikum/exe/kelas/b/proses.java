/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.exe.kelas.b;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author acer
 */
public class proses {
       public String dataName(HttpServletRequest data){
        String inputname = data.getParameter("var_name");
        return inputname;
    }
    public String dataPrice(HttpServletRequest data){
        String inputprice = data.getParameter("var_price");
        return inputprice;
    }
    public String dataQuantity(HttpServletRequest data){
        String inputquantity = data.getParameter("var_quantity");
        return inputquantity;
    }
    public String dataDiscount(Double PriceTotal, Double getTotal){
        String diskone = "";
        if (PriceTotal < 16000)
        {
            return diskone = "0%";
        }
        else if (PriceTotal >= 16000 && PriceTotal < 25000)
        {
            return diskone = "10%";
        }
        else if (PriceTotal >= 25000)
        {
            return diskone = "15%";
        }
        return diskone;
    }
    public Double dataiPrice(String inputprice){
        Double iPrice = Double.valueOf(inputprice);
        return iPrice;
    }
    public Double dataiTotal(String inputquantity){
        Double iTotal = Double.valueOf(inputquantity);
        return iTotal;
    }
    public Double dataPriceTotal(Double iPrice, Double iTotal){
        Double PriceTotal = iPrice * iTotal;
        return PriceTotal;
    }
    public Double dataTotalPrice(Double PriceTotal){
        Double getTotal = null;
        if (PriceTotal < 16000)
        {
            getTotal = PriceTotal - (0 * PriceTotal/100);
            return getTotal;
        }
        else if (PriceTotal >= 16000 && PriceTotal < 25000)
        {
            getTotal = PriceTotal - (10 * PriceTotal/100);
            return getTotal;
        }
        else if (PriceTotal >= 25000)
        {
            getTotal = PriceTotal - (15 * PriceTotal/100);
            return getTotal;
        }
        return getTotal;
    }
}
