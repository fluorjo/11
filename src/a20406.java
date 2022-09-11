//java를 이용해 3행 5열 배열 출력하는 코드
//형광펜 부분에 빈칸 채우는 문제. 행열 순서 주의.

public class a20406{
    public static void main(String[] args){
        int [][]array=new int[3][5]; 
    int n = 1;
    for(int i=0; i<3; i++) {
        for(int j=0; j<5; j++) {
            array[i][j] = j*3 + (i+1); //2열부터는 열 번호(0부터 시작)*3에다 1,2,3 더하는 식으로 요소 값 부여. 
            System.out.print(array[i][j]+ " ");
        }
        System.out.println();
    }
}
}
