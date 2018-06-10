package mx.jccg.school.micro.services.core.persistence.entities;

import javax.persistence.Column;
import java.util.Date;

/**
 *
 * @author Cristian Jaramillo (cristian_gerar@hotmail.com)
 */
public interface IWithUpdatedAt
{

    /**
     *
     * @return
     */
    Date getUpdatedAt();

    /**
     *
     * @param updatedAt
     */
    void setUpdatedAt(Date updatedAt);

}
