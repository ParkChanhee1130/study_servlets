<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
  </head>
  <body>
    <div class="fs-3">Navigations Bar with dropdown</div>
    <nav class="navbar navbar-expand bg-light">
      <div class="container">
        <a href="" class="navbar-brand">
          <img
            src="https://upload.wikimedia.org/wikipedia/commons/b/b2/Bootstrap_logo.svg"
            alt=""
            srcset=""
            width="40"
          />
          Brend
        </a>

        <div class="navbar-nav">
          <a href="" class="nav-link">Home</a>
          <a href="" class="nav-link">Feature</a>
          <a href="" class="nav-link">Pricing</a>
          <div class="dropdown nav-item">
           
      </nav>
    </div>
    <hr class="hr" />

    <div class="fs-3">Navigations Bar with collapse</div>

    <nav class="navbar navbar-expand-sm bg-light">
      <div class="container-fluid">
        <a href="" class="navbar-brand">
          <img
            src="https://upload.wikimedia.org/wikipedia/commons/b/b2/Bootstrap_logo.svg"
            alt=""
            width="30"
          />
          Brand</a
        >
        <a href="#collapseId" class="navbar-toggler" data-bs-toggle="collapse"
          ><span class="navbar-toggler-icon"></span
        ></a>
        <div class="collapse navbar-collapse" id="collapseId">
          <div class="navbar-nav">
            <a href="" class="nav-link">Home</a>
            <a href="" class="nav-link">Feature</a>
            <a href="" class="nav-link">Pricing</a>
          </div>
          <div class="d-flex">
            <a href="" class="btn btn-primary">Login</a>
          </div>
        </div>
      </div>
    </nav>
    <hr class="hr" />
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
