package br.com.systemsgs.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Entity(name = "tb_pedido")
public class ModelPedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome deve ser Informado!")
    private String nome;

    @NotNull(message = "Produto não deve ser Nulo!")
    @Min(value = 1, message = "Minimo deve ser 1")
    private Long produto;

    @NotNull(message = "Valor não deve ser Nulo!")
    @Min(value = 1, message = "Valor deve ser maior que 0!")
    private BigDecimal valor;

    @NotNull(message = "Data não deve ser Nula!")
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date dataCompra;

    @CPF(message = "Cpf Inválido!")
    @NotBlank(message = "Cpf deve ser Informado!")
    private String cpfCliente;

    @NotBlank(message = "Cep deve ser Informado!")
    private String cep;

}
