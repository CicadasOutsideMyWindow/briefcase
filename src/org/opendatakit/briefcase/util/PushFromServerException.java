/*
 * Copyright (C) 2018 Nafundi
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
package org.opendatakit.briefcase.util;

import static java.util.stream.Collectors.joining;

import java.util.List;
import org.opendatakit.briefcase.model.FormStatus;
import org.opendatakit.briefcase.reused.BriefcaseException;

public class PushFromServerException extends BriefcaseException {
  public PushFromServerException(List<FormStatus> forms) {
    super("Failure pushing forms to server. FormIds: " + forms.stream().map(f -> f.getFormDefinition().getFormId()).collect(joining(", ")));
  }
}