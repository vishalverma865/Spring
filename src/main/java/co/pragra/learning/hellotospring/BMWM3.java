package co.pragra.learning.hellotospring;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class BMWM3 {

    private String carName;
    private String engine;
    private List<String> features;          // moon roof, turbo change, auto parking
    private Map<String, Double> modelPricing;   // m1 =60000, m2 = 700000, m3 = 800000




    public BMWM3(String name, IEngine engine, List<String> features, Map<String, Double> modelPricing){
        System.out.println(modelPricing);
        this.carName = name;
        this.engine = engine.getEngineType();
        this.features =features;
       this.modelPricing =modelPricing;

    }
}
