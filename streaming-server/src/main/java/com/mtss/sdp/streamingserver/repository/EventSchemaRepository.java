package com.mtss.sdp.streamingserver.repository;


import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.mtss.sdp.streamingserver.entity.EventSchemaEntity;
import com.mtss.sdp.streamingserver.entity.EventSchemaKey;

@Repository
public interface EventSchemaRepository extends CassandraRepository<EventSchemaEntity, EventSchemaKey>{

}
