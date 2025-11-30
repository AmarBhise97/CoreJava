package Intermadatory_op;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Custom_Two {
	public static void main(String[] args) {
		List<Integer> list_1 = new ArrayList<Integer>();
		list_1.add(10);
		list_1.add(20);
		list_1.add(30);

		List<Integer> list_2 = new ArrayList<Integer>();
		list_2.add(40);
		list_2.add(50);
		list_2.add(60);

		List<Integer> list_3 = new ArrayList<Integer>();
		list_3.add(70);
		list_3.add(80);
		list_3.add(90);

		List<Integer> list_4 = new ArrayList<Integer>();
		list_4.add(100);
		list_4.add(110);
		list_4.add(120);

		List<List<Integer>> list_1_1 = new ArrayList<List<Integer>>();
		list_1_1.add(list_1);
		list_1_1.add(list_2);

		List<List<Integer>> list_2_2 = new ArrayList<List<Integer>>();
		list_2_2.add(list_3);
		list_2_2.add(list_4);

		List<List<List<Integer>>> list_1_1_1 = new ArrayList<List<List<Integer>>>();
		list_1_1_1.add(list_2_2);
		list_1_1_1.add(list_1_1);

		list_1_1_1.stream().forEach((i) -> {
			i.stream().forEach((j) -> {
				j.stream().forEach((k) -> {
					System.out.println(k * 2);
				});
			});
		});
		System.out.println("=====================================================");
		list_1_1_1.stream().forEach(new Three_DD());

	}
}

class Three_DD implements Consumer<List<List<Integer>>> {

	public void accept(List<List<Integer>> t) {
		t.stream().forEach(new Two_DD());
		System.out.println("#############################################################");

	}

}

class Two_DD implements Consumer<List<Integer>> {
	public void accept(List<Integer> t) {
		t.stream().forEach(new One_DD());
		System.out.println("******************************************************");
	}

}

class One_DD implements Consumer<Integer> {
	public void accept(Integer t) {
		System.out.println(t*2);
	}

}
