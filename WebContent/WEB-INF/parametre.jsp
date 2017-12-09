<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>

    <meta charset="utf-8">
    <link rel="shortcut icon" type="image/x-icon" href="image/etudiant.png" />
      <title>Ma PFE</title>

    <link rel="stylesheet" href="res/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="res/css/style.css">


</head>
<body>
<div class="container-full">
    <div class="well well-lg">
        <div id="div-infoUser">
            <img src="image/9.jpg" class="img-profil">
            <p id="nom-user">ahmid hizawi </p>

        </div>
        <div class="btn-group" id="btn-profil">
            <button class="btn btn-default btn-sm dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <span class="caret" id="d"></span>Profile <span class="glyphicon glyphicon-user"></span>
            </button>
            <ul class="dropdown-menu">
                <li><a href="profile.php">Modifier Profile<span class="glyphicon glyphicon-cog icons" ></span></a> </li>
                <li> <a href="deconnexion.php">Ddéconnecter<span class="glyphicon glyphicon-off icons"></span> </a></li>
            </ul>
        </div>

    </div>
    <div class="row">
        <div class="col-lg-2" id="navbar-inverse">
            <div id="container-logo">
                <h2 id="nom_site">Ma PFE</h2>
                <img src="../image/logo.png" alt="logo">
                <p id="titre-logo">rapports</p>
            </div>
            <nav class="navbar navbar-inverse">
              <ul class="nav navbar-left" id="ul-nav">
                  <li class="active" > <a href="home">accueil  </a> </li>
                    <li class="active" id="a"> <a href="#">Licence Appliquée <span class="caret"></span> </a> </li>
                  <div class="div-nav-page" id="aa"  hidden><br>
                      <a href="home.php?br=T.L.A TMW" class="lien-page pos-lient">-Rappots T.L.A TMW </a>
                  </div>
                  <li> <a href="#" id="i">Licence Fondamentale<span class="caret"></span></a> </li>
                  <div class="div-nav-page" id="ii" hidden><br>

                      <a href="home.php?br=T.L.A FIM" class="lien-page pos-lient">Rappots T.L.A FIM </a>
                  </div>
                  <li> <a href="#" id="f">Master<span class="caret"></span></a> </li>
                  <div class="div-nav-page" id="ff" hidden><br>
                      <a href="home.php?br=P.MSI" class="lien-page pos-lient">Rappots P.MSI</a><br>
                      <a href="home.php?br=D.MSI" class="lien-page pos-lient">Rappots D.MSI </a>
                  </div>
                  <li> <a href="#" id="o">Ingénierie<span class="caret"></span></a> </li>
                  <div class="div-nav-page" id="oo" hidden><br>

                      <a href="home.php?br=T.G TMW" class="lien-page pos-lient">Rappots T.G TMW </a>
                  </div>

                  <li><a href="parametre.php"    >Paramétres</a> </li>
              </ul>
            </nav>


        </div>
        <!-- cure de app-->

        <div class="col-lg-7" id="container-rapport" style="height: 612px; width: 932px; left: 379px;"">
            <h2 id="h2">Paramétres</h2>
            <!-- recherche-->
            <div class="container">
                <div class="div-recherch">
                    <div class="col-md-3">
                        <div id="custom-search-input">
                            <form method="post" action="recherch.php" name="form">
                                <div class="input-group col-md-10">
                                    <input type="text" class="form-control input-ms" placeholder="Recherch ..." name="rech" />
                                    <span class="input-group-btn">
                                            <button class="btn btn-info btn-ms" type="submit" >
                                                <i class="glyphicon glyphicon-search"></i>
                                            </button>
                                        </span>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <!--contener ajout rapoort-->

                <div class="container" style="position: relative;left: 461px;bottom: -40px;">

                    <!-- Trigger the modal with a button -->
                    <button type="button" class="btn btn-success btn-sm" data-toggle="modal" data-target="#myModal"> <span class="glyphicon glyphicon-plus"></span> Ajouter un rapport</button>

                    <!-- Modal -->
                    <div class="modal fade" id="myModal" role="dialog">
                        <div class="modal-dialog">

                            <!-- Modal content-->
                            <div class="modal-content row" >
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                    Ajouter un rapport validée
                                </div>
<div class="modal-body col-lg-7" >
            <!-- formuler-->

    <form name="f" class="form" method="post" >
        <div  class="form-group-sm">
            <input type="text" placeholder="Nom Etudiant" name="nom" class="form-control"  required id="nom"><br>
            <input type="text" placeholder="Prenom Etudiant" name="prnom" class="form-control" required id="prnom"><br>
            <input type="text" placeholder="Titre De Rapport" name="titre" class="form-control" required id="titre"><br>
                <select class="form-control" required name="branche">
                    <option></option>
                    <option name="branche" >T.L.A TMW</option>
                    <option name="branche">T.L.A FIM</option>
                    <option name="branche">P.MSI</option>
                    <option name="branche">D.MSI</option>
                    <option name="branche">T.G TMW</option>
                  </select>
               <br>
    <input type="text" placeholder="Montion De Rapport" name="montion" class="form-control" required  id="montion"><br>
    <input type="text" placeholder="année scolaire " maxlength="4" name="annee" class="form-control" required id="annee"><br>
    <textarea placeholder="Descripetion  De Rapport" name="desc" class="form-control" required id="des"></textarea><br>

                <label class="custom-file">Ficher PDF:
                    <input type="file" class="custom-file-input" name="file" id="file" required>
                    <span class="custom-file-control"></span>
                </label><br><br>
             <input type="submit" class=" form-control btn-success" style="width: 127px" id="submit" name="submit">
             <input type="reset" class=" form-control btn-danger" style="width: 127px;position: relative;left: 150px;top: -30px;">



        </div>

    </form>
</div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal" id="btn-close">Close</button>
                </div>
            </div>

                        </div>
                    </div>

                </div><br><br>
<!--fin-->

            </div>
            <div class="row">
                <!-- conteneure de rapport -->
<div id="a"></div>
                      <div class="box-content" style="display: block;">
                      
					 <table class="table table-striped table-bordered responsive">
                            <thead>
                            <tr>
                                <th>Titre De Rapport</th>
                                <th>Nom De L\'etudiant</th>
                                <th>Année</th>
                                <th>Branche</th>
                                <th>Mention</th>
                                <th>Action</th>
                            </tr>
                            </thead>
                            <tbody id="table">';

                                         <tr>
                                        <td>'.$lige[2].' </td>
                                        <td class="center">'.$lige[3]  .' . '  . '  '.  $lige[4] .'</td>
                                        <td class="center">'.$lige[6].'</td>
                                        <td class="center">'.$lige[7].'</td>
                                        <td class="center">
                                            <span class="label-warning label label-default">'.$lige[8].'</span>
                                        </td>
                                        <td class="center">
                                            <a class="btn btn-success btn-xs" href="rapport.php?id_rapport='.$lige[0].'">
                                                <i class="glyphicon glyphicon-zoom-in icon-white"></i>
                                                View
                                            </a>
                                            <a class="btn btn-info btn-xs" href="modif_rapport.php?id_rapport='.$lige[0].'">
                                                <i class="glyphicon glyphicon-edit icon-white"></i>
                                                Edit
                                            </a>
                                            <a class="btn btn-danger btn-xs sup" href="envoi-rapport.php?id_rapport='.$lige[0].'">
                                                <i class="glyphicon glyphicon-trash icon-white"></i>
                                                Delete
                                            </a>
                                        </td>
                                    </tr>

                            </tbody>
                            '; }
                      echo'  </table>
                    </div>';
                </div>












<script src="res/js/jquery.js"></script>
<script src="res/bootstrap/js/bootstrap.js"></script>
<script src="res/js/ex1.js"></script>




</body>
</html>
