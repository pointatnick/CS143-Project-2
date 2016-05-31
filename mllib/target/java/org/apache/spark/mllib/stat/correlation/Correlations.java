package org.apache.spark.mllib.stat.correlation;
// no position
/**
 * Delegates computation to the specific correlation object based on the input method name.
 */
public  class Correlations {
  static public  double corr (org.apache.spark.rdd.RDD<java.lang.Object> x, org.apache.spark.rdd.RDD<java.lang.Object> y, java.lang.String method) { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.linalg.Matrix corrMatrix (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> X, java.lang.String method) { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.stat.correlation.Correlation getCorrelationFromName (java.lang.String method) { throw new RuntimeException(); }
}
