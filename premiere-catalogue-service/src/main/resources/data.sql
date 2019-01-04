
insert into theatre (theatre_id, theatre_name, city_id, movie_id) values
(1, 'Aries Plex', 1,1000),
(2, 'Mall of travancore' , 1,1001) , 
(3, 'Centrum mall', 1, 1002);

insert into show (theatre_id, show_date_time, total_seats, available_seats) values
(1, '2018-12-26 11:30:00.0000', 100, 100 ),
(1, '2018-12-26 16:30:00.0000', 100, 100 ),
(2, '2018-12-26 11:30:00.0000', 100, 100 ),
(2, '2018-12-26 16:30:00.0000', 100, 100 );

insert into seat (show_id, seat_name, status,price) values 
(1, 'a1',0,100.00),
(1, 'a2',1,100.00),
(1, 'a3',0,100.00),
(1, 'b1',0,300.00),
(2, 'b2',1,100.00),
(3, 'c1',0,300.00);