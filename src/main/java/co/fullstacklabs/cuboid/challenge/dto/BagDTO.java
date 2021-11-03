package co.fullstacklabs.cuboid.challenge.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

import co.fullstacklabs.cuboid.challenge.model.Bag;

import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BagDTO {
    private Long id;

    @NotNull(message = "Bag volume can't be null.")
    private Double volume;

    @NotNull(message = "Bag title can't be null.")
    @Size(min = 1, max = Bag.TITLE_MAX_SIZE, message = "Bag title maximum size is " + Bag.TITLE_MAX_SIZE + " characters.")
    private String title;
    private Double payloadVolume;
    private Double availableVolume;
    private List<CuboidDTO> cuboids;

    public BagDTO(){
        
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Double getVolume() {
        return volume;
    }

    public Double getAvailableVolume() {
        return availableVolume;
    }

    public Double getPayloadVolume() {
        return payloadVolume;
    }

    public void setCuboids(List<CuboidDTO> cuboids) {
        this.cuboids = cuboids;
    }
    public List<CuboidDTO> getCuboids() {
        return cuboids;
    }

    public static class BagDTOBuilder{
        private Long id;
        private Double volume;
        private String title;

        public BagDTOBuilder(){

        }

        public BagDTOBuilder id(Long id){
            this.id = id;
            return this;
        }

        public BagDTOBuilder volume(Double v){
            this.volume = v;
            return this;
        }

        public BagDTOBuilder title(String t){
            this.title = t;
            return this;
        }

        public BagDTO build(){
            BagDTO bagDTO = new BagDTO();
            bagDTO.id = id;
            bagDTO.volume = volume;
            bagDTO.title = title;
            return bagDTO;
        }
    }


    public static BagDTOBuilder builder() {
        return new BagDTO.BagDTOBuilder();
    }
}
