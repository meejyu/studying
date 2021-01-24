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

2021-01-22

1. CSS와 박스모델

- 블록 레벨 요소와 인라인 레벨 요소

  - 블록 레벨 요소 : 세로 <p> <div> <ul> <table>
  - 인라인 레벨 요소 : 가로 <img> <span> <label>

- 박스 모델 : 텍스트 단락 앞뒤에 빈줄이 생기면서 텍스트 단락이 박스형태를 가짐

- 콘텐츠 영역의 크기 : width, height 속성 

  - ex) width:400px; height:100px 또는 auto; padding 10px; border 5px

  - 콘텐츠 크기 계산 :  100+20(10x2)+10(5x2)=230px(박스너비)

- 화면 배치 방법 : display : none; block;(가로) inline;(세로) table;(블록 표) inline-table(인라인 표)

2. 테두리 관련 속성

- 테두리 스타일 : border-style:none; hidden;(숨김) dashed;(짧은선) dotted;(점선) 

  double;(이중선) solid;(실선)

- 테두리 두께 : border-width: 2px;

- 테두리 색상 : border-color : blue;

- 테두리 스타일 묶어 지정 : border: 두께; 색상; 스타일;

  - border: 3px soild black

- 박스 모서리 둥글게 : border-radius : 20px; 백분율;

  - 타원 형태로 둥글게 : border-radius : 100px(가로) 20px(세로)

- 그림자 효과 : box-shadow: none; <수평> <수직> <흐림정도> <번짐정보> <색상> inset(안쪽 그림자)

  - box-shadow : 5px 5px 15px 5px gray

3. 여백을 조절하는 속성들

- 요소 주변 여백 설정 : margin : 크기; 백분율; auto;
  - margin : 30px(위) 20px(좌우) 50px(아래)
- 마진중첩 현상 : 블록으로 했을때 마진 중첩됨 30+30=30이 됨 but 인라인으로 했을떄는 30+30=60이됨
- 콘텐츠 영역과 테두리 사이 여백 설정 : padding :크기; 백분율; auto; 10px;

2021-01-24

1. HTML 기본

- HTML이란? 

  - 하이퍼텍스트 마크업 랭귀지(Hypertext markup language)
  - 하이퍼텍스트란 링크를 클릭해서 다른 사이트로 즉시 이동할수 있는 기능
  - 마크업은 태그를 사용해 표시하는 것 <>
  - 웹문서를 만드는 언어가 HTML

  - 웹문서를 작성하는 프로그램(웹편집기) 
  - 웹문서를 보는 프로그램을 웹 브라우저
  - 웹표준은 웹사이트를 만들떄 지켜야 하는 약속

2. 웹 브라우저와 웹 편집기 

- 웹브라우저 종류와 HTML지원정도 
  - 크롬 : 구글 : HTML5 표준에 가장 가까움
  - 파이어폭스 : 모질라 : 개발 도구와 부가 기능들이 뛰어남
  - 인터넷 익스플로러 : 마이크로소프트 : 개발 안됨
  - 엣지 : 마이크로소프트 : 익스플로러 대신 개발
- 웹 편집기 종류 : 텍스트를 입력할 수 있는 프로그램이면 모두 가능
  - 텍스트 편집기 : 메모장
  - 웹 편집기 : 비주얼 스튜디어 코드, 노트패드, 에디트 플러스
  - 통합개발환경(IDE) : 개발환경구축, 비주얼 스튜디오, 웹스톰, 서브라임 텍스트

3. HTML 기본 문서 구조

- 태그 :  소문자 사용, 여닫는 태크, 들여쓰기, 속성사용

- 문서 기본 구조 :  <!doctype> <HTML> <head> <body> 필수사용

  - < !doctype html > : HTML5언어로 작성된 웹문서라는 뜻

  - <HTML>~</HTML> : 웹문서의 시작과 끝을 나타냄

  - <head>~</head> : 웹문서를 해석하기 위한 정보 입력, 스타일 및 스크립트, 문서 제목만 브라우저 창에 표시됨

  - <body>~</body> : 웹 브라우저 화면에 나타날 내용

  - 특수기호 사용 : W3C에서 엔티티 코드 표 확인해서 사용, (;)반드시 사용

  - | HTML 기본구조 : !를 누르면 자동으로 생성                     |
    | ------------------------------------------------------------ |
    | ![image-20210124103740241](C:\Users\alwn0\AppData\Roaming\Typora\typora-user-images\image-20210124103740241.png) |

4. 웹 문서 만들고 업로드

- 호스팅 서버 준비 : 웹 문서를 컴퓨터로 옮겨야함

- FTP 프로그램 : 서버로 옮겨주는 역할, 파일 전송 프로토콜(File Transfer Protocol), FileZilla

  