package ru.fadeev.Lists;

import java.util.List;

public class MergeList {

	public static <T extends Comparable<T>> void listInList(List<T> list1, List<T> list2) {
		int i = 0, j = 0;
		while (j < list2.size()) {
			while (i < list1.size() && list1.get(i).compareTo(list2.get(j)) < 0) {
				i++;
			}
			list1.add(i, list2.get(j));
			i++;
			j++;
		}
	}
}
