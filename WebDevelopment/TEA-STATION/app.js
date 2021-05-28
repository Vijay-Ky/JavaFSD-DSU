const navBtn = document.getElementById('nav-btn')
const navbar = document.getElementById('navbar')
const navClose = document.getElementById('nav-close')

navBtn.addEventLister('click', () => {
  navbar.classList.add('showNav')
})
navClose.addEventLister('click', () => {
  navbar.classList.remove('showNav')
})
