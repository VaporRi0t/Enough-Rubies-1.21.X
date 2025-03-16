package net.riotzero.enoughrubies;

import net.fabricmc.api.ClientModInitializer;
import net.riotzero.enoughrubies.util.ModModelPredicates;

public class EnoughRubiesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicates.registerModelPredicates();
    }
}
