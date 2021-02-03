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

- 머리말 지정 : < header></header>
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

- 오디오 파일 삽입하기 : <audio src="오디오 파일 경로" 속성></audio>

  audio src="주소" contorls autoplay loop mute></ a u d i o >

  - autoplay : 오디오 자동 재생
  - preload : 다운로드
  
- 비디오 파일 삽입하기 : <video src="비디오 파일 경로" 속성></video>

- 여러 미디어 파일 삽입 : <source sre="경로" type="유형viddecs="비디오 코덱">

- 비디오 태그가 안되는 이전 브라우저 : 메시지 남기기

- audio 태그와 video 태그의 속성 

  - 크기 조절 : width, height 
  - 컨트롤 막대 표시 : controls 
  - 반복재생 : loop 
  - 소리끄고 재생 : mute 
  - 문제 상황 표시 : poster
  - 파일 다운로드 여부 : preload : none(재생버튼 누르면 다운로드) auto(자동 다운로드)

- 비디오 자막 추가 : track kind="자막종류" src="경로" srclang="언어" label="제목" default

  track kind="subtitles" src="wildlife.vtt" srclang="ko" label="korean" default

  - kind 속성 : subtitles 자막
  - WebVTT 자막파일 : vtt 



2021-01-28

[12. 다재다능한 CSS3 선택자]

1. 연결 선택자

- 하위 선택자 : 지정한 모든 하위 요소에 스타일 적용 : 상위요소 하위요소

  section(상위요소) p(하위요소) { color: blue;}

- 자식 선택자 : 자식 요소에만 스타일 적용 : 부모요소 > 자식요소

  section(부모요소) > p(자식요소) { color: blue;}

- 인접 형제 선택자 : 가까운 형제 요소에 스타일 적용 : 요소1 + 요소 2

  h1 + p(h1태그이 첫번째 형제 요소) {text-decoration: underline;}

- 형제 선택자 : 형제 요소에 스타일 적용 : 요소1 ~ 요소2

  h1 ~ p(형제요소) {text-decoration: underline;}

2. 속성 선택자

| 기본형       | 스타일 적용 경우                               | 예시 -  선택자    | 예시 - 적용되는 요소                                         |
| ------------ | ---------------------------------------------- | ----------------- | ------------------------------------------------------------ |
| [속성]       | 지정한 '속성'일 때                             | [href]            | < a href="#"> 메뉴1 < / a>                                   |
| [속성=값]    | '값'에 일치할 때                               | [target="_blank"] | < a href="#" target="_blank"> HTML < / a>                    |
| [속성~=값]   | 여러값 중 특정 '값'이 포함되어 있을때 (단어별) | [class~="button"] | < a href="#" class="flat vutton"> 메뉴4 </ a>                |
| [속성 \|=값] | '값'이 포함되어있을때(하이픈 포함)             | [class\|="us"]    | < a href="#" title="us">영어 < /a ><br /><a href=""#" title="us-english"> 영어 </ a> |
| [속성^=값]   | '값'으로 시작할 때                             | [title^="eng"]    | < a href="#" title="english">영어 < /a>                      |
| [속성 $=값]  | '값'으로 끝날 때                               | [href $="xls"]    | < a href="intro.xls"> 엑셀파일< /a>                          |
| [속성*=값]   | '값'이 속성 값의 일부 일 때                    | [href *="w3"]     | < a href="http: //www. w3c.org/tr/html"> HTML사이트< /a>     |

3. 가상 클래스와 가상 요소

- 사용자 동작에 반응하는 가상 클래스

  .navi a:link, .navi a:visited {스타일} .navi a:hover, .navi a:focus {스타일}

  - 방문하지 않은 링크에 스타일 적용 : :link 선택자
  - 방문한 링크에 스타일 적용 : :visited 선택자
  - 마우스 커서 올렸을 때 스타일 적용 : :hover 선택자
  - 웹 요소를 활성화 했을 때의 스타일 적용 : :active 선택자
  - 웹 요소에 초점이 맞춰졌을 때 스타일 적용 : :focus 선택자
  - 순서 : :link :visited :hover :active (반드시 순서 지킴)

- UI요소 상태에 따른 가상 클래스 : UI요소의 상태에 따라 앱 화면 디자인 할 때 사용

  input:disabled {스타일}

  input:checke + span {스타일}

  < /label>이름 < input type="text" disabled>< /label>

  < /lavel>< input type="radio" value="writng">< span>작문< /span>< /label>

  - 요소를 사용 할 수 있을 때 와 없을 때 : :enabled :disabled 
  - 체크박스 선택햇을 때 : :cheked

- 구조 가상 클래스

  - 문서 전체에 적용, HTML요소에 스타일 적용 : :root 
  - 자식 요소의 위치에 따라 스타일 적용 : table tr:nth-child(2n+1) {스타일 적용}
    - :nth-child(n) : 앞에서부터 n번째 자식 요소에 스타일 적용 
    - :nth-last-child(n) : 끝에서부터 n번째 자식 요소에 스타일 적용
    - 홀수번째 적용 : 2n+1
    - 짝수번째 적용 : 2n

  - 특정 태그 위치에 스타일 적용 : 

    - :nth-of-type(n) : 앞에서 몇번째 태그 인지
    - :nth-last-of-type(n) : 끝에서 몇번째 태그 인지

  - 첫번째, 마지막 요소에 스타일 적용

    ul.navi li:first-child {스타일}

    ul.navi li:last-child {스타일}

    < li class="home">< a href="#">home< /a>< /li>

    < li id="jquery">< a href="#">Jquery< /a>< /li>

    - :first-child
    - :last-child

  - 형제관계요소의 위치에 따라 스타일 적용

    p:first-of-type {스타일}

    - :first-of-type
    - :last-of-type

  - 하나뿐인 자식 요소에 스타일 적용

    - :only-child
    - :only-of-type

- 가상 요소 : 클래스 이름 앞에 콜론 두개(::) 붙임

  - 첫번째 줄, 첫번째 글자에 스타일 적용 : ::first-line ::first-letter

  - 내용 앞뒤에 콘텐츠 추가 : ::before ::after



2021-01-29

[13.CSS3와 애니메이션]

1. 변형

- 2차원 변형과 3차원 변형
- 2차원 : x축 y축 변형
  - 3차원 : x축 y축 z축 변형
- transform과 변형함수 : 이미지 회전, 이동
  - 2차원

| 변형함수          | 설명                                                         |
| ----------------- | ------------------------------------------------------------ |
| translate(tx, ty) | 지정한 크기만큼 x축과 y축으로 이동합니다                     |
| translate(tx)     | 지정한 크기만큼 x축으로 이동합니다                           |
| translate(ty)     | 지정한 크기만큼 y축으로 이동합니다                           |
| 예시              | transform : translate(10px, 20px); 오른쪽으로 10px, 아래쪽으로 20px이동 |
| scale(sx, sy)     | 지정한 크기만큼 x축과 y축으로 확대/축소합니다                |
| scaleX(sx)        | 지정한 크기만큼 x축으로 확대/축소합니다                      |
| scaleY(sy)        | 지정한 크기만큼 y축으로 확대/축소합니다                      |
| 예시              | transform : scale(1.7) 가로,세로로 1.7배 확대                |
| rotate(각도deg)   | 지정한 각도만큼 회전합니다                                   |
| 예시              | transform : rotate (-40deg); 시계반대방향으로 40도 회전      |
| skew(ax, ay)      | 지정한 각도만큼 x축과 y축으로 왜곡합니다                     |
| skewX(ax)         | 지정한 각도만큼 x축으로 왜곡합니다.                          |
| skewY(ay)         | 지정한 각도만큼 y축으로 왜곡합니다.                          |
| 예시              | transform : skew(-25deg, -15deg) x축으로 -25도 y축으로 -15도 |

- 3차원

| 변형함수                 | 설명                                                         |
| ------------------------ | ------------------------------------------------------------ |
| matric3d(n, [n])         | 4x4 행렬을 이용해 이동과 확대/축소, 회전 등의 변환을 지정합니다. |
| translate(tx, ty, tz)    | 지정한 크기만큼 x축과 y축, z축으로 이동합니다                |
| translateZ(tz)           | 지정한 크기만큼 z축으로 이동합니다                           |
| scale(sx, sy, sz)        | 지정한 크기만큼 x축과 y축, z축으로 확대/축소합니다           |
| scaleZ(sz)               | 지정한 크기만큼 z축으로 확대/축소합니다                      |
| 예시                     | transform : scale(1.7) 가로,세로로 1.7배 확대                |
| rotate(rx, ry, rz, 각도) | 지정한 각도만큼 회전합니다                                   |
| 예시                     | transform : rotate (-40deg); 시계반대방향으로 40도 회전      |
| rotateX(각도)            | 지정한 각도만큼 x축으로 회전합니다.                          |
| rotateY(각도)            | 지정한 각도만큼 y축으로 회전합니다.                          |
| rotateZ(각도)            | 지정한 각도만큼 z축으로 회전합니다.                          |
| perspective(길이)        | 입체적으로 보일 수 있는 기피 값을 지정합니다.                |

2. 변형과 관련된 속성들

- 변형 기준점 설정 : transform-origin
  - transform-origin : <x축 : left center light 만사용> <y축 : top center bottom만 사용> <z축>
  - transform-ofigin : right bottom;

- 원근감 표현 : perspective, perspective-origin
- 속성값은 0이상, 값이 클수록 사용자로부터 멀어짐
  - perspective : 크기(300px) none, 
  - perspective-origin : <x축 값> <y축 값>;

- 3D 변형 적용하기 : transform-style : flat(평면효과) preserve-3d(3d효과)
- 요소의 뒷면 표시하기 : backface-visibility : visible(보기) hidden(숨기기)

3. 트랜지션

- 트랜지션이란? : 스타일 속성이 바뀌는 것을 말합니다
- 트랜지션을 적용할 속성 지정 : transition-property : all none <속성이름 : width, height;>
- 트랜지션 진행 시간 지정 : transition-duration : <시간 : 3s>
- 트랜지션 속도 곡선 지정 : transition-timing-function : linear;(천천히 시작 빨라지다가 마지막에는 천천히) 
- 지연 시간 설정 : transition-delay : <시간 :  3s>
- 트랜지션 속성 한꺼번에 표기 
  - 순서 : transition : <transition-property> <transition-duration> <transition-timing-function> <transition-delay>

4. 애니메이션

- CSS와 애니메이션 : 애니메이션 중간에 스타일이 바뀌는 지점을 키프레임

- 애니메이션 지점 설정 : @keyframes <이름> {<선택자> <스타일>}
- 애니메이션 이름 지정 : animation-name : <키프레임 이름> none
- 애니메이션 실행 시간 설정 : animation-duration : <시간 : 3s>
- 애니메이션 방향 지정 : animation-direction : normal(원래 있던 위치로 돌아감) alternate(왔던 방향으로 되돌아감)
- 반복 횟수 지정 : animation-iteration-count : <숫자> infinite(무한)
- 애니메이션 속도 곡선 지정 : animation-timing-function : linear
- 애니메이션 관련 속성 한번에 표기 
  - 순서 중요하지 않음
  - 시간값이 두개라면 첫번쨰는 time, 두번째는 delay



2021-02-03

[14. 반응형 웹 사이트 만들기]

1. 모바일 기기와 웹 디자인

- 반응형 웹디자인 : 화면 요소들을 화면 크기에 맞게 재배치하고 각 요소의 표시 방법만 바꾸어 사이트 구현
- 반응형 웹의 장단점
  - 모든 스마트 기기에서 접속 가능
  - 가로 모드에 맞추어 레이아웃 변경 가능
  - 사이트 유지관리 용이
- 모바일 기기를 위한 기본 다지기, 뷰포트 : 스마트폰 화면에서 실제 내용이 표시되는 영역
- 뷰포트 지정하기 : <meta>태그를 이용해 <head>태그와</head> 태그 사이에 작성
  - < meta name="viewport" content="<속성1=값> <속성2=값2>" 
  - width, heigh 
  - user-scalable(확대/축소 가능 여부 yes,no), 
  - initial-scale(초기 확대/축소 값) 1~10
  - minimum-scale(최소 확대/축소 값) 0~10
  - macimum-scale(최대 확대/축소 값) 0~10

2. 가변 그리드 레이아웃

- 고정 그리드와 가변 그리드 

  - 레이아웃을 정할 때 자주 사용하는 기준이 '그리드 시스템'
  - 화면 갯수 : 칼럼
  - 960픽셀 : 960그리드 시스템, 12칼럼
  - 레이아웃을 백분율로 지정 : 가변 그리드 레이아웃

- 가변 그리드 레이아웃 만들기 : 고정 그리드 레이아웃 만들고 가변 그리드 레이아웃 바꿀수 있음

  - 전체를 감싸는 요소 확인 : 너비계산 <div id="wrapper"> <div id="container" 추가

- 각 요소의 너비 값 계산 = (요소의 너비 / 콘텐츠 전체를 감싸는 요소의 너비)*100

  소수점 이하 3~4자리까지 표시, 너비와 함께 패딩과 마진도 백분율 값으로 조절

  header .content padding .right-side padding footer

3. 가변 레이아웃과 가변 요소

- 가변 글꼴 

  - em 단위 : 부모요소의 영향을 받음, 글자크기(px)/16px
  - rem단위 : 부모요소의 영향을 받지 않음, 기본크기*숫자

- 가변 이미지

  - CSS 이용하기 : 이미지를 감싸고 있는 부모 요소만큼만 커지거나 작아지도록  max-width 속성 값을 100%

  - <img> 태그와 srcset 속성 : <img> 태그에서 srcset 속성을 이용하면 화면 너비 값이나 픽셀 밀도에 따라 고해상도의 이미지 파일 지정 <img src="images/pencil.jpg" srcset="images/pencil-hd.jpg 2x"

  - 상황별로 다른 이미지 표시 : <picture> 태그와 <source> 태그 

  - srcset(이미지 파일 경로)

  - media(이미지를 표시하기 위한 조건)

  - type(파일 유형) sizes(파일의 크기)

  - < picture> < source srcset="images/shop-large.jpg" media="(min-width:1024px)">

    < img src="images/shop.jpg" style="width:100%;">

- 가변 비디오 : max-width 속성을 100%로 지정



2021-02-04

[15. 미디어 쿼리]

1. 미디어 쿼리 이해하기

- 미디어 쿼리란? : 
- 미디어 쿼리 구문
- 미디어 쿼리의 조건

