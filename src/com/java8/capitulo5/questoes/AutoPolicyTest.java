package com.java8.capitulo5.questoes;

public class AutoPolicyTest {

	public static void policyInNoFaultState(AutoPolicy policy) {
		System.out.println("The Auto policy:");
		System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n", policy.getAccountNumber(),
				policy.getMakeAndModel(), policy.getState(), (policy.isNoFaultState() ? "is" : "is not"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "yz");
		AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "MA");

		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
	}

}
