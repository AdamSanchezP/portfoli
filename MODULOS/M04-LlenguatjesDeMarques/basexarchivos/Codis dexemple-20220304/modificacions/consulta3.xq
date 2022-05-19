(:Inserim un nou element <totalLlibres> amb el total de llibres de la llibreria :)

let $totalLlibres := count(doc("bookstore.xml")/bookstore/book)
return
insert node <totalLlibres>{$totalLlibres}</totalLlibres> into doc("bookstore.xml")/bookstore