package mx.jccg.school.micro.services.core.persistence.entities;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author Cristian Jaramillo (cristian_gerar@hotmail.com)
 */
@MappedSuperclass
public abstract class Model implements IModel
{
    @Temporal(value = TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    @Temporal(value = TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;

    /**
     *
     */
    public Model()
    {
        super();
    }

    /**
     *
     * @return
     */
    @Override
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return
     */
    @Override
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     *
     * @param updatedAt
     */
    @Override
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
