/*
 * 3D City Database Web Feature Service
 * http://www.3dcitydb.org/
 * 
 * Copyright 2014 - 2017
 * virtualcitySYSTEMS GmbH
 * Tauentzienstrasse 7b/c
 * 10789 Berlin, Germany
 * http://www.virtualcitysystems.de/
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package vcs.citydb.wfs.config.operation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DescribeFeatureTypeOutputFormatType")
@XmlEnum
public enum DescribeFeatureTypeOutputFormat {
	@XmlEnumValue("application/gml+xml; version=3.1")
	GML3_1("application/gml+xml; version=3.1");
	
	private final String value;

	DescribeFeatureTypeOutputFormat(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static DescribeFeatureTypeOutputFormat fromValue(String value) {
        for (DescribeFeatureTypeOutputFormat c : DescribeFeatureTypeOutputFormat.values()) {
            if (c.value.equals(value))
                return c;
        }

        return null;
    }
}
