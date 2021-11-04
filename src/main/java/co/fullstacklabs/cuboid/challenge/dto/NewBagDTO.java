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

    public NewBagDTO(NewBagDTOBuilder newBagDTOBuilder) {
        this.volume = newBagDTOBuilder.volume;
        this.title = newBagDTOBuilder.title;
    }

    public String getTitle() {
        return title;
    }
    
    public Double getVolume() {
        return volume;
    }

    public static class NewBagDTOBuilder{
        private Double volume;
        private String title;

        public NewBagDTOBuilder(){

        }

        public NewBagDTOBuilder volume(Double volume){
            this.volume = volume;
            return this;
        }

        public NewBagDTOBuilder title(String title){
            this.title = title;
            return this;
        }

        public NewBagDTO build(){
            NewBagDTO newBagDTO = new NewBagDTO(this);
            return newBagDTO;
        }
    }

    public static NewBagDTOBuilder builder(){
        return new NewBagDTO.NewBagDTOBuilder();
    }
}
