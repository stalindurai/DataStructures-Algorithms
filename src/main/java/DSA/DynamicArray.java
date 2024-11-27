package DSA;

/*
* * 1) Did I understand the problem? -> If yes, go to next step !!
     *
     * What is the input(s) type? -- Integer Array
     * What is the expected output? -- Integer Array
     * Do I have constraints to solve the problem? -- Yes
     * Do I have all informations to go to next step!! -- Yes
//     * How big is your test data set will be?
     *
     * 2) Test data set
     *
     * Minimum of 3 data set !!
     * Positive, Edge, Negative
     * {3,-3}, {1,1,1,1,1,1,1}{1,5,3,3,4,6,7,7,8}
     * Validate with the interviewer if the data set is fine by his/her assumptions
     *
     * 3) Do I know how to solve it? -- Yes
     *
     * Yes - great, is there an alternate? -- Yes
     *
     * 4) Ask for hint (If you do not know how to solve)
     *
     * 5) Do I know alternate solutions as well? -- Yes
     *
     * No - That is still fine, proceed to solve by what you know !!
     *
     * 6) If you know alternate solutions -> find out the O Notations
     * (Performance)
     *
     * Then, explain either both or the best (depends on the time)
     *
     * Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
     * Approach 2: Write down the options and benefits and code the best
     *
     * 7) Start always with Psuedo code // Bruteforce
     * 1. Create an Integer array of size n
     * 2. Check if (arr[n-2] !=0)
     *    Create another Integer array of size (n*2)
     *    Copy the contents of the first array to the second array
     *
     * 8) Implement them in the code (editor)
     *
     * 9) Test against the different data set
     *
     * 10) If it fails, debug them to solve it !!
* */

public class DynamicArray {

    private int[] arr;
    private int count;

    public DynamicArray(int size){
        arr =new int[size];
        count=0;
    }

    public void insert(int ele){

        //check if count==arr.length
        if(count == arr.length){
            //create a new temp array double the size
            int[] temp = new int[arr.length*2];
            //copy the elements into the new array
            for(int i=0;i<arr.length;i++){
                temp[i] = arr[i];
            }
            //change the reference
            arr=temp;
        }
        arr[count] = ele;
        count++;
    }

    public void printArray(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public void delete(){
        count--;
        arr[count] = 0;
    }

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray(3);

        //adding an element
        da.insert(2);
        da.insert(7);
        da.insert(5);

        //print array
//        da.printArray();

        //delete an element
//        da.delete();

        da.insert(9);

        //print array
        da.printArray();

    }
}
