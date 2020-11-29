package ru.serdce.services;

import org.springframework.stereotype.Service;
import ru.serdce.models.Field;
import ru.serdce.models.FieldConfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class FieldService {

  public static String[] fieldsToTrain = {"polIndexer","vozrast", "mesto_prozhivaniya_1_gorod_2_selo"
    , "semyaIndexer", "etnosIndexer", "natsionalnostIndexer", "religiyaIndexer", "obrazovanieIndexer"
    , "professiyaIndexer", "vy_rabotaete"
    , "ves", "rost", "stress_iz_za_finansIndexer", "depressiya", "dostatok_po_srav_s_drugIndexer", "tip_zhilyaIndexer"
    , "chislo_komnat", "kol_vo_chel_v_d_to_kh", "ekg_norma"
  };

  public static Map<String, String> diagnoz = new HashMap<>();
  {
    diagnoz.put("arterialnaya_gipertenziya", "Артериальная гипертензия");
    diagnoz.put("onmk", "ОНМК");
    diagnoz.put("stenokardiya_ibs_infarkt_miokarda", "Стенокардия, ИБС, инфаркт миокарда");
    diagnoz.put("serdechnaya_nedostatochnost", "Сердечная недостаточность");
    diagnoz.put("prochie_zabolevaniya_serdtsa", "Прочие заболевания сердца");
  }

  public static List<Field> getFields(String category) {
    List<Field> fields = new ArrayList<>();
    switch (category) {

//      Данные
      case "data":
        fields.add(new Field(
          "fio",
          "ФИО",
          "input",
          new FieldConfig("text",null)
        ));
        fields.add(new Field(
          "pol",
          "Пол",
          "selectbox",
          new FieldConfig("text", new String[]{"М", "Ж" })
          ));
        fields.add(new Field(
          "data_rozhdeniya",
          "Дата рождения",
          "input",
          new FieldConfig("date", null)
        ));
        fields.add(new Field(
          "vozrast",
          "Возраст",
          "input",
          new FieldConfig()
        ));
        fields.add(new Field(
          "mesto_prozhivaniya_1_gorod_2_selo",
          "Место проживания",
          "selectbox",
          new FieldConfig("text", new String[]{"Город", "Село" })
        ));
        fields.add(new Field(
          "hasDiagnostic",
          "Наличие диагноза",
          "checkbox",
          new FieldConfig()
        ));
        fields.add(new Field(
          "requiresAttention",
          "Требует внимания",
          "checkbox",
          new FieldConfig()
        ));
        fields.add(new Field(
          "isSick",
          "Болен",
          "selectbox",
          new FieldConfig("text", new String[] {"Болен", "Не болен", "Обследуется/На лечении"})
        ));
        break;

//      Анамнез жизни
      case "life":
        fields.add(new Field(
          "semya",
          "Семья",
          "selectbox",
          new FieldConfig("text", new String[] {"никогда не был(а) в браке", "в разводе", "в браке в настоящее время", "вдовец / вдова", "гражданский брак / проживание с партнером", "раздельное проживание (официально не разведены)"})
        ));
        fields.add(new Field(
          "etnos",
          "Этнос",
          "selectbox",
          new FieldConfig("text", new String[] {"европейская", "другая азиатская (Корея, Малайзия, Таиланд, Вьетнам, Казахстан, Киргизия, Туркмения, Узбекистан, Таджикистан)", "прочее (любая иная этно-расовая группа, не представленная выше)"})
        ));
        fields.add(new Field(
        "natsionalnost",
        "Национальность",
        "selectbox",
          new FieldConfig("text", new String[] {"Русские", "Татары", "Белорусы","Чуваши","Азербайджанцы","Удмурты","Немцы","Другие национальности","Эстонцы","Украинцы","Армяне","Мордва","Казахи","Киргизы","Лезгины","Башкиры","Таджики","Буряты","Евреи","Молдаване"})
        ));
        fields.add(new Field(
          "religiya",
          "Религия",
          "selectbox",
          new FieldConfig("text", new String[] {"Нет", "Христианство", "Ислам", "Атеист / агностик", "Индуизм", "Другое" })
        ));
        fields.add(new Field(
          "obrazovanie",
          "Образование",
          "selectbox",
          new FieldConfig("text", new String[] {"2 - начальная школа", "3 - средняя школа / закон.среднее / выше среднего", "4 - профессиональное училище", "5 - ВУЗ" })
        ));
        fields.add(new Field(
          "professiya",
          "Профессия",
          "selectbox",
          new FieldConfig("text", new String[] {"низкоквалифицированные работники", "служащие", "работники,  занятые в сфере обслуживания, торговые работники магазинов и рынков", "ведение домашнего хозяйства", "дипломированные специалисты", "операторы и монтажники установок и машинного оборудования", "квалифицированные работники сельского хозяйства и рыболовного", "ремесленники и представители других отраслей промышленности", "представители   законодат.   органов   власти,  высокопостав. долж.лица и менеджеры", "техники и младшие специалисты", "вооруженные силы"
          })
        ));
        fields.add(new Field(
          "vy_rabotaete",
          "Вы работаете?",
          "checkbox",
          new FieldConfig()
        ));
        fields.add(new Field(
          "ves",
          "Вес",
          "input",
          new FieldConfig("text", null)
        ));
        fields.add(new Field(
          "rost",
          "Рост",
          "input",
          new FieldConfig("text", null)
        ));
        fields.add(new Field(
          "stress_iz-za_finans.",
          "Стресс из-за финансового положения",
          "selectbox",
          new FieldConfig("text", new String[] {"нет ответа","незначительный","умеренный","сильный"
          })
        ));
        fields.add(new Field(
          "depressiya",
          "Депрессия",
          "checkbox",
          new FieldConfig()
        ));
        fields.add(new Field(
          "dostatok_po_srav_s_drug",
          "Достаток по сравнению с другими",
          "selectbox",
          new FieldConfig("text", new String[] {"очень низкий", "низкий", "средний", "относительно высокий", "очень высокий"
          })
        ));
        fields.add(new Field(
          "tip_zhilya",
          "Тип жилья",
          "selectbox",
          new FieldConfig("text", new String[] {"общежитие", "комната в коммунальной квартире", "квартира", "собственный дом"
          })
        ));
        fields.add(new Field(
          "chislo_komnat",
          "Число комнат",
          "input",
          new FieldConfig("text", null)
        ));
        fields.add(new Field(
          "kol_vo_chel_v_d_to_kh",
          "Кол-во чел в д/х",
          "input",
          new FieldConfig("text", null)
        ));
        break;

//      Анамнез заболевания
      case "disease":
        fields.add(new Field(
          "ekg_norma",
          "ЭКГ норма",
          "checkbox",
          new FieldConfig()
        ));
        break;

//      Инструментальное обследование
      case "instrumental":
        fields.add(new Field(
          "ekg_graph",
          "ЭКГ",
          "graph",
          new FieldConfig()
        ));
        fields.add(new Field(
          "eho_kg_graph",
          "ЭХО-КГ",
          "graph",
          new FieldConfig()
        ));
        break;

      default:
        break;
    }
      return fields;
  }

//  public String[] fieldForML() {
//    List<Field> fieldList = getFields("data");
//    fieldList.addAll(getFields("life"));
//
//    return (String[]) fieldList.stream()
//      .map(Field::getFieldName)
//      .toArray();
//  }
}
