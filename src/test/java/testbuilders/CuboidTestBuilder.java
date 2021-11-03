package testbuilders;

import co.fullstacklabs.cuboid.challenge.dto.CuboidDTO.CuboidDTOBuilder;
import co.fullstacklabs.cuboid.challenge.model.Bag;
import co.fullstacklabs.cuboid.challenge.model.Cuboid;
import lombok.Builder;

public class CuboidTestBuilder {

    @Builder
    public static Cuboid cuboid(Long id, float width, float height,
                                float depth, Bag bag) {
        Cuboid cuboid = new Cuboid();
        cuboid.setId(id);
        cuboid.setWidth(width);
        cuboid.setHeight(height);
        cuboid.setDepth(depth);
        cuboid.setBag(bag);
        return cuboid;
    }

    public static class CuboidBuilder {
        private float width = 3f;
        private float height = 2f;
        private float depth = 3f;
        private Bag bag = BagTestBuilder.builder().id(1L).build();

        public CuboidBuilder(){

        }

        public CuboidBuilder id(long id){
            bag.setId(id);
            return this;
        }

        public CuboidBuilder width(float w){
            width = w;
            return this;
        }

        public CuboidBuilder height(float h){
            height = h;
            return this;
        }

        public CuboidBuilder depth(float d){
            depth = d;
            return this;
        }

        public CuboidBuilder bag(Bag b){
            bag = b;
            return this;
        }

        public Cuboid build(){
            Cuboid cuboid = cuboid(bag.getId(), width, height, depth, bag);
            return cuboid;
        }
    }

    public static CuboidBuilder builder() {
        return new CuboidTestBuilder.CuboidBuilder();
    }
}
