package testbuilders;

import lombok.Builder;

import java.util.List;

import co.fullstacklabs.cuboid.challenge.dto.NewBagDTO.NewBagDTOBuilder;
import co.fullstacklabs.cuboid.challenge.model.Bag;
import co.fullstacklabs.cuboid.challenge.model.Cuboid;

public class BagTestBuilder {
    @Builder
    public static Bag bag(Long id, String title, double volume, List<Cuboid> cuboids) {
        Bag bag = new Bag(title, volume);
        bag.setId(id);
        // bag.setVolume(volume);
        // bag.setTitle(title);
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

        public BagBuilder(){

        }

        public BagBuilder id(long id){
            this.id = id;
            return this;
        }

        public BagBuilder title(String t){
            title = t;
            return this;
        }

        public BagBuilder volume(double v){
            volume = v;
            return this;
        }

        public Bag build(){
            Bag bag = bag(id, title, volume, cuboids);
            return bag;
        }
    }



    public static BagBuilder builder() {
        return new BagTestBuilder.BagBuilder();
    }
}
