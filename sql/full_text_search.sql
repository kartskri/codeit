select * from articles
where MATCH(title, body)
AGAINST ('database' in NATURAL LANGUAGE MODE)