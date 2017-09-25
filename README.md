# Mint
Mint 는 사용자가 다양한 용도로 기능을 확장하여 사용될 수 있는 angular 로 개발된 web Http Client component framework 입니다.

# Getting started
```
git clone https://adrenalinee@bitbucket.org/adrenalinee/mint.git
cd mint
cd mint-sample-stater
npm start
```
**웹 브라우저에서 http://localhost:4200 접속**

# 확장 포인트
Request
* header builer: 
* url parameter builer: 
* query string paramter builer: 
* request body builder: 

Response
* response body viewer: 


# 로드맵
현재 아래와 같은 서브 모듈들을 걔발 진행할 예정입니다.

* mint-core: 가장 핵심 로직이 담긴 web based http client component
* mint-clients: http cloent 를 동시에 여러개를 보여줄 수 있는 컨테이너 탭 component
* mint-collections: 미리 정의된 http request 정보 목록을 관리할 수 있게 해주는 라이브러리
* mint-proxy-server: 지정된 proxy 서버를 통해 http call 할 수 있게 해주는 서버
* mint-api-console-server: 여러개의 api 스팩을 관리할 수 있게 해주는 web console. mint-collections 와 호환
* mint-sample-starter: mint 사용예시 어플리케이션. 바로 실행해 볼 수 있는 전시용
* mint-sample-rest-server: mint http client 를 통해 호출해볼 수 있는 다양한 응답을 받아 볼 수 있는 api 들이 만들어져 있는 테트스용도 서버

# License
MIT license - http://www.opensource.org/licenses/mit-license.php