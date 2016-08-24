/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.ranger.plugin.policyresourcematcher;

import java.util.Map;

import org.apache.ranger.plugin.model.RangerPolicy;
import org.apache.ranger.plugin.model.RangerPolicy.RangerPolicyResource;
import org.apache.ranger.plugin.model.RangerServiceDef;
import org.apache.ranger.plugin.policyengine.RangerAccessResource;
import org.apache.ranger.plugin.resourcematcher.RangerResourceMatcher;

public interface RangerPolicyResourceMatcher {
	void setServiceDef(RangerServiceDef serviceDef);

	void setPolicy(RangerPolicy policy);

	void setPolicyResources(Map<String, RangerPolicyResource> policyResources);

	void init();

	RangerResourceMatcher getResourceMatcher(String resourceName);

	boolean isMatch(RangerAccessResource resource);

	boolean isMatch(Map<String, RangerPolicyResource> resources);

	boolean isCompleteMatch(RangerAccessResource resource);

	boolean isHeadMatch(RangerAccessResource resource);

	boolean isExactHeadMatch(RangerAccessResource resource);

	boolean isCompleteMatch(Map<String, RangerPolicyResource> resources);

	StringBuilder toString(StringBuilder sb);
}
