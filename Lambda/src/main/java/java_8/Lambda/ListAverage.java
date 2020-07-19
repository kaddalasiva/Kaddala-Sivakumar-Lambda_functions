package java_8.Lambda;

import java.util.*;

public class ListAverage {
	public double avg(List<Integer> list)
	{
		return list.stream().mapToInt(number -> number.intValue()).average().getAsDouble();
	}
}
