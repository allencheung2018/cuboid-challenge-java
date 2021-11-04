package co.fullstacklabs.cuboid.challenge.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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

    public void setBag(Bag bag) {
        this.bag = bag;
    }
    public Bag getBag() {
        return bag;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public float getWidth() {
        return width;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public float getHeight() {
        return height;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }
    public float getDepth() {
        return depth;
    }
}
