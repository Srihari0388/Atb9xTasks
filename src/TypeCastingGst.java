public class TypeCastingGst{
	public static void main(String Args[]){
	int purchased=2000;
	int cgst=9;
	int sgst=9;
	float total;
	float gst;
	gst= (float)(purchased*(cgst+sgst))/100;
	total= (float) gst+purchased;
	System.out.println(gst);
	System.out.println(total);
	}
}