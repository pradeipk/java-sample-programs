package com.pradeip.poc.client.cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CassandraClient {

	public static void main(String[] args) {

	}

}

class CassandraConnector {

	private static Cluster cluster;

	private static Session session;

	public static void connect(String node, Integer port) {
		com.datastax.driver.core.Cluster.Builder b = Cluster.builder().addContactPoint(node);
		if (port != null) {
			b.withPort(port);
		}
		cluster = b.build();

		session = cluster.connect();
	}

	public static Session getSession() {
		return session;
	}

	public static void close() {
		session.close();
		cluster.close();
	}

	public void createKeyspace(String keyspaceName, String replicationStrategy, int replicationFactor) {
		StringBuilder sb = new StringBuilder("CREATE KEYSPACE IF NOT EXISTS ").append(keyspaceName)
				.append(" WITH replication = {").append("'class':'").append(replicationStrategy)
				.append("','replication_factor':").append(replicationFactor).append("};");

		String query = sb.toString();
		session.execute(query);
	}

}