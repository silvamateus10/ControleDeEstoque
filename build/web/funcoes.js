/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function calc_lucro(){
    var compra = parseFloat(document.getElementById('pComp').value);
    var venda = parseFloat(document.getElementById('pVend').value);
    var lucro = venda - compra;
    toString(document.getElementById('pLuc').value = lucro);
            }
    
