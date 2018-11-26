package com.corejava.java8.features.lambda;

public class ScopeExperiment {

	private String value = "Enclosing scope value";

	public static void main(String[] args) {
		System.out.println(new ScopeExperiment().scopeExperiment());
	}

	public String scopeExperiment() {

		Experiment exp = new Experiment() {
			String value = "Inner class value";

			@Override
			public String method(String str) {
				return this.value;
			}
		};

		String resultInnerClass = exp.method("");

		Experiment expLambda = parameter -> {
			String value = "Lambda value";
			return this.value;
		};

		String resultLambda = expLambda.method("");

		return "Results: resultIC = " + resultInnerClass + ", resultLambda = " + resultLambda;
	}
}
