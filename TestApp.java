package com.techiebirendra;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestApp {
	public static void main(String[] args) {
		List<String> txnArr = new ArrayList<>();
		txnArr.add("purse");
		txnArr.add("purse");
		txnArr.add("belt");
		txnArr.add("jeans");
		txnArr.add("jeans");
		System.out.println(new TestApp().groupByTxn(txnArr));
	}

	public List<String> groupByTxn(List<String> txnArr) {
		Map<String, Long> txnMap = txnArr.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		List<String> output = txnMap.entrySet().stream()
				.sorted(Map.Entry.<String, Long>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
				.map(e -> e.getKey() + " " + e.getValue()).collect(Collectors.toList());
		return output;
	}
}
