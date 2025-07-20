public class one2 {

	public static void main(String[] args) {
		String[] arr1= {"sanskruti","prachi","arti","rama","radha","sanskruti","prachi"};
		String[] arr2= new String[arr1.length];
		int k=0;
		for(int i=0;i<arr1.length-1;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i].equals(arr1[j])) {
					arr2[k++]=arr1[j];
					break;
				}
			}
		}
		for(int i=0;i<k;i++) {
			System.out.println(arr2[i]);
		}
		
	}

}
