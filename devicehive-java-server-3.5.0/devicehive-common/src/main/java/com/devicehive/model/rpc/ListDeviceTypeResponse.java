package com.devicehive.model.rpc;

/*
 * #%L
 * DeviceHive Common Module
 * %%
 * Copyright (C) 2016 DataArt
 * %%
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
 * #L%
 */

import com.devicehive.shim.api.Action;
import com.devicehive.shim.api.Body;
import com.devicehive.vo.DeviceTypeVO;

import java.util.List;

public class ListDeviceTypeResponse extends Body {

    private List<DeviceTypeVO> deviceTypes;

    public ListDeviceTypeResponse(List<DeviceTypeVO> networks) {
        super(Action.LIST_DEVICE_TYPE_RESPONSE);
        this.deviceTypes = networks;
    }

    public List<DeviceTypeVO> getDeviceTypes() {
        return deviceTypes;
    }
}
