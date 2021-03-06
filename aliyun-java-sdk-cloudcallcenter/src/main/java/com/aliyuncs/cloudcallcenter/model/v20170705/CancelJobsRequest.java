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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CancelJobsRequest extends RpcAcsRequest<CancelJobsResponse> {
	
	public CancelJobsRequest() {
		super("CloudCallCenter", "2017-07-05", "CancelJobs", "CloudCallCenter", "innerAPI");
	}

	private Boolean all;

	private List<String> jobIds;

	private String instanceId;

	private List<String> jobReferenceIds;

	private String groupId;

	private String scenarioId;

	public Boolean getAll() {
		return this.all;
	}

	public void setAll(Boolean all) {
		this.all = all;
		if(all != null){
			putQueryParameter("All", all.toString());
		}
	}

	public List<String> getJobIds() {
		return this.jobIds;
	}

	public void setJobIds(List<String> jobIds) {
		this.jobIds = jobIds;	
		if (jobIds != null) {
			for (int i = 0; i < jobIds.size(); i++) {
				putQueryParameter("JobId." + (i + 1) , jobIds.get(i));
			}
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public List<String> getJobReferenceIds() {
		return this.jobReferenceIds;
	}

	public void setJobReferenceIds(List<String> jobReferenceIds) {
		this.jobReferenceIds = jobReferenceIds;	
		if (jobReferenceIds != null) {
			for (int i = 0; i < jobReferenceIds.size(); i++) {
				putQueryParameter("JobReferenceId." + (i + 1) , jobReferenceIds.get(i));
			}
		}	
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getScenarioId() {
		return this.scenarioId;
	}

	public void setScenarioId(String scenarioId) {
		this.scenarioId = scenarioId;
		if(scenarioId != null){
			putQueryParameter("ScenarioId", scenarioId);
		}
	}

	@Override
	public Class<CancelJobsResponse> getResponseClass() {
		return CancelJobsResponse.class;
	}

}
