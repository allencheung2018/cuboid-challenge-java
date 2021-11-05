package co.fullstacklabs.cuboid.challenge.dto;

import lombok.*;

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



    public CuboidDTO(){}

    public CuboidDTO(CuboidDTOBuilder cuboidDTOBuilder) {
        this.id = cuboidDTOBuilder.id;
        this.bagId = cuboidDTOBuilder.bagId;
        this.width = cuboidDTOBuilder.width;
        this.height = cuboidDTOBuilder.height;
        this.depth = cuboidDTOBuilder.depth;
        this.volume = cuboidDTOBuilder.volume;
    }

    public Long getBagId() {
        return bagId;
    }
    public void setBagId(Long bagId) {
        this.bagId = bagId;
    }

    public Float getWidth() {
        return width;
    }
    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHeight() {
        return height;
    }
    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getDepth() {
        return depth;
    }
    public void setDepth(Float depth) {
        this.depth = depth;
    }

    public Double getVolume() {
        volume = (double) (width*height*depth);
        return volume;
    }
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public static class CuboidDTOBuilder{
        private Long id;
        private Float width;
        private Float height;
        private Float depth;
        private Long bagId;
        private Double volume;

        CuboidDTOBuilder(){}

        public CuboidDTOBuilder id(Long id){
            this.id = id;
            return this;
        }

        public CuboidDTOBuilder bagId(Long bagId){
            this.bagId = bagId;
            return this;
        }

        public CuboidDTOBuilder width(Float width){
            this.width = width;
            return this;
        }

        public CuboidDTOBuilder height(Float height){
            this.height = height;
            return this;
        }

        public CuboidDTOBuilder depth(Float depth){
            this.depth = depth;
            return this;
        }

        public CuboidDTOBuilder volume(Double volume){
            this.volume = volume;
            return this;
        }

        public CuboidDTO build(){
            CuboidDTO cuboidDTO = new CuboidDTO(this);
            return cuboidDTO;
        }
    }

    public static CuboidDTOBuilder builder(){
        return new CuboidDTO.CuboidDTOBuilder();
    }
}
