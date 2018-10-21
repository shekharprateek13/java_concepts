package concepts.implementation.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author akhaurishekhar
 */
public class JavaStreamsAdvancedOperations {

	public static void collectOperations(List<Employee> employeeList){
		/*
		 * Returns a Collector that accumulates the input elements into a new List. There are no guarantees on the type, mutability,
		 * serializability, or thread-safety of the List returned; if more control over the returned List is required, use 
		 * toCollection(Supplier).... 
		 */
		List<Employee> filteredListUsingCollect = employeeList.stream().filter(e -> e.getName().startsWith("D")).collect(Collectors.toList());
		System.out.println(filteredListUsingCollect.getClass());
		System.out.println(filteredListUsingCollect);

		/*
		 * Returns a Collector that accumulates the input elements into a new Set. There are no guarantees on the type, mutability, 
		 * serializability, or thread-safety of the Set returned; if more control over the returned Set is required, use toCollection(Supplier).
		 */
		Set<Employee> filteredSetUsingCollect = employeeList.stream().filter(e -> e.getName().startsWith("D")).collect(Collectors.toSet());
		System.out.println(filteredSetUsingCollect.getClass());
		System.out.println(filteredSetUsingCollect);

		/*
		 * Returns a Collector implementing a "group by" operation on input elements of type T, grouping elements according to a classification function, 
		 * and returning the results in a Map. The classification function maps elements to some key type K. The collector produces a Map<K, List<T>> whose 
		 * keys are the values resulting from applying the classification function to the input elements, and whose corresponding values are Lists containing 
		 * the input elements which map to the associated key under the classification function.
		 * There are no guarantees on the type, mutability, serializability, or thread-safety of the Map or List objects returned.
		 */
		Map<Integer, List<Employee>> employeeMapGroupedByAge = employeeList.stream().collect(Collectors.groupingBy(e -> e.getAge()));
		employeeMapGroupedByAge.entrySet().stream().forEach(e -> {
			System.out.println(e.getKey()+":"+e.getValue());
		});

		System.out.println("Print element using Bi Functions...");
		employeeMapGroupedByAge.forEach((age,employee) -> System.out.println(age+":"+employee));

		//Using Collectors Join........
		String phrase = employeeList.stream().filter(e -> e.getAge() < 25).map( e -> e.getName()).collect(Collectors.joining(", ","In USA "," are not eligible for getting Car Rental Discount!"));
		System.out.println(phrase);

		//Using Collectors toMap function....
		Map<Integer, String> map = employeeList.stream().collect(Collectors.toMap(Employee::getAge,Employee::getName,(name1,name2) -> name1 + "|" + name2));
		System.out.println(map);
	}

	public static void flatMapOperations(){
		
		List<Company> companyList = new ArrayList<Company>();
		IntStream.range(1,4).forEach(index -> companyList.add(new Company("Company"+index,new ArrayList<Employee>())));
		companyList.forEach(c -> 
							IntStream.range(1, 4)
								.forEach(index -> 
										  c.getEmployeesList().add(new Employee("Employee_"+index,index*10))
								)
							);
		System.out.println(companyList);
		companyList.stream()
					.flatMap(c -> c.getEmployeesList().stream())
						.forEach(e -> System.out.println(e.getName()));
	}

	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
				new Employee("Tom Jones Mitchell Bright", 45), 
				new Employee("Harry Major", 25),
				new Employee("Ethan Hardy", 65),
				new Employee("Nancy Smith", 18),
				new Employee("Deborah Sprightly", 25),
				new Employee("Max", 18),
				new Employee("Peter", 23),
				new Employee("Pamela", 23),
				new Employee("David", 18)
				);
		
//	collectOperations(employeeList);
	flatMapOperations();

	}
}