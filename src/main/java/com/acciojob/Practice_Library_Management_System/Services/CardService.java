package com.acciojob.Practice_Library_Management_System.Services;

import com.acciojob.Practice_Library_Management_System.Entities.LibraryCard;
import com.acciojob.Practice_Library_Management_System.Enums.CardStatus;
import com.acciojob.Practice_Library_Management_System.Repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    public String generateCard(){

        LibraryCard card = new LibraryCard();
        card.setCardStatus(CardStatus.NEW);
        card.setNoOfBookIssued(0);

        Date expiryDate = new Date(2028,6,1);
        card.setValidity(expiryDate);

        card = cardRepository.save(card);

//        return "The Library Card has been generated with cardID " + card.getCardNo();
    }

}
