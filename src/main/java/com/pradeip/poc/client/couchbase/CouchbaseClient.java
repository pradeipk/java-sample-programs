package com.pradeip.poc.client.couchbase;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.query.N1qlQuery;
import com.couchbase.client.java.query.N1qlQueryResult;

public class CouchbaseClient {

	static Bucket bucket;
	static String bucketName = "rules";

	public static void main(String[] args) {

		try {
			CouchbaseConnectionFactory.init(bucketName);
			bucket = CouchbaseConnectionFactory.getBucket();

			N1qlQueryResult rowresult = bucket
					.query(N1qlQuery.simple(CouchbaseQueryBuilder.query_select_all + bucketName));
			System.out.println(rowresult.allRows().get(0));

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
