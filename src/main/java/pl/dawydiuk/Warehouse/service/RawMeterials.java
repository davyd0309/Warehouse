package pl.dawydiuk.Warehouse.service;

import models.Clay;
import models.Kaolinite;
import models.Quartz;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Created by Konrad on 29.12.2018.
 */

@RestController
@RequestMapping("rawmaterials")
public class RawMeterials {

    @GetMapping(value = "clay", produces = MediaType.APPLICATION_JSON_VALUE)
    public Clay getClay() {
        return Clay.builder().build();
    }

    @GetMapping(value = "quartz", produces = MediaType.APPLICATION_JSON_VALUE)
    public Quartz getQuartz() {
        return Quartz.builder().build();
    }

    @GetMapping(value = "kaolinite", produces = MediaType.APPLICATION_JSON_VALUE)
    public Kaolinite getKaolinite() {
        return Kaolinite.builder().build();
    }

}
