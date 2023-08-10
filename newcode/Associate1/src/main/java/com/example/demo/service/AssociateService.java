package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Associate;
import com.example.demo.model.Skills;

public interface AssociateService {
Associate createAssociate(Associate associate);
List<Associate> getallassociate();
Associate findassociatebyid(int id);
String deleteassociatebyid(int id);
Associate updateassociate(int id,Associate a);
List<Associate>findbyassociatecountry(String country);
Associate FindByAssociateemail(String email);
Associate FindByAssociatemobile(String mobile);
List<Associate> FindByAssociateskillname(String skillname);
Associate updateAssociateByFirstName(int id,String name);
Associate updateAssociateByLastName(int id,String name);
Associate updateAssociateByEmail(int id,String email);
Associate updateAssociateBymobile(int id,String mobile);


}
