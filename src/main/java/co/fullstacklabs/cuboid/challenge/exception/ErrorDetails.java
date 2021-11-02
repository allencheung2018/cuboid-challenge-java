package co.fullstacklabs.cuboid.challenge.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorDetails {
    public ErrorDetails(String message2, String description) {
        message = message2;
        details = description;
    }
    private String message;
    private String details;
}
