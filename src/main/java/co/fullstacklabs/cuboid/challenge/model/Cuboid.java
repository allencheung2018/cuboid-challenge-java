package co.fullstacklabs.cuboid.challenge.model;

import lombok.Getter;
import lombok.Setter;

import java.util.function.IntPredicate;

import javax.persistence.*;

import co.fullstacklabs.cuboid.challenge.dto.BagDTO;
import co.fullstacklabs.cuboid.challenge.dto.CuboidDTO;

/**
 * Entity representing Cuboids table
 *
 * @author FullStack Labs
 * @version 1.0
 * @since 2021-10-22
 */
@Entity
@Table(name = "CUBOIDS")
@Getter
@Setter
public class Cuboid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "WIDTH", nullable = false)
    private float width;
    @Column(name = "HEIGHT", nullable = false)
    private float height;
    @Column(name = "DEPTH", nullable = false)
    private float depth;
    @ManyToOne
    @JoinColumn(name = "BAG_ID", nullable = false)
    private Bag bag;
    public void setId(Long id2) {
        id = id2;
    }
    public void setWidth(float width2) {
        width = width2;
    }
    public void setHeight(float height2) {
        height = height2;
    }
    public void setDepth(float depth2) {
        depth = depth2;
    }
    public void setBag(Bag bag2) {
        bag = bag2;
    }
    public float getWidth() {
        return width;
    }
    public float getHeight() {
        return height;
    }
    public float getDepth() {
        return depth;
    }
    public Long getId() {
        return id;
    }
    public Bag getBag() {
        return bag;
    }
}
