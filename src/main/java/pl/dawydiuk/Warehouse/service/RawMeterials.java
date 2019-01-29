package pl.dawydiuk.Warehouse.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dawydiuk.ConversionOfMass.model.Clay;


/**
 * Created by Judith on 29.12.2018.
 */

@RestController
@RequestMapping("rawmaterials")
public class RawMeterials {

    @GetMapping(value = "clay",produces = MediaType.APPLICATION_JSON_VALUE)
    public Clay getClay() {
        Clay clay = new Clay();
        return clay;
    }

}
