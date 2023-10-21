<h2>Compte rendu pour réaliser un application ecommerce en utlisant architecture micro-service et angulare pour le partie Front End encore respectant  le dévellopement programmmation avec Systèmes Parallèles et Distribués.</h2>
<h3>Partie 1 : Pré-traitement de texte </h3>
<p>On considère le corpus des textes suivant :
=&quot; Le chat dort sur le tapis.&quot;   ; =&quot; Les Oiseaux Chantent Le Matin. &quot; ; = &quot; Le chien court
dans le jardin. &quot;  ; = &quot; Mangeons des pommes délicieuses.&quot; ; = &quot;Je mange une orange
fraîche.&quot;</p>
<ul>
    <li>1. Créer un corpus qui contient les textes :</li>
    <img src="./img/img01.png"/>
    <li>2. Convertir le corpus en type DataFrame :</li>
<img src="./img/img02.png"/>
    <li>3. Quelles sont les différentes approches pour prétraiter un corpus de textes ? Décrire les :</li>

<ul>
    <li><h3>Minuscules</h3> : Convertir tous les caractères en minuscules pour éviter les duplications dues à la casse.</li>
    <li><h3>Tokenisation</h3> : Diviser le texte en mots ou en phrases (token).</li>
    <li><h3>Suppression des caractères spéciaux et de la ponctuation</h3> : Supprimer les caractères qui ne sont pas des lettres ou des chiffres.</li>
    <li><h3>Suppression des stopwords : </h3> : Supprimer les mots courants (comme 'le', 'la', 'et') qui ne portent pas beaucoup de sens.</li>
    <li><h3>Lemmatisation et Stemming : </h3> : Réduire les mots à leur forme de base (par exemple, "mangeons" devient "manger").</li>
</ul>
<li>4. Ecrire code suivant :</li>
<img src="./img/img03.png"/>

<li>
5. Ajouter une colonne dans l’objet corpus nommée « t_s_p » en utilisant la fonction de Q.4
</li>
<img src="./img/img04.png"/>



<li>6. Ecrire une fonction pour tokinezer le corpus de colonne « t_s_p ».</li>
<img src="./img/img05.png"/>
<li>7. Ecrire une fonction qui élimine les stop words.</li>
<img src="./img/img06.png"/>
<li>8. Appliquer la lemmatisation et stremming sur le corpus sans stop words.</li>
<img src="./img/img07.png"/>
</ul>
<hr>

<h3>Partie 2 : CountVectorizer</h3>

<ul>
    <li>9. Initialiser et ajuster le CountVectorizer à votre corpus :</li>
    <img src="./img/img08.png"/>
    <li>10. Transformer le corpus en une matrice de comptage de tokens :</li>
<img src="./img/img09.png"/>
    <li>11. Explorer la matrice résultante pour comprendre comment les tokens sont représentés en vecteurs binaires :</li>
<img src="./img/img010.png"/>
</ul>



<hr>



<h3>Partie 3 : TfidfVectorizer</h3>

<ul>
    <li>1. Initialiser et ajuster le TfidfVectorizer à votre corpus :</li>
    <img src="./img/img011.png"/>
    <li>2. Transformer le corpus en une matrice de poids de tokens dans le corpus :</li>
<img src="./img/img012.png"/>
    <li>3. Explorer la matrice résultante pour comprendre comment les tokens sont représentés :</li>
<img src="./img/img012.png"/>

<li>4. Appliquer la métrique similarité de cosinus entre les tokens « chat et chien », puis après « pomme et orange » sur les deux représentations vectorielles. Conclure ?</li>
<img src="./img/img013.png"/>

<p1>
<strong>Conclusion</strong> La similarité de cosinus mesure la similarité entre deux vecteurs. Plus la valeur est proche de 1, plus les vecteurs sont similaires. En général, dans un modèle TF-IDF, les mots rares qui sont spécifiques à un document donné auront des valeurs plus élevées. La similarité entre "chat" et "chien" est probablement plus basse que celle entre "pomme" et "orange" car "chat" et "chien" sont des mots courants et peuvent apparaître dans divers contextes, tandis que "pomme" et "orange" sont plus spécifiques à des contextes particuliers.
Cela conclut l'atelier sur la préparation de texte pour les modèles de machine learning en utilisant CountVectorizer et TfidfVectorizer en Python. Ces techniques sont essentielles pour transformer le texte en données exploitables par les algorithmes de machine learning.
</p1>
</ul>



