package co.fullstacklabs.cuboid.challenge.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import co.fullstacklabs.cuboid.challenge.model.Bag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewBagDTO {
    @NotNull(message = "Bag volume can't be null.")
    private Double volume;

    @NotNull(message = "Bag title can't be null.")
    @Size(max = Bag.TITLE_MAX_SIZE, message = "Bag title maximum size is " + Bag.TITLE_MAX_SIZE + " characters.")
    private String title;

    private static NewBagDTO newBagDTO;

    public String getTitle() {
        return title;
    }
    public NewBagDTO title(String title){
        this.title = title;
        return this;
    }

    public double getVolume() {
        return volume;
    }

    public NewBagDTO volume(double vol){
        volume = vol;
        return this;
    }

    public static NewBagDTO builder() {
        newBagDTO = new NewBagDTO();
        return newBagDTO;
    }
    public NewBagDTO build() {
        return newBagDTO;
    }
}
