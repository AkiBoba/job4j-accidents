package ru.job4j.accidents.service;

import org.springframework.stereotype.Service;
import ru.job4j.accidents.model.AccidentType;
import ru.job4j.accidents.model.Rule;
import ru.job4j.accidents.repository.RuleHibernate;
import ru.job4j.accidents.repository.RuleRepository;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class AccidentRuleService {

    private final RuleRepository accidentRuleRep;

    public AccidentRuleService(RuleRepository accidentRuleRep) {
        this.accidentRuleRep = accidentRuleRep;
    }

    public Collection<Rule> getRules() {
        var result = new ArrayList<Rule>();
        for (var rule : accidentRuleRep.findAll()) {
            result.add(rule);
        }
        return result;

    }

    public Rule getById(int ruleId) {
        return accidentRuleRep.findById(ruleId).orElseGet(null);
    }
}
