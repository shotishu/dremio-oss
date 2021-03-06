/*
 * Copyright (C) 2017 Dremio Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dremio.service.jobs;

import org.apache.calcite.rel.RelNode;

import com.dremio.exec.planner.PlannerPhase;
import com.dremio.service.job.proto.JobId;
import com.dremio.service.jobs.metadata.QueryMetadata;
/**
 * A job status listener that does nothing.
 */
public class NoOpJobStatusListener implements JobStatusListener {

  @Override
  public void jobSubmitted(JobId jobId) {
  }

  @Override
  public void planRelTansform(PlannerPhase phase, RelNode before, RelNode after, long millisTaken) {

  }

  @Override
  public void metadataCollected(QueryMetadata metadata) {
  }

  @Override
  public void jobFailed(Exception e) {
  }

  @Override
  public void jobCompleted() {
  }

  @Override
  public void jobCancelled() {
  }

}
