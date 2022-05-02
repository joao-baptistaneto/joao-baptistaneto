import React, { useState } from "react";
import api from "../api";
import {useForm} from "react-hook-form";

export default function CadastroCliente() {

    const [campo1, setCpf] = useState("");
    const [campo2, setNome] = useState("");
    const [campo3, setDataNascimento] = useState("");
    const [campo4, setSexo] = useState("");

    const {register} = useForm();

    function Cliente(e) {
        e.preventDefault();
        
        api.post("/passageiros", {
            cpf:campo1,
            nome:campo2,
            dataNascimento:campo3,
            sexo:campo4
        }).then((resposta) => {
            if (resposta.status === 201) {
                alert("Usuario cadastrado com sucesso!")
            } else if (resposta.status === 401) {
                alert("Cliente já cadastrado")
            }
        }).catch((erro) => {
            console.log(erro)
        })
    }


    return (
        <>
            <form onSubmit={Cliente}>
                <div class="form-group">
                    <label>CPF</label>
                    <input type="number" class="form-control" id="cpfCliente" aria-describedby="cadastroCpfCliente" placeholder="CPF" required onChange={e => setCpf(e.target.value)}/>
                </div>
                <div class="form-group">
                    <label>Nome</label>
                    <input type="text" class="form-control" id="nomeCliente" aria-describedby="cadastroNomeCliente" placeholder="Informe nome e sobrenome" required onChange={e => setNome(e.target.value)}/>
                </div>
                <div class="form-group">
                    <label>Data de Nascimento</label>
                    <input type="date" class="form-control" id="dataNascimentoCliente" aria-describedby="cadastrodataNascimentoCliente" placeholder="Data de nascimento" required onChange={e => setDataNascimento(e.target.value)}/>
                </div>
                <div class="form-group">
                    <label>Sexo</label>
                    <select class="form-control custom-select my-1 mr-sm-2" id="sexoCliente" aria-describedby="cadastroSexoCliente" required onChange={e => setSexo(e.target.value)}>
                        <option value="" selected>Selecione...</option>
                        <option value="M">Masculino</option>
                        <option value="F">Feminino</option>
                    </select>
                </div>
                <button type="submit" class="btn btn-primary">Enviar</button>
            </form>
        </>
    )
}