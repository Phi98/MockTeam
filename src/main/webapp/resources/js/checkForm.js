const patternAlpha = new RegExp("^[a-zA-Z]+$");
const patternNumber = new RegExp("^(0|[1-9][0-9]*){12}$");
const patternCMND = new RegExp("^(0|[1-9][0-9]*)$");
const patternEmail = new RegExp("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$");


document.getElementById('FormS').addEventListener('submit', function (event) {
    event.preventDefault();
    var inputEmail = document.getElementById('email').value;
    ValidateEmail(inputEmail);
    var inputNumber = document.getElementById('number').value;
    ValidateNumber(inputNumber);
    var inputCMND = document.getElementById('cmnd').value;
    ValidateCMND(inputCMND);
});

function ValidateEmail(email) {
    if (patternEmail.test(email) == false) {
        document.getElementById('checkEmail').innerHTML = 'Not a Validate Email !!!';
    } 
return email;
};

function ValidateCMND(cmnd) {
    if (patternCMND.test(cmnd) == true) {
        document.getElementById('checkCMND').innerHTML = '';
    } else {
        document.getElementById('checkCMND').innerHTML = 'CMND is 12-digiter number';
    }

};

function ValidateNumber(number) {
    if (patternNumber.test(number) == true) {
        document.getElementById('checkNumber').innerHTML = '';
    } else {
        document.getElementById('checkNumber').innerHTML = 'Please input Number !!!';
    }

};