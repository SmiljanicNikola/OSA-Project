<b>NOTE: This repository contains only BACKEND part, frontend developed in React is stored in another repository and you can find it here:</b> https://github.com/SmiljanicNikola/OSAFrontend
<hr>
<b>Description and project specification:</b>
<br>This is <b>Java Spring Boot (Backend) and React (Frontend)</b> application, for storing data I used <b>MySQL</b> (All the necessary SQL queries for creating and loading each table will be published in the data.sql file).
<hr>
<b>Application user has the following functionality:</b>

<b>[A1] User Registration.</b> When registering on the system in addition to user data,
the user also chooses the role (<b> Seller or Buyer </b>). An administrator is a predefined user who arleady
exists in the system. Also while registering, the password that is entered by the user is being encrypted and stored like that, not like plain text.

<b>[A2] Login and Logout </b>. User is able to login. In addition to displaying the credential entry form, on the same form user should be able to find registration link. User should also be able to Logout.
Support user authentication using username and password and <b> user authorization using token mechanism</b>.

<b>[A3] Update product list (As well as delete and add)</b>. Sellers should be able to see all products that belongs to them. The seller has the option to choose one of the options - <b> update </b> or <b> delete individual items </b>. On Delete Button, Product is deleted and removed from Product List, On Update Button Click, seller is being redirected on to special page to update it. Update of an individual product should be realized
through a mechanism of filled form, where each of the product attribute is possible
to change.

<b>[A4] Change of Password and Personal data</b>. When password has been successfully changed, user is redirected on his profile page.

<b>[A5] View and block users </b>. Admins have the ability to view all existing users, they also can block an individual user. Blocked users do not have the ability to log in and use the application.

<b>[A6] Leaving comments and reviews </b>. The user can view all their undelivered
orders and mark those that have arrived. After the order is delivered, the buyer can leave a review of all received and unrated orders. By choosing one specific order, the customer can <b> leave comment as well as ratings from 1 to 5 </b> where both (comment and grade) are required.
<hr>
ElasticSearch is used for Indexing implementation and also for product and order search.
<br><b>Additional features related to ElasticSearch:</b>

<br><b>[A7] Search Products </b>
<br>??? Searching for products by name,
<br>??? Searching for products by price range, where the lower range price and/or upper range price can be specified,
<b><br> ??? Preprocess the query so that it is independent of uppercase and lowercase letters, as well as Cyrillic or Latin letters</b>
  
<b>[A8] Search Orders</b>
<br>??? Searching for orders by the content of the comment,
<br>??? Searching for orders by grade range, where the lower range grade and/or upper range grade can be specified,,
<b><br>??? Preprocess the query so that it is independent of uppercase and lowercase letters, as well as Cyrillic or Latin letters</b>
<br/><br/>

<hr>
<b>Specifikacija na srpskom:</b>
<br/><br/>
<b>Opis i specifikacija projekta:</b>
<br>U pitanju je <b>Java Spring Boot (Backend) i React (Frontend)</b> aplikacija, za cuvanje neophodnih podataka koriscen je <b>MySQL</b> (Sav potreban kod za kreiranje i punjenje svake tabele bice okacen u data.sql fajlu).
<br/>
<b>Korisnik aplikacije ima na raspolaganju slede??u funkcionalnost:</b>
<br/>
<b>[A1] Registracija korisnika.</b> Prilikom registracije na sistem osim korisni??kih podataka,
korisnik bira i ulogu (<b>Prodavac ili Kupac</b>). Administrator je predefinisani korisnik koji
postoji u sistemu.Takodje prilikom registracije korisnika, lozinka koju korisnik unese se u bazi 
podataka ne skladisti kao plain text vec treba biti sifrovana.

<b>[A2] Prijava i odjava sa sistema</b>. U okviru ove aktivnosti korisniku je omogu??ena
prijava na sistem. Pored prikaza forme za unos kredencijala, na istom prikazu uklju??iti
i link za prelaz na formu za registraciju. U okviru aplikacije podr??ati opciju za odjavu.
Podr??ati autentifikaciju korisnika upotrebom korisni??kog imena i lozinke i <b>autorizaciju 
korisnika upotrebom mehanizma tokena</b>.

<b>[A3] A??uriranje liste artikala (Kao i brisanje i dodavanje)</b>. Obezbediti prodavcima prikaz svih njihovih artikala. U
okviru ovog prikaza prodavac ima mogu??nost da odabere neku od opcija - <b>a??uriranje</b>
ili <b>brisanje pojedina??nih artikala</b>. Klikom na dugme za brisanje artikla se isti uklanja sa
prikaza svih artikala, dok klikom na dugme za a??uriranje artikla prodavac biva
preusmeren na posebnu aktivnost za a??uriranje istog. A??uriranje pojedina??nog artikla
realizovati kroz mehanizam popunjene forme, gde je svaki od podataka artikla mogu??e
izmeniti. Prodavci imaju mogu??nost <b>dodavanja novih artikala</b>, gde se unose svi podaci
vezani za artikle. Nakon dodavanja novog artikla, vratiti prodavca na prikaz svih njegovih artikala.

<b>[A4] Promena lozinke i li??nih podataka</b>. Po uspe??noj promeni lozinke, korisnik se redirektuje na stranicu sa svojim 
profilom.

<b>[A5] Pregled i blokiranje korisnika </b>. Administratori imaju mogu??nost pregleda svih 
korisnika, kao i blokiranja pojedina??nih korisnika. Blokirani korisnici nemaju pristup 
aplikaciji (onemogu??iti njihovu prijavu na sistem).

<b>[A6] Ostavljanje komentara i recenzija</b>. Korisnik mo??e da pregleda sve svoje nedostavljene 
porud??bine i ozna??i one koje su stigle. Nakon isporu??ene porud??bine, kupac ima 
mogu??nost ostavljanja recenzije na sve prispele i neocenjene porud??bine. Izborom 
jedne konkretne porud??bine, kupac ima <b>mogu??nost ostavljanja komentara u slobodnoj 
formi kao i ocene (1-5)</b> pri ??emu su oba podatka (i komentar i ocena) obavezni.
<hr>
ElasticSearch je koriscen za implementaciju indeksiranja i pretra??ivanja artikala i 
porud??bina.
<br><b>Dodatne funkcionalnosti koje su vezane za ElasticSearch:</b>

<br><b>[A7] Pretraga liste artikala</b>
<br>??? Pretra??ivanje artikala po nazivu,
<br>??? Pretraga artikala po opsegu cena (od-do), gde mo??e biti zadata donja i/ili 
gornja granica opsega,
<b><br> ??? Pretprocesirati upit, tako da bude nezavisan od velikog i malog slova, kao i 
??irili??nog ili latini??nog pisma</b>
  
<b>[A8] Pretraga porud??bina</b>
<br>??? Pretra??ivanje porud??bina po sadr??aju komentara
<br>??? Pretra??ivanje porud??bina po opsegu ocena (od-do), gde mo??e biti zadata 
donja i/ili gornja granica opsega,
<b><br>??? Pretprocesirati upit, tako da bude nezavisan od velikog i malog slova, kao i 
??irili??nog ili latini??nog pisma</b>
<br>
