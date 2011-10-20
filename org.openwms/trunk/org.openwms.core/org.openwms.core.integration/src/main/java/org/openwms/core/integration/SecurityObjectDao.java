/*
 * openwms.org, the Open Warehouse Management System.
 *
 * This file is part of openwms.org.
 *
 * openwms.org is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * openwms.org is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software. If not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.openwms.core.integration;

import java.util.List;

import org.openwms.core.domain.system.usermanagement.Grant;
import org.openwms.core.domain.system.usermanagement.SecurityObject;

/**
 * A SecurityDao.
 * 
 * @author <a href="mailto:scherrer@openwms.org">Heiko Scherrer</a>
 * @version $Revision$
 * @since 0.1
 */
public interface SecurityObjectDao {

    /**
     * 
     * FIXME [scherrer] Comment this
     * 
     * @return
     */
    List<SecurityObject> findAll();

    /**
     * 
     * FIXME [scherrer] Comment this
     * 
     * @param moduleName
     * @return
     */
    List<Grant> findAllOfModule(String moduleName);

    /**
     * 
     * FIXME [scherrer] Comment this
     * 
     * @param entity
     * @return
     */
    SecurityObject merge(SecurityObject entity);

    /**
     * 
     * FIXME [scherrer] Comment this
     * 
     * @param grants
     */
    void delete(List<Grant> grants);
}
