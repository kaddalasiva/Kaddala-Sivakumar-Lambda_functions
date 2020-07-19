package java_8.Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class ManipulateString {
	public List<String> stringManipulate(List<String> list)
	{
		return list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
	}
}
