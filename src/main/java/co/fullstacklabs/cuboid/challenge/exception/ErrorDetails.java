package co.fullstacklabs.cuboid.challenge.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorDetails {
    private String message;
    private String details;

    public ErrorDetails(String message2, String description) {
        this.message = message2;
        this.details = description;
    }

    public String getDetails() {
        return details;
    }

    public String getMessage() {
        return message;
    }
}
