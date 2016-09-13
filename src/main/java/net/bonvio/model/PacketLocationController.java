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

@RequestMapping("/location")
@Controller
public class PacketLocationController {
    private SecureRandom random = new SecureRandom();

    @RequestMapping(value = "getRandomLocations")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Page<PacketLocation> generateLocation() {
        List<PacketLocation> list = new ArrayList<PacketLocation>();
        for (int i = 0; i < 10; ++i)
            list.add(new PacketLocation(new BigInteger(130, random).toString(32), new Date(), 56 + Math.random(), 44 + Math.random(), (int) (Math.random() * 17) + 1.0));
        return new Page<PacketLocation>(list, 1l * list.size());
    }
}