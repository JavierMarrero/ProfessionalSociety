/*
 * Copyright (C) 2022 Jose
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cu.edu.cujae.ed.snetwork.utils;

import java.util.UUID;

/**
 *
 * @author Jose
 * @param <T>
 */
public final class Notification<T>
{
    private final NotificationType type;
    private final UUID uuid;
    private final String message;
    private final T data;

    public Notification(NotificationType type, String message, T data, UUID uuid)
    {
        this.type = type;
        this.message = message;
        this.data = data;
        this.uuid = uuid;
    }

    /**
     * @return the type
     */
    public NotificationType getType()
    {
        return type;
    }

    /**
     * @return the message
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * @return the data
     */
    public T getData()
    {
        return data;
    }

    /**
     * @return the uuid
     */
    public UUID getUuid()
    {
        return uuid;
    }
    
       
    
}
