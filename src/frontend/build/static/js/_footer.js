// INJECT SITE FOOTER TO EVERY PAGE
const footer = document.querySelector(".page-footer");
fetch("./pages/_footer.html")
    .then(response => response.text())
    .then(data => {
        footer.innerHTML = data;
    })
    .catch(error => {
        console.error("Error fetching footer content:", error);
    });
