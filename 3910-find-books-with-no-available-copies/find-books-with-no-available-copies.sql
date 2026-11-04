select l.book_id, l.title, l.author, l.genre, l.publication_year,
count(
    case 
    when return_date is NULL then 1
end) as current_borrowers from library_books l join borrowing_records b on l.book_id = b.book_id
group by l.book_id, l.title, l.author, l.genre, l.publication_year, l.total_copies HAVING current_borrowers = l.total_copies
order by current_borrowers desc, l.title asc;
