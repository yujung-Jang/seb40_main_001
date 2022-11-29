insert into address (created_at, updated_at, sido, sigungu)
values (now(), now(), '서울특별시', '강남구'),
       (now(), now(), '서울특별시', '강동구'),
       (now(), now(), '서울특별시', '강북구'),
       (now(), now(), '서울특별시', '강서구'),
       (now(), now(), '서울특별시', '관악구'),
       (now(), now(), '서울특별시', '광진구'),
       (now(), now(), '서울특별시', '구로구'),
       (now(), now(), '서울특별시', '금천구'),
       (now(), now(), '서울특별시', '노원구'),
       (now(), now(), '서울특별시', '도봉구'),
       (now(), now(), '서울특별시', '동대문구'),
       (now(), now(), '서울특별시', '동작구'),
       (now(), now(), '서울특별시', '마포구'),
       (now(), now(), '서울특별시', '서대문구'),
       (now(), now(), '서울특별시', '서초구'),
       (now(), now(), '서울특별시', '성동구'),
       (now(), now(), '서울특별시', '성북구'),
       (now(), now(), '서울특별시', '송파구'),
       (now(), now(), '서울특별시', '양천구'),
       (now(), now(), '서울특별시', '영등포구'),
       (now(), now(), '서울특별시', '용산구'),
       (now(), now(), '서울특별시', '은평구'),
       (now(), now(), '서울특별시', '종로구'),
       (now(), now(), '서울특별시', '중구'),
       (now(), now(), '서울특별시', '중랑구')
on duplicate key update created_at = created_at;


