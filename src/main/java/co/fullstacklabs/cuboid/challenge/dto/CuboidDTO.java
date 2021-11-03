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

    public Long getBagId() {
        return bagId;
    }

    public Long getId() {
        return id;
    }

    public Float getDepth() {
        return depth;
    }

    public Float getHeight() {
        return height;
    }

    public Float getWidth() {
        return width;
    }

    public Double getVolume() {
        return volume;
    }

    public static class CuboidDTOBuilder{
        private Long id;
        private Float width;
        private Float height;
        private Float depth;
        private Double volume;
        private Long bagId;

        public CuboidDTOBuilder(){

        } 

        public CuboidDTOBuilder id(Long id){
            this.id = id;
            return this;
        }

        public CuboidDTOBuilder width(Float w){
            width = w;
            return this;
        }

        public CuboidDTOBuilder height(Float h){
            height = h;
            return this;
        }

        public CuboidDTOBuilder depth(Float d){
            depth = d;
            return this;
        }

        public CuboidDTOBuilder volume(Double v){
            volume = v;
            return this;
        }

        public CuboidDTOBuilder bagId(Long bid){
            bagId = bid;
            return this;
        }

        public CuboidDTO build(){
            CuboidDTO cuboidDTO = new CuboidDTO();
            cuboidDTO.id = id;
            cuboidDTO.width = width;
            cuboidDTO.height = height;
            cuboidDTO.depth = depth;
            cuboidDTO.volume = volume;
            cuboidDTO.bagId = bagId;
            return cuboidDTO;
        }
    }

    public static CuboidDTOBuilder builder() {
        return new CuboidDTO.CuboidDTOBuilder();
    }
}
