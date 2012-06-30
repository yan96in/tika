/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.tika.metadata;

public interface XMPIdq {

    String NAMESPACE_URI = "http://ns.adobe.com/xmp/identifier/qual/1.0/";

    String PREFIX = "xmpidq";

    String PREFIX_DELIMITER = ":";

    /**
     * A qualifier providing the name of the formal identification
     * scheme used for an item in the xmp:Identifier array.
     */
    Property SCHEME = Property.externalText(
            PREFIX + PREFIX_DELIMITER + "Scheme");

}