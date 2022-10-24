import react from "react";
import "../../style.css";

export default function passagens(){
    return(
        <form className="formulario">
       <label >Origem</label>
        <input type="text" placeholder=" De onde vai sair?"/> 
        <label >Destino</label>
        <input type="text" placeholder=" Pra onde voçê vai?"/> 
        <label ><i className="bi bi-calendar"></i> Data de ida</label>
        <input type="text" placeholder="Escolha a data"/> 
        <label ><i className="bi bi-calendar"></i>Data de volta</label>
        <input type="text" placeholder="Escolha a data"/>
        <button  className="btn1" type="button" form="f_busca">
          Buscar Passagens </button> 
    </form>
    )
}