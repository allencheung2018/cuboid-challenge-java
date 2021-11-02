package co.fullstacklabs.cuboid.challenge.dto;

import lombok.*;

import java.util.function.IntPredicate;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CuboidDTO {
    private Long id;

    @NotNull(message = "Cuboid width can't be null.")
    private Float width;

    @NotNull(message = "Cuboid height can't be null.")
    private Float height;

    @NotNull(message = "Cuboid depth can't be null.")
    private Float depth;

    private Double volume;

    @NotNull(message = "Cuboid related bag can't be null.")
    private Long bagId;

    private static CuboidDTO cuboidDTO;

    public static CuboidDTO builder() {
        return cuboidDTO = new CuboidDTO();
    }


    public long getBagId() {
        return id;
    }


    public CuboidDTO width(float w) {
        width = w;
        return this;
    }


    public CuboidDTO height(float h) {
        height = h;
        return this;
    }


    public CuboidDTO depth(float d) {
        depth = d;
        return this;
    }


    public CuboidDTO volume(double v) {
        volume = v;
        return this;
    }


    public CuboidDTO bagId(long id) {
        this.bagId = id;
        return this;
    }

    public CuboidDTO id(long id) {
        this.id = id;
        return this;
    }

    public CuboidDTO build(){
        return this;
    }


    public long getId() {
        return id;
    }


    public Float getWidth() {
        return width;
    }


    public Float getDepth() {
        return depth;
    }


    public Float getHeight() {
        return height;
    }


    public Double getVolume() {
        return volume;
    }
}
