public class m20311 {
    public static void main(String[] args){
        int i=0;//1.
        int sum =0; //1.
        while (i<10) {//2.i가 10보다 작을 때까지 반복.
            i++;//3.i를 10번 1씩 증가. i는 10이 됨.
            if(i % 2 ==1)
                continue; //3.continue는 자신이 속한 반복문으로 점프하라는 의미. 즉 i가 홀수면 아래 코드는 실행하지 말고 while 반복문으로 돌아가라는 뜻.
                //즉 i가 2,4,6,8,10일 때만 아래로 넘어감.
            sum +=i;//4.2+4+6+8+10으로 증가. sum=30.
        }
        System.out.print(sum);
    }
}
