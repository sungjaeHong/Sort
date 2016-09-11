## Insertion Sort (삽입정렬)
삽입정렬은 모든 요소를 앞에서부터 차례대로 비교하며 자신의 위치를 찾아 삽입하는 알고리즘이다.

[ 정렬 전 배열 ]
2, 3, 1, 5, 4

<2> [3]  1   5   4  
 2  <3> [1]  5   4 (3의 index를 1증가시키고 탐색한 index에 1을 넣어준다.)  
<2> [1]  3   5   4 (2와 1을 비교하여 다시 정렬)  
 1   2  <3> [5]  4  
 1   2   3  <5> [4]  
 1   2   3   4   5  

###시간복잡도
O(n^2) : 이미 정렬이 되어있다면 O(n)이지만 빅오 표기법은 최악을 표기하므로 O(n^2)이다.
###공간복잡도
O(n) : 하나의 배열 안에서 진행하므로 O(n)
