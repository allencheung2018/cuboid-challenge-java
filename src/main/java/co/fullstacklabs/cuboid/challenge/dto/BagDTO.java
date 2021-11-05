package co.fullstacklabs.cuboid.challenge.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

import co.fullstacklabs.cuboid.challenge.model.Bag;
import co.fullstacklabs.cuboid.challenge.model.Cuboid;

import javax.validation.constraints.Size;

import antlr.PythonCharFormatter;

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
    private List<CuboidDTO> cuboids;;

    public BagDTO(){
    
    }

    public BagDTO(BagDTOBuilder bagDTOBuilder) {
        this.id = bagDTOBuilder.id;
        this.volume = bagDTOBuilder.volume;
        this.title = bagDTOBuilder.title;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Double getVolume() {
        return volume;
    }
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPayloadVolume() {
        payloadVolume = (double) 0;
        if(cuboids!=null && cuboids.size()>0){
            for(CuboidDTO cuboidDTO : cuboids) 
            {
                Double d = cuboidDTO.getVolume();
                payloadVolume = payloadVolume + d;
            }
        }
        return payloadVolume;
    }
    public void setPayloadVolume(Double payloadVolume) {
        this.payloadVolume = payloadVolume;
    }

    public Double getAvailableVolume() {
        availableVolume = (double) 0;
        availableVolume = volume - payloadVolume;
        return availableVolume;
    }
    public void setAvailableVolume(Double availableVolume) {
        this.availableVolume = availableVolume;
    }

    public List<CuboidDTO> getCuboids() {
        return cuboids;
    }
    public void setCuboids(List<CuboidDTO> cuboids) {
        this.cuboids = cuboids;
    }

    public static BagDTOBuilder builder(){
        return new BagDTO.BagDTOBuilder();
    }

    public static class BagDTOBuilder{
        private Long id;
        private Double volume;
        private String title;

        public BagDTOBuilder(){}

        public BagDTOBuilder id(Long id){
            this.id = id;
            return this;
        }

        public BagDTOBuilder volume(Double volume){
            this.volume = volume;
            return this;
        }

        public BagDTOBuilder title(String title){
            this.title = title;
            return this;
        }

        public BagDTO build(){
            BagDTO bagDTO = new BagDTO(this);
            return bagDTO;
        }
    }
}
