/**
 *  Copyright 2011 LiveRamp
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.liveramp.hank.storage.constant;

import com.liveramp.hank.config.DataDirectoriesConfigurator;
import com.liveramp.hank.coordinator.Domain;
import com.liveramp.hank.coordinator.DomainVersion;
import com.liveramp.hank.coordinator.DomainVersionPropertiesSerialization;
import com.liveramp.hank.storage.*;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;

public class ConstantStorageEngine implements StorageEngine {

  public static class Factory implements StorageEngineFactory {
    @Override
    public StorageEngine getStorageEngine(Map<String, Object> options, Domain domain) throws IOException {
      return new ConstantStorageEngine(options);
    }

    @Override
    public String getPrettyName() {
      return "Constant";
    }

    @Override
    public String getDefaultOptions() {
      return "---";
    }
  }

  public ConstantStorageEngine(Map<String, Object> options) {
  }

  @Override
  public Reader getReader(DataDirectoriesConfigurator configurator, int partitionNumber) throws IOException {
    throw new UnsupportedOperationException();
  }

  @Override
  public PartitionUpdater getUpdater(DataDirectoriesConfigurator configurator, int partitionNumber) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Compactor getCompactor(DataDirectoriesConfigurator configurator,
                                int partitionNumber) throws IOException {
    throw new UnsupportedOperationException();
  }

  @Override
  public Writer getCompactorWriter(DomainVersion domainVersion,
                                   PartitionRemoteFileOps partitionRemoteFileOps,
                                   int partitionNumber) throws IOException {
    throw new UnsupportedOperationException();
  }

  @Override
  public Writer getWriter(DomainVersion domainVersion,
                          PartitionRemoteFileOps partitionRemoteFileOps,
                          int partitionNumber) throws IOException {
    throw new UnsupportedOperationException();
  }

  @Override
  public Deleter getDeleter(DataDirectoriesConfigurator configurator, int partitionNumber)
      throws IOException {
    throw new UnsupportedOperationException();
  }

  @Override
  public ByteBuffer getComparableKey(ByteBuffer key) {
    throw new UnsupportedOperationException();
  }

  @Override
  public PartitionRemoteFileOpsFactory getPartitionRemoteFileOpsFactory() {
    return null;
  }

  @Override
  public PartitionRemoteFileOps getPartitionRemoteFileOps(int partitionNumber) throws IOException {
    return null;
  }

  @Override
  public RemoteDomainVersionDeleter getRemoteDomainVersionDeleter() throws IOException {
    throw new UnsupportedOperationException();
  }

  @Override
  public RemoteDomainCleaner getRemoteDomainCleaner() throws IOException {
    throw new UnsupportedOperationException();
  }

  @Override
  public DomainVersionPropertiesSerialization getDomainVersionPropertiesSerialization() {
    return null;
  }
}
