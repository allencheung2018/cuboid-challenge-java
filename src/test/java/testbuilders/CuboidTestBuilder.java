package testbuilders;

import static org.mockito.ArgumentMatchers.refEq;

import co.fullstacklabs.cuboid.challenge.dto.CuboidDTO;
import co.fullstacklabs.cuboid.challenge.model.Bag;
import co.fullstacklabs.cuboid.challenge.model.Cuboid;
import lombok.Builder;

public class CuboidTestBuilder {
    private static CuboidTestBuilder cuboidTestBuilder;
    private static Cuboid cuboid;

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
    }

    public static CuboidTestBuilder builder() {
        cuboidTestBuilder = new CuboidTestBuilder();
        CuboidBuilder cuboidBuilder = new CuboidBuilder();
        cuboid = CuboidTestBuilder.cuboid(cuboidBuilder.bag.getId(), cuboidBuilder.width, cuboidBuilder.height, cuboidBuilder.depth, cuboidBuilder.bag);
        return cuboidTestBuilder;
    }

    public static CuboidTestBuilder width(float w){
        cuboid.setWidth(w);
        return cuboidTestBuilder;
    }

    public static CuboidTestBuilder height(float h){
        cuboid.setHeight(h);
        return cuboidTestBuilder;
    }

    public static CuboidTestBuilder depth(float d){
        cuboid.setDepth(d);
        return cuboidTestBuilder;
    }

    public static CuboidTestBuilder id(long id){
        cuboid.setId(id);
        return cuboidTestBuilder;
    }

    public static CuboidTestBuilder bag(Bag bag){
        cuboid.setBag(bag);
        return cuboidTestBuilder;
    }

    public Cuboid build() {
        return cuboid;
    }
}
