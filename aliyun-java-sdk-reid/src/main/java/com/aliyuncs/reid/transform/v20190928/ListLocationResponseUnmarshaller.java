/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.reid.transform.v20190928;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid.model.v20190928.ListLocationResponse;
import com.aliyuncs.reid.model.v20190928.ListLocationResponse.LocationInfoItem;
import com.aliyuncs.reid.model.v20190928.ListLocationResponse.LocationInfoItem.RectRoi;
import com.aliyuncs.reid.model.v20190928.ListLocationResponse.LocationInfoItem.RectRoi.Point;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLocationResponseUnmarshaller {

	public static ListLocationResponse unmarshall(ListLocationResponse listLocationResponse, UnmarshallerContext _ctx) {
		
		listLocationResponse.setRequestId(_ctx.stringValue("ListLocationResponse.RequestId"));
		listLocationResponse.setErrorCode(_ctx.stringValue("ListLocationResponse.ErrorCode"));
		listLocationResponse.setErrorMessage(_ctx.stringValue("ListLocationResponse.ErrorMessage"));
		listLocationResponse.setSuccess(_ctx.booleanValue("ListLocationResponse.Success"));

		List<LocationInfoItem> locationInfoItems = new ArrayList<LocationInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLocationResponse.LocationInfoItems.Length"); i++) {
			LocationInfoItem locationInfoItem = new LocationInfoItem();
			locationInfoItem.setExternalId(_ctx.stringValue("ListLocationResponse.LocationInfoItems["+ i +"].ExternalId"));
			locationInfoItem.setLocationType(_ctx.stringValue("ListLocationResponse.LocationInfoItems["+ i +"].LocationType"));
			locationInfoItem.setStatus(_ctx.integerValue("ListLocationResponse.LocationInfoItems["+ i +"].Status"));
			locationInfoItem.setStoreId(_ctx.longValue("ListLocationResponse.LocationInfoItems["+ i +"].StoreId"));
			locationInfoItem.setGmtCreate(_ctx.longValue("ListLocationResponse.LocationInfoItems["+ i +"].GmtCreate"));
			locationInfoItem.setParentLocationId(_ctx.longValue("ListLocationResponse.LocationInfoItems["+ i +"].ParentLocationId"));
			locationInfoItem.setGmtModified(_ctx.longValue("ListLocationResponse.LocationInfoItems["+ i +"].GmtModified"));
			locationInfoItem.setLocationName(_ctx.stringValue("ListLocationResponse.LocationInfoItems["+ i +"].LocationName"));
			locationInfoItem.setLayerType(_ctx.stringValue("ListLocationResponse.LocationInfoItems["+ i +"].LayerType"));
			locationInfoItem.setLocationId(_ctx.longValue("ListLocationResponse.LocationInfoItems["+ i +"].LocationId"));

			List<RectRoi> rectRois = new ArrayList<RectRoi>();
			for (int j = 0; j < _ctx.lengthValue("ListLocationResponse.LocationInfoItems["+ i +"].RectRois.Length"); j++) {
				RectRoi rectRoi = new RectRoi();

				List<Point> points = new ArrayList<Point>();
				for (int k = 0; k < _ctx.lengthValue("ListLocationResponse.LocationInfoItems["+ i +"].RectRois["+ j +"].Points.Length"); k++) {
					Point point = new Point();
					point.setX(_ctx.floatValue("ListLocationResponse.LocationInfoItems["+ i +"].RectRois["+ j +"].Points["+ k +"].X"));
					point.setY(_ctx.floatValue("ListLocationResponse.LocationInfoItems["+ i +"].RectRois["+ j +"].Points["+ k +"].Y"));

					points.add(point);
				}
				rectRoi.setPoints(points);

				rectRois.add(rectRoi);
			}
			locationInfoItem.setRectRois(rectRois);

			locationInfoItems.add(locationInfoItem);
		}
		listLocationResponse.setLocationInfoItems(locationInfoItems);
	 
	 	return listLocationResponse;
	}
}