package anjithsasindran.projectdemoanjith.helpers;

import java.util.ArrayList;

import anjithsasindran.projectdemoanjith.models.eventsmicrosite.Company;
import anjithsasindran.projectdemoanjith.models.eventsmicrosite.Data;
import anjithsasindran.projectdemoanjith.models.eventsmicrosite.Description;
import anjithsasindran.projectdemoanjith.models.eventsmicrosite.Person;
import anjithsasindran.projectdemoanjith.models.eventsmicrosite.Sections;
import anjithsasindran.projectdemoanjith.models.eventsmicrosite.Session;
import anjithsasindran.projectdemoanjith.parcelable.MicrositeDescription;
import anjithsasindran.projectdemoanjith.parcelable.MicrositeKeySpeakers;
import anjithsasindran.projectdemoanjith.parcelable.MicrositeSponsorsList;
import anjithsasindran.projectdemoanjith.parcelable.MicrositeTimeline;

/**
 * Created by Anjith Sasindran
 * on 23-Mar-16.
 * EventMicrositeDataHelper contains all the data needed for ViewPager in
 * EventMicrositeFragment. It returns an ArrayList of Objects.
 */
public class EventsMicrositeDataHelper {

    Sections sections;
    Description description;
    Company company;
    Person person;
    Session session;

    public ArrayList<Object> setupDataForViewPager(Data data) {
        ArrayList<Object> micrositeViewPagerDate = new ArrayList<>();
        sections = data.getSections();
        description = data.getDescription();
        company = data.getCompany();
        person = data.getPerson();
        session = data.getSession();
        micrositeViewPagerDate.add(setupKeySpeakers());
        micrositeViewPagerDate.add(setupTimeline());
        micrositeViewPagerDate.add(setupSponsorsList());
        micrositeViewPagerDate.add(setupDescriptionDetails());
        return micrositeViewPagerDate;
    }

    public MicrositeKeySpeakers setupKeySpeakers() {
        MicrositeKeySpeakers keySpeakers = new MicrositeKeySpeakers();
        keySpeakers.setFirstHeader(sections.get56ab1199748649729110373e().getTitle());
        keySpeakers.setFirstPara(sections.get56ab1199748649729110373e().getDescription());
        keySpeakers.setSecondHeader(description.get56ab12937486497291103742().getTitle());
        keySpeakers.setSecondPara(description.get56ab12937486497291103742().getDescription());
        keySpeakers.setThirdHeader(description.get56ab12a07486497291103743().getTitle());
        keySpeakers.setThirdPara(description.get56ab12a07486497291103743().getDescription());
        keySpeakers.setForthHeader(description.get56bc3e5f7486496a3d00000b().getTitle());
        keySpeakers.setForthPara(description.get56bc3e5f7486496a3d00000b().getDescription());
        keySpeakers.setFirstImage(person.get56ab127c7486497291103741().getImage().getOriginal());
        keySpeakers.setSecondImage(person.get56ab11ff748649729110373f().getImage().getOriginal());
        keySpeakers.setThirdImage(person.get56ab123e7486497291103740().getImage().getOriginal());
        keySpeakers.setForthImage(person.get56bc3ec47486496a3d00000c().getImage().getOriginal());
        return keySpeakers;
    }

    public MicrositeTimeline setupTimeline() {
        MicrositeTimeline timeline = new MicrositeTimeline();
        timeline.setFirstHeader(sections.get56af107b748649729110375e().getTitle());
        timeline.setFirstPara(sections.get56af107b748649729110375e().getDescription());
        timeline.setSecondHeader(description.get56c2c8017486496a3d000035().getTitle());
        timeline.setSecondPara(description.get56c2c8017486496a3d000035().getDescription());
        timeline.setThirdHeader(description.get56c2c8db7486496a3d000036().getTitle());
        timeline.setThirdPara(description.get56c2c8db7486496a3d000036().getDescription());
        timeline.setForthHeader(description.get56c2c9537486496a3d000038().getTitle());
        timeline.setForthPara(description.get56c2c9537486496a3d000038().getDescription());
        timeline.setTimelineHeader1(session.get56bb24ed7486496a3d000004().getTitle());
        timeline.setTimelinePara1(session.get56bb24ed7486496a3d000004().getDescription());
        timeline.setTimelineDate1(session.get56bb24ed7486496a3d000004().getStartingAt());
        timeline.setTimelineHeader2(session.get56c2ca557486496a3d00003c().getTitle());
        timeline.setTimelinePara2(session.get56c2ca557486496a3d00003c().getDescription());
        timeline.setTimelineDate2(session.get56c2ca557486496a3d00003c().getStartingAt());
        timeline.setTimelineHeader3(session.get56c2ca217486496a3d00003b().getTitle());
        timeline.setTimelinePara3(session.get56c2ca217486496a3d00003b().getDescription());
        timeline.setTimelineDate3(session.get56c2ca217486496a3d00003b().getStartingAt());
        timeline.setTimelineHeader4(session.get56c2c9907486496a3d000039().getTitle());
        timeline.setTimelinePara4(session.get56c2c9907486496a3d000039().getDescription());
        timeline.setTimelineDate4(session.get56c2c9907486496a3d000039().getStartingAt());
        timeline.setTimelineHeader5(session.get56c2c91d7486496a3d000037().getTitle());
        timeline.setTimelinePara5(session.get56c2c91d7486496a3d000037().getDescription());
        timeline.setTimelineDate5(session.get56c2c91d7486496a3d000037().getStartingAt());
        timeline.setTimelineHeader6(session.get56c2c9d97486496a3d00003a().getTitle());
        timeline.setTimelinePara6(session.get56c2c9d97486496a3d00003a().getDescription());
        timeline.setTimelineDate6(session.get56c2c9d97486496a3d00003a().getStartingAt());
        return timeline;
    }

    public MicrositeSponsorsList setupSponsorsList() {
        MicrositeSponsorsList sponsorsList = new MicrositeSponsorsList();
        sponsorsList.setFirstHeader(sections.get56ab12da7486497291103744().getTitle());
        sponsorsList.setFirstPara(sections.get56ab12da7486497291103744().getDescription());
        sponsorsList.setSecondHeader(description.get56ab12937486497291103742().getTitle());
        sponsorsList.setSecondPara(description.get56ab12937486497291103742().getDescription());
        sponsorsList.setThirdHeader(company.get56ab133d7486497291103746().getTitle());
        sponsorsList.setThirdPara(company.get56ab133d7486497291103746().getDescription());
        sponsorsList.setForthHeader(description.get56ab12a07486497291103743().getTitle());
        sponsorsList.setForthPara(description.get56ab12a07486497291103743().getDescription());
        sponsorsList.setFifthHeader(company.get56ab132a7486497291103745().getTitle());
        sponsorsList.setFifthPara(company.get56ab132a7486497291103745().getDescription());
        sponsorsList.setFirstImageUrl(company.get56ab133d7486497291103746().getImage().getOriginal());
        sponsorsList.setSecondImageUrl(company.get56ab132a7486497291103745().getImage().getOriginal());
        return sponsorsList;
    }

    public MicrositeDescription setupDescriptionDetails() {
        MicrositeDescription descriptionDetails = new MicrositeDescription();
        descriptionDetails.setFirstHeader(sections.get56ab113b748649729110373b().getTitle());
        descriptionDetails.setFirstPara(sections.get56ab113b748649729110373b().getDescription());
        descriptionDetails.setSecondHeader(description.get56ab1150748649729110373c().getTitle());
        descriptionDetails.setSecondPara(description.get56ab1150748649729110373c().getDescription());
        descriptionDetails.setThirdHeader(description.get56ab1161748649729110373d().getTitle());
        descriptionDetails.setThirdPara(description.get56ab1161748649729110373d().getDescription());
        return descriptionDetails;
    }
}