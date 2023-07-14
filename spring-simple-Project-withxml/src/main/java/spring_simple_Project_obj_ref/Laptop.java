package spring_simple_Project_obj_ref;

public class Laptop {
	Processor processor;
	public void setprocessor(Processor processor)
	{
		this.processor = processor;
	}
	public void laptopName() {
		System.out.println("my laptop has");
		processor.processorName();
	}

}
