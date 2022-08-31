public class Test { 
    //aadwqe 
    static int[] arr() {
        //함수 arr() 선언. 실행 후 int의 배열(int[])을 리턴.
        //static함수인 main()에서 arr()을 호출한다(?)
        int a[] = new int[4]; 
        //2.arr()함수. a 변수는 4개짜리 배열이라고 선언. a는 0,1,2,3 인덱스. 
        int b = a.length; 
        // 3.arr()함수. b라는 함수에 a의 길이를 넣음. b=4.
        for(int i = 0; i < b; i++) 
        // 4.arr()함수. 반복문으로 배열 a에 값을 넣음. i는 b보다 작을 때까지 증가하면서 반복. 즉 i는 0~3.
            a[i]=i; 
            //4개짜리 배열 a에 a[0]=0부터 a[3]=3까지 저장됨.
        return a; 
        //return {0,1,2,3}이 됨.  
    }
    public static void main(String[] args) {
        int a[] = arr(); 
        // 1.main() 함수. int타입의 배열을 선언, 초기값으로 함수 arr()의 리턴값 사용.
        //6.변수 a에 값을 세팅. int a[] = {0,1,2,3}.
        for(int i = 0 ; i < a.length; i++)
            System.out.print(a[i] + " ");
            //반복문 돌면서 문자열 만들어 출력. i가 a.length(=4)보다 작을 때까지, 즉 3까지 출력. 
            // a[i] + " "에 의해 배열 값 뒤에 빈칸 하나씩 추가 출력. 
    }
}
