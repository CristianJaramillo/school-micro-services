package mx.jccg.school.micro.services.core.persistence.entities;

import java.io.Serializable;

/**
 *
 * @param <T>
 */
public interface IWithId<T> extends Serializable
{
    /**
     *
     * @return
     */
    T getId();
}
