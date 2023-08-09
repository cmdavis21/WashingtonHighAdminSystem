document.addEventListener('DOMContentLoaded', function () {
    const footerContainer = document.getElementById('footer-container');

    // Create footer elements
    const footer = document.createElement('footer');
    footer.classList.add('site-footer');

    const container = document.createElement('div');
    container.classList.add('container');
    
    const footerContent = document.createElement('div');
    footerContent.classList.add('footer-content');

    const logo = document.createElement('div');
    logo.classList.add('footer-logo');

    const footerLinks = document.createElement('div');
    footerLinks.classList.add('footer-links');

    const footerAddress = document.createElement('div');
    footerAddress.classList.add('footer-address');

    const footerBottom = document.createElement('div');
    footerBottom.classList.add('footer-bottom');

    // Append the content to the footer
    footer.appendChild(container);
    footer.appendChild(footerContent);
    footer.appendChild(logo);
    footer.appendChild(footerLinks);
    footer.appendChild(footerAddress);
    footer.appendChild(footerBottom);

    // Insert the footer into the footer-container element
    footerContainer.appendChild(footer);
});
