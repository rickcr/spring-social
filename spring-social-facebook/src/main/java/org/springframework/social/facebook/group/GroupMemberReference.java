/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.facebook.group;

import org.springframework.social.facebook.shared.Reference;

/**
 * Model class representing a reference to a group member.
 * @author Craig Walls
 */
public class GroupMemberReference extends Reference {
	
	private final boolean administrator;

	public GroupMemberReference(String id, String name, boolean administrator) {
		super(id, name);
		this.administrator = administrator;
	}

	public boolean isAdministrator() {
		return administrator;
	}
	
}