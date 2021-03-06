/*******************************************************************************
 * Copyright (c) 2013 GigaSpaces Technologies Ltd. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.cloudifysource.dsl.rest.response;

/**
 * A POJO representing a response to shutdownManagers command via the REST Gateway.
 * It holds the controllers details. 
 * 
 * @see {@link org.cloudifysource.rest.controllers.ManagementController.shutdownManagers()}
 * @author yael
 * @since 2.7.0
 */
public class ShutdownManagementResponse {
	private ControllerDetails[] controllers;

	public ControllerDetails[] getControllers() {
		return controllers;
	}

	public void setControllers(final ControllerDetails[] controllers) {
		this.controllers = controllers;
	}
}
