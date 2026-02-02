package streamApi;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OptionalDouble list = List.of(12,4,6,54,6,4)

.stream().mapToInt(i->i.valueOf(0)).average();

	}
}
