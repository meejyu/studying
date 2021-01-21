2021-01-20

1. 글꼴 관련 스타일

- 글자 폰트 : {font-family:'글꼴', 돋움;}

- 글자 크기 : {font-sizw:30px;}

- 글자 굵기 : {font-weight:bold;}

- 작은 대문자 : {font-variant:normal'}

- 글자 스타일 : {font-style:italic;}

- 통합 사용 : {font:16px italic 12pt bold;}

- style="font:요소"

2. 텍스트 스타일

- 글자색 : {color:blue;}
- 텍스트에 줄 표시하기 : {text-decoration:none;underline;overline;line-through;}
- 대,소문자 변환기 : {text-transform:none;capitalize;}
- 그림자 효과 추가 : {text-shadow:가로거리 세로거리 번짐정도 색상;}
- 공백처리 : {white-space:normal;}
- 텍스트 간격 조절하기 : 
  - 글자 사이 간격 조절 : {letter-spacing:normal;}
  - 단어 사이 간격 조절 : {word-spacing:normal;}

3. 문단 스타일

- 글자쓰기방향 : {direction : ltr, rtl;} ltr :왼쪽에서, rtl : 오른쪽에서
- 텍스트 정렬 : {text-align: justify, center;}
- 정렬시 공백 조절 : {text-justify:auto, none;}
- 들여쓰기 : {text-indent:15px, 5%;}
- 줄간격 조절 : {line-height:normal, 숫자;}
- 넘치는 텍스트 표기하기 : {text-overflow: clip, ellipsis;} clip : 넘치는 텍스트 자르기, ellipsis: 잘린텍스트 있다고 알려주기

4. 목록 스타일

- 목록의 불릿과 번호 스타일 : {list-style-type: none'}
  - 순서없는 목록 : {list-style-type:circle;}
  - 순서있는 목록 : {list-style-type:decimal;} decimal:숫자
- 불릿 대신 이미지 넣기 : {list-style-image: <이미지> <이미지> = url(이미지 파일 경로)}
- 목록에 들여쓰기 효과 : {list-style-position:inside;}
- 목록 속성 한꺼번에 표시 : {list-style:none, inside;} 

2021-01-21

1. 웹에서 색상 표현하기

- 16진수 표기법 : 0~9~a~f, #000000(검은색), #ffffff(흰색), rr=레드, gg=그린, bb=블루
- rgb와 rgba 표기법 
  - rgb(red값, green값, blue값); ex) color:rgb(255,0,0) 
  - rgba(red값, green값, blue값, alpha값); ex) color:rgba(255,0,0,0)
  - rgb=0~255까지, a=0~1까지
- hsl과 hsla표기법
  - hsl(hue값, saturation값, lightness값) (360, 100%, 0%)
  - hsla(hue값, saturation값, lightness값, alpha값) (360, 100%, 0%, 0.5)
- 색상 추출 사이트 이용하기 : color picker>색상고르기>save누르기

2. 배경색과 배경이미지

- 배경색 지정 : #00ff00; rgb(0,255,0); green;

- 배경색 스타일과 상속 : background-color값은 상속되지 않음, 각 요소에 직접 지정

- 배경 적용 범위 조절 : background-clip:border-box(가장 외곽테두리), padding-box(패딩까지), content-box(내용부분만적용)

- 배경 이미지 넣기 : background-image:url(파일경로); 

  ex) body {vackground-image: url('bg1.png');}

- 배경 이미지 크기 조절 : background-size: auto;(원래크기) cover;(배경꽉차게)

- 배경 이미지 위치 조절 : background-position: right center;

- 배경 이미지 배치 기준 조절 : background-origin:border-box(가장 외곽테두리), 

  padding-box(패딩부터), content-box(내용부분이기준)

- 배경 이미지 고정 : background-attachment: scroll;(스크롤됨) fixed;(고정됨)

- 속성 하나로 배경 이미지 제어 : 

  background:url(images/bg3.jpg); no-repeat; fixed; fight bottom;

3. 그라데이션 효과로 배경 꾸미기

- 그라데이션과 브라우저 접두사

  | 접두사   | 브라우저 버전     |
  | -------- | ----------------- |
  | -webkit- | 사파리 5.1~6.0    |
  | -moz-    | 파이어폭스 3.6~15 |
  | -o-      | 오페라 11.1~12.0  |

- 선형 그라데이션 : linear-gradient: 각도 to 방향, color-stop

  - 방향 : to top, left, fight, bottom ~시작해서 위로 ex) linear-gradient(left top, blue, white) 
  - 각도 : 0deg ex)linear-gradient(45deg, #ff0000, #ffffff)

| 위치 속성 값             | 브라우저 버전     |
| ------------------------ | ----------------- |
| 시작 위치 기준           | 사파리 5.1~6.0    |
| 끝위치 기준, to사용 안함 | 파이어폭스 3.6~15 |
| 끝위치 기준, to사용 안함 | 오페라 11.1~12.0  |

- 원형 그라데이션 : radial-gradient : 모양 위치 크기
  - 모양 : circle(원형), ellipse(타원형)
  - 위치 : background:radial-gradient(circle at 10% 10%)
- 그라데이션을 사용해 패턴 만들기 : repeating-radial-gradient (yellow, red 20px)