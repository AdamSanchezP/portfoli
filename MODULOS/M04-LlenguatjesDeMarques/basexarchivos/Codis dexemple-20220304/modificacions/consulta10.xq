(:Remplacem el nom dels elements author per authorName:)

for $autor in doc("bookstore.xml")/bookstore/book/author
return
(:"rename" remplaça el nom del node que precedeix a "node" pel node que precedeix a "as":)
rename node $autor as "authorName"