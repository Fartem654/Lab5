package ru.fadeev.Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueElem {

	static public <T> Queue<T> formQueue(List<T> list){
		Queue<T> result = new LinkedList<>();
		result.addAll(list);
		result.addAll(list.reversed());
		return result;
	}

}
