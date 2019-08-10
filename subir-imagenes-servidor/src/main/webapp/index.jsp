<!DOCTYPE html>
<html>
  <head>
    <title>Subir archivo</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
    <h3>Upload photo</h3>
    <form action="upload" method="post" enctype="multipart/form-data">
      Name:<br>
      <input type="text" name="name" required><br>
      Email:<br>
      <input type="text" name="email" required><br><br>
      Select File to Upload:<br>
      <input type="file" name="photo">
      <br><br>
      <input type="submit" value="Upload">
    </form>
  </body>
</html>