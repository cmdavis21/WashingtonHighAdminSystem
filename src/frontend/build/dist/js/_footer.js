document.addEventListener('DOMContentLoaded', function () {
    const footerContainer = document.getElementById('footer-container');
  
    // Create a new footer element
    const footer = document.createElement('footer');
    footer.classList.add('site-footer');
    
    // Create a new paragraph element for the footer text
    const paragraph = document.createElement('p');
    paragraph.textContent = '© Washington High of Forest Hills School District';
  
    // Append the paragraph to the footer
    footer.appendChild(paragraph);
  
    // Insert the footer into the footer-container element
    footerContainer.appendChild(footer);
});
  