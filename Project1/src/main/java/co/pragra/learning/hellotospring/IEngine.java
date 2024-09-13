package co.pragra.learning.hellotospring;

import lombok.Data;

@Data
public class IEngine {
    private String engineType;

    public IEngine(String engineType) {
        this.engineType = engineType;
    }
}
