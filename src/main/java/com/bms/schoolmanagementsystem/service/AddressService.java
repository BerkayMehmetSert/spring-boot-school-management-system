package com.bms.schoolmanagementsystem.service;

import com.bms.schoolmanagementsystem.dto.AddressDto;
import com.bms.schoolmanagementsystem.dto.converter.AddressDtoConverter;
import com.bms.schoolmanagementsystem.dto.request.address.CreateAddressRequest;
import com.bms.schoolmanagementsystem.dto.request.address.UpdateAddressRequest;
import com.bms.schoolmanagementsystem.exception.address.AddressNotFoundException;
import com.bms.schoolmanagementsystem.helper.BusinessMessage;
import com.bms.schoolmanagementsystem.helper.LogMessage;
import com.bms.schoolmanagementsystem.model.Address;
import com.bms.schoolmanagementsystem.repository.AddressRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AddressService {
    private final AddressRepository addressRepository;
    private final StudentService studentService;
    private final AddressDtoConverter converter;

    public AddressService(AddressRepository addressRepository,
                          StudentService studentService,
                          AddressDtoConverter converter) {
        this.addressRepository = addressRepository;
        this.studentService = studentService;
        this.converter = converter;
    }

    public void createAddress(CreateAddressRequest request) {
        Address address = new Address();
        address.setStreet(request.getStreet());
        address.setCity(request.getCity());
        address.setState(request.getState());
        address.setZipCode(request.getZipCode());
        address.setStudent(studentService.findStudentByStudentId(request.getStudentId()));

        addressRepository.save(address);
        log.info(LogMessage.Address.AddressCreated());
    }

    public void updateAddress(String id, UpdateAddressRequest request) {
        Address address = findAddressByAddressId(id);

        address.setStreet(request.getStreet());
        address.setCity(request.getCity());
        address.setState(request.getState());
        address.setZipCode(request.getZipCode());

        addressRepository.save(address);
        log.info(LogMessage.Address.AddressUpdated(id));
    }

    public void deleteAddress(String id) {
        Address address = findAddressByAddressId(id);

        addressRepository.delete(address);
        log.info(LogMessage.Address.AddressDeleted(id));
    }

    public AddressDto findAddressById(String id) {
        Address address = findAddressByAddressId(id);

        log.info(LogMessage.Address.AddressFound(id));
        return converter.convert(address);
    }

    public List<AddressDto> findAllAddresses() {
        List<Address> addressList = addressRepository.findAll();

        if (addressList.isEmpty()) {
            log.error(LogMessage.Address.AddressListEmpty());
            throw new AddressNotFoundException(BusinessMessage.Address.ADDRESS_LIST_EMPTY);
        }

        log.info(LogMessage.Address.AddressListed());
        return converter.convert(addressList);
    }


    protected Address findAddressByAddressId(String id) {
        return addressRepository.findById(id)
                .orElseThrow(() -> {
                    log.error(LogMessage.Address.AddressNotFound(id));
                    throw new AddressNotFoundException(LogMessage.Address.AddressNotFound(id));
                });
    }
}
