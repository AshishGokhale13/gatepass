package com.gatepass.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Standards {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
@Column(nullable = false,unique = true)
String standards;

@JsonBackReference
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="standards_id", referencedColumnName = "id")
List<WardenHasArea> wardenArea;


public Standards(int id, String standards) {
	super();
	this.id = id;
	this.standards = standards;
}

}
