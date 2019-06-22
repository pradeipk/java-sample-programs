package com.pradeip.poc.client.couchbase;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;
import com.couchbase.client.java.env.CouchbaseEnvironment;
import com.couchbase.client.java.env.DefaultCouchbaseEnvironment;

public class CouchbaseConnectionFactory {

	private static Bucket bucket =  null;

	public static void init(String bucketName) throws Exception {

		CouchbaseEnvironment env = DefaultCouchbaseEnvironment.builder().build();
		Cluster cluster = CouchbaseCluster.create(env, "localhost").authenticate("Administrator", "password");
		bucket = cluster.openBucket(bucketName);
	}

	public static Bucket getBucket() throws Exception {
		if(bucket == null)
			throw new Exception("Connection not initialised.");
		return bucket;
	}

}
