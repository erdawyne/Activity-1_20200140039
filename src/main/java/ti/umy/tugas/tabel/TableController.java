/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ti.umy.tugas.tabel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Hawe
 */
@Controller
public class TableController {
    
    @RequestMapping("/table")
    @ResponseBody
    public ArrayList<List<String>> getTable(Model paket) {
        String result = "Tabel Data";
        paket.addAtribute("ekspedisi",result);
        
        ArrayList <List<String>> data = new ArrayList<>();
        
        data.add(0,Arrays.asList("Id","Nomor KTP","Nama","Alamat"));
        data.add(1,Arrays.asList("001","3404014001","Erda","Peturen"));
        data.add(2,Arrays.asList("002","3404014002","Wyne","Peturen"));
        data.add(3,Arrays.asList("003","3404014003","Astuti","Peturen"));
        data.add(4,Arrays.asList("004","3404014004","Utami","Peturen"));
        data.add(5,Arrays.asList("005","3404014005","Ervita","Peturen"));
        data.add(6,Arrays.asList("006","3404014006","Kusuma","Peturen"));  
        data.add(7,Arrays.asList("007","3404014007","Rilo","Peturen"));
        data.add(8,Arrays.asList("008","3404014008","Hedi","Peturen"));
        data.add(9,Arrays.asList("009","3404014009","Wijaya","Peturen"));
        data.add(10,Arrays.asList("010","3404014010","Dwiyanto","Peturen"));
        data.add(11,Arrays.asList("011","3404014011","hanifah","Somorai"));
        data.add(12,Arrays.asList("012","3404014012","Nur","Somorai"));
        data.add(13,Arrays.asList("013","3404014013","laili","Somorai"));
        data.add(14,Arrays.asList("014","3404014014","fajar","Somorai"));
        data.add(15,Arrays.asList("015","3404014015","fahmi","Somorai"));
        data.add(16,Arrays.asList("016","3404014016","Uzi","Somorai"));
        data.add(17,Arrays.asList("017","3404014017","Udion","Somorai"));
        data.add(18,Arrays.asList("018","3404014018","Mahira","Somorai"));
        data.add(19,Arrays.asList("019","3404014019","Ajeng","Somorai"));
        data.add(20,Arrays.asList("020","3404014020","fitri","Somorai"));
        
        
        paket.addAttribute("tabel", data);
        return data;
    
    }
    
}
