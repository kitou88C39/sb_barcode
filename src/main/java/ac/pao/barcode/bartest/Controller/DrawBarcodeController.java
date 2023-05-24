package ac.pao.barcode.bartest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bing.annotation.RequestMapping;

@Controller
public class DrawBarcodeController {
    @RequestMapping("/pao")
    public String hoge() {
        return "barcode2";
    }
}
