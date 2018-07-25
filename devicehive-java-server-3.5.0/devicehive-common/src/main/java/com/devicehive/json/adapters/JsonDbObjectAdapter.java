package com.devicehive.json.adapters;

/*
 * #%L
 * DeviceHive Common Dao Interfaces
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

import com.devicehive.model.JsonStringWrapper;
import com.google.gson.*;

import java.lang.reflect.Type;


public class JsonDbObjectAdapter implements JsonSerializer<JsonStringWrapper>, JsonDeserializer<JsonStringWrapper> {

    @Override
    public JsonStringWrapper deserialize(JsonElement jsonElement, Type type,
                                         JsonDeserializationContext jsonDeserializationContext)
        throws JsonParseException {
        JsonStringWrapper jsonStringWrapper = new JsonStringWrapper();
        jsonStringWrapper.setJsonString(jsonElement.toString());
        return jsonStringWrapper;
    }

    @Override
    public JsonElement serialize(JsonStringWrapper jsonStringWrapper, Type type,
                                 JsonSerializationContext jsonSerializationContext) {
        return new JsonParser().parse(jsonStringWrapper.getJsonString());
    }
}
