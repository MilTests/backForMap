package net.bonvio.model;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("/status")
@Controller
public class PacketStatusController {
    private SecureRandom random = new SecureRandom();

    @RequestMapping(value = "getRandomStatuses")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Page<PacketStatus> generateLocation() {
        List<PacketStatus> list = new ArrayList<PacketStatus>();
        for (int i = 0; i < 10; ++i)
            list.add(new PacketStatus(new BigInteger(130, random).toString(32), new Date(), (int) (Math.random()) % 2 == 0, new BigInteger(130, random).toString(32)));
        return new Page<PacketStatus>(list, 1l * list.size());
    }
}