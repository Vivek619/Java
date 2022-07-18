package garima_Demo_agile;

public class apidata {

	public String GetData() {
		String x = "{\r\n"
				+ "\"random\": 12,\r\n"
				+ "\"random_float\": 4.56,\r\n"
				+ "\"enum\": \"generator\",\r\n"
				+ "\"firstname\": \"Christina\",\r\n"
				+ "\"courses\":[\r\n"
				+ "{\r\n"
				+ "\"name\": \"Java\",\r\n"
				+ "\"price\": 400 \r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"name\": \"Selenium\",\r\n"
				+ "\"price\": 300\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}";
		

		return x;
	}
	
	//random = integer
	//random float = float (decimal)
}

/*
{
"random": 12,
"random_float": 4.56,
"enum": "generator",
"firstname": "Christy",
"courses":[
{
"name": "Java",
"price": 400 
},
{
"name": "Selenium",
"price": 300
}
]
}

*/