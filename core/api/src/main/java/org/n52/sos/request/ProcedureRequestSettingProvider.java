/*
 * Copyright (C) 2012-2020 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 as published
 * by the Free Software Foundation.
 *
 * If the program is linked with libraries which are licensed under one of
 * the following licenses, the combination of the program with the linked
 * library is not considered a "derivative work" of the program:
 *
 *     - Apache License, version 2.0
 *     - Apache Software License, version 1.0
 *     - GNU Lesser General Public License, version 3
 *     - Mozilla Public License, versions 1.0, 1.1 and 2.0
 *     - Common Development and Distribution License (CDDL), version 1.0
 *
 * Therefore the distribution of the program linked with libraries licensed
 * under the aforementioned licenses, is permitted by the copyright holders
 * if the distribution is compliant with both the GNU General Public
 * License version 2 and the aforementioned licenses.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 */
package org.n52.sos.request;

import org.n52.faroe.annotation.Configurable;
import org.n52.faroe.annotation.Setting;

/**
 * ProcedureRequestSettings for procedure request/response handling
 *
 * @author <a href="mailto:c.hollmann@52north.org">Carsten Hollmann</a>
 * @since 4.4.0
 * @deprecated inject the settings directly
 *
 */
@Deprecated
@Configurable
public class ProcedureRequestSettingProvider {
    public static final String ENCODE_FULL_CHILDREN_IN_DESCRIBE_SENSOR = "service.encodeFullChildrenInDescribeSensor";

    private boolean encodeFullChildrenInDescribeSensor;



    public boolean isEncodeFullChildrenInDescribeSensor() {
        return encodeFullChildrenInDescribeSensor;
    }

    @Setting(ProcedureRequestSettingProvider.ENCODE_FULL_CHILDREN_IN_DESCRIBE_SENSOR)
    public void setEncodeFullChildrenInDescribeSensor(final boolean encodeFullChildrenInDescribeSensor) {
        this.encodeFullChildrenInDescribeSensor = encodeFullChildrenInDescribeSensor;
    }

}
