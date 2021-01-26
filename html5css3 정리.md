2021-01-24

[1. 처음 시작하는 HTML]

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



2021-01-20

[6.텍스트 관련 스타일]

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

[7. 색상과 배경을 위한 스타일]

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

[8. CSS 박스 모델]

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



2021.01.25

[9. CSS 포지셔닝]

1. CSS포지셔닝과 주요 속성들

- CSS 포지셔닝 : 레이아웃 설정

- 박스 너비 기준 정하기 : box-sizing : content-box;(콘텐츠 영역) border-box;(콘텐츠 영역 테두리 포함)

- 박스 모델 : 300=너비+(paddingx2)+(2x2)

- 왼쪽이나 오른쪽으로 배치 : float : left; right; none;

- float 속성 해제 : clear: left; right; none;

- 임의로 본문 내용 넣기 : 로렘 입숨

- 2단 레이아웃 

  - 사이트 제목 : 헤더 (header)

  - 메뉴나 기타 부가 내용 : 사이드바(sidebar) 

  - 본문내용 : 본문 (contents)

  - 저작권 정보나 연락처 : 푸터 ( footer)

  - 테두리 넣기 > 컨테이너(container) 스타일 지정 > 헤더 패딩과 마진 지정 >

    본문과 사이드바 배치 > 푸터 배치 > 브라우저 확인

- 배치 방법 지정 : 

  - position : static (흐름대로 배치),  top이나 right 등등 속성과 같이 사용
  - position : relative(문서흐름따라 위치지정),  top이나 right 등등 속성과 같이 사용
  - absolute : 원하는 위치에 배치, width 100px height 300px
  - fixed : 스크롤해도 고정

- 요소 보이거나 숨기거나 : visibility: visible(표시), hidden(숨기기)

- 요소 쌓는 순서 정하기 : z-index : 1 z-index : 3 z-index-1

2. 다단으로 편집하기

- 단의 너비 고정, 다단 구성하기 : column-width : 120px, auto
- 단의 개수 고정 : column-count : 3, auto
- 단 사이 여백 지정 : column-gap : 3em, normal
- 구분선 색상, 스타일, 너비 :  column-rule : 2px dotted #000;
- 다단 위치 지정 : break-before(앞), after(뒤), inside(안)
- 여러 단 하나로 합치기 : column-span : 1(안합침), all(모두 합치기)

3. 표 스타일

- 표 제목 위치 선정 : caption-side : top; bottom;
- 표 테두리 스타일 결정 : border : 1px dotted black;
- 테두리 통합, 분리 : border-collapse : collapse(통합) separate(분리)
- 인전합 셀 테두리 사이 거리 지정 : border-spacing : 20px(수평) 10px(수직)
- 빈셀의 표시 여부 지정 :  empty-cells : show(기본값) hide(숨기기)
- 표 너비와 높이 지정 : width:200px, height:200px
- 셀 너비 지정 : table-layout: fixed; auto
  - table{
  - width: 300px
  - table-layout:fixed;}
- 셀 안에 수평 정렬: text-align:left right center
- 셀안에서 수직 정렬 : vertical-align : baseline(기준선에 맞추기)



2021-01-26

[10. HTML5와 시맨틱 태그]

1. HTML5 문서

- 시맨틱 태그 : 이름만 보고도 문서 구조에서 어떤 역할을 하는지 쉽게 이해할 수 있다
- 시맨틱 태그로 레이아웃을 만듦

2. 문서 구조를 위한 HTML5 시맨틱 태그

- 머리말 지정 : <header></header>
- 문서를 연결하는 내비게이션 링크 : <nav></nav>
- 주제별 콘텐츠 영억 나타내기 : <section></section>
- 콘텐츠 내용 넣기 : <article></article>
- 본문 이외의 내용 표시 : <aside></aside>
- 외부 문서 삽입하기 : <iframe src="삽입할 문서 주소" width="500" height="500"></iframe>
- 제작 정보와 저작권 정보 표시 : <footer></footer>
- 사이트 제작자 정보, 연라처 표시 : <address></address>
- 시각적 효과 적용 : <div>태그사용

3. IE8이하 버전에서는 어떻게 하나요?

- CSS에서 블로 레벨로 정의하기 :  header, cestion, nav, article, footer {display:block;}
- 시맨틱 태그 직접 정의하기
- HTML5 Shiv 사용하기
- 폴리필 사용학



2021-01-27

[11. HTML5와 멀티미디어]

1. 웹과 멀티미디어

- 플러그인 : 웹 브라우저에서 처리할 수 없는 작업을 위해 웹 문서 안에 포함시킨 외부 프로그램 기능

  - 외부 파일 삽입 : <object data="경로" type="유형" 

    name="이름" width="너비" height="높이" ></object>

  - 외부파일 삽입 : <embed src="경로" type="유형" width="너비" height="높이">

- 멀티미디어의 웹 표준화 

  - 비디오 :  mp4, ogv, webm
  - 오디오 : mp3, ogg
  - 크롬, 파이어폭스, 오페라에서 다 지원

- HTML와 비디오 코덱

  - 인코딩 : 원본 비디오 파일을 컴퓨터에서 쓸수 있는 비디오 파일로 변환
  - 디코딩 : 비디오 정보를 가져와 비디오 플레이어에 보여주는 과정
  - 촬영기기 > 인코딩(비디오코덱) > 비디오파일(컴퓨터) > 디코딩(비디오코덱) > 비디오 플레이어
  - H.264/AVC : mp4파일에서 사용
  - 오그 테오라 : ogv파일에서 사용

- HTML와 오디오 코덱

  - MPEG-1 AUDIO Layer3 : 'MP3 코덱'
  - Ogg Vorbis : 누구나 사용 가능

2. 오디오 & 비디오 재생하기

