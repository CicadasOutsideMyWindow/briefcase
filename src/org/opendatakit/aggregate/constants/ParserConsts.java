/*
 * Copyright (C) 2009 Google Inc. 
 * Copyright (C) 2010 University of Washington.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.opendatakit.aggregate.constants;

/**
 * Constants used for parsing in ODK aggregate
 *
 * @author wbrunette@gmail.com
 * @author mitchellsundt@gmail.com
 */
public final class ParserConsts {

    private ParserConsts() {
    }

    public static final String FORM_ID_ATTRIBUTE_NAME = "id";

    public static final String FORWARD_SLASH = "/";

    public static final String FORWARD_SLASH_SUBSTITUTION = "&frasl;";

    /**
     * Namespace of ODK extensions to the OpenRosa standards
     */
    public static final String NAMESPACE_ODK = "http://www.opendatakit.org/xforms";
}
