package co.fullstacklabs.cuboid.challenge.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

import co.fullstacklabs.cuboid.challenge.model.Bag;

import javax.validation.constraints.Size;
import java.util.List;
import java.util.function.IntPredicate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BagDTO {
    private static BagDTO bagDTO;
    private Long id;

    @NotNull(message = "Bag volume can't be null.")
    private Double volume;

    @NotNull(message = "Bag title can't be null.")
    @Size(min = 1, max = Bag.TITLE_MAX_SIZE, message = "Bag title maximum size is " + Bag.TITLE_MAX_SIZE + " characters.")
    private String title;
    private Double payloadVolume;
    private Double availableVolume;
    private List<CuboidDTO> cuboids;

    public static BagDTO builder() {
        bagDTO = new BagDTO();
        return bagDTO;
    }

    public BagDTO id(long id){
        this.id = id;
        return this;
    }

    public BagDTO title(String t){
        this.title = t;
        return this;
    }

    public BagDTO volume(double v){
        this.volume = v;
        return this;
    }

    public BagDTO build() {
        return this;
    }

    public long getId() {
        return id;
    }

    public void setCuboids(List<CuboidDTO> list) {
        cuboids = list;
    }

    public String getTitle() {
        return title;
    }

    public Double getVolume() {
        return volume;
    }

    public List<CuboidDTO> getCuboids() {
        return cuboids;
    }

    public Double getPayloadVolume() {
        return payloadVolume;
    }

}
