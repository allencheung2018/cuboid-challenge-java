package testbuilders;

import lombok.Builder;
import net.bytebuddy.asm.Advice.This;

import java.util.List;

import co.fullstacklabs.cuboid.challenge.dto.NewBagDTO;
import co.fullstacklabs.cuboid.challenge.model.Bag;
import co.fullstacklabs.cuboid.challenge.model.Cuboid;

public class BagTestBuilder {
    static private Bag bag;
    static private BagTestBuilder bagTestBuilder;

    @Builder
    public static Bag bag(Long id, String title, double volume, List<Cuboid> cuboids) {
        Bag bag = new Bag(title, volume);
        bag.setId(id);
        //bag.setVolume(volume);
        //bag.setTitle(title);
        if (cuboids != null) {
            cuboids.forEach(bag::addCuboid);
        }
        return bag;
    }

    public static class BagBuilder {
        private long id = 1L;
        private double volume = 50d;
        private String title = "A bag with one cuboid";

        private List<Cuboid> cuboids = null;
    }

    public static BagTestBuilder builder() {
        BagTestBuilder bagTestBuilder = new BagTestBuilder();
        BagBuilder bagBuilder = new BagBuilder();
        bag = bag(bagBuilder.id, bagBuilder.title, bagBuilder.volume, bagBuilder.cuboids);
        return bagTestBuilder;
    }

    public BagTestBuilder title(String t){
        bag.setTitle(t);
        return this;
    }

    public BagTestBuilder volume(double v){
        bag.setVolume(v);
        return this;
    }

    public BagTestBuilder id(long id){
        bag.setVolume(id);
        return this;
    }

    public Bag build() {
        return bag;
    }
}
